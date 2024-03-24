package es.unex.cum.edi.practica.tablero;

import java.util.Scanner;

public class JuegoMinas extends Juego{
    public TableroMinas t;
    public JuegoMinas(){
        t = new TableroMinas();
    }
    public JuegoMinas(int filas, int columnas){
        t = new TableroMinas(filas, columnas);
    }
    @Override
    public boolean verSiFin(){
        int maxPosibles = this.t.getNumFilas() * this.t.getNumColumnas() - this.t.getNumMaximo(); // celdas descubiertas para salir (no son minas)
        int descubiertas = 0;
        for(int i=0; i < this.t.numFilas; i++){

            for (int j=0; j < this.t.numColumnas; j++){

                if (this.t.getEstado(i, j) == -1 && this.t.getDescubierta(i, j)){
                    System.out.println("La mina fui tocada");
                    return true;

                }else if(this.t.getDescubierta(i, j)){
                    descubiertas ++;

                    if (descubiertas == maxPosibles){
                        System.out.println("Todas celdas fueron abiertas (excepto minas)");
                        return true;
                            
                    }

                }
            }

        }
        return false;

    }

    @Override
    public void jugar(){
        Scanner scanner = new Scanner(System.in);
        int fila, columna;
        char c_char; 

        while(!this.verSiFin()){
            this.t.mostrar();
            System.out.println("La fila: ");
            fila = scanner.nextInt();

            System.out.println("La columna: ");
            columna = scanner.nextInt();

            System.out.println("Cambiamos la celda de posicion (fila="+ fila  + ", columna=" + columna  + ")");
            c_char = scanner.next().charAt(0);
            c_char = Character.toLowerCase(c_char);

            this.resolver(c_char, fila, columna);


        }

    }

    @Override
    public void resolver(char s, int f, int c){

        switch(s){
            // crear la mina
            case 'm':
                t.setEstado(f, c, -1);
                break;
            
            // poner el flag
            case 'f':

                if (t.getFlag(f, c)){

                    t.setFlag(f, c, false);
                }else{

                    t.setFlag(f, c, true);
                }
                break;

            // hacer la vacia
            case 'v':
                t.setEstado(f, c, 0);
                break;

            // descubrir la celda
            case 'd':
                t.setDescubierta(f, c, true);
                break;

            default:
                System.out.println("Este command no existe");

        }

    }

}
