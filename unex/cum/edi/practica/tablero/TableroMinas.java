package es.unex.cum.edi.practica.tablero;


import java.util.Random;

public class TableroMinas extends Tablero{    
    /**
     * */

    private int numMaximo;
    
    /**Constructor por defefcto TableroMinas*/
    public TableroMinas(){
        super();
        this.numMaximo = 0;
        this.inicializar();

    }

    /**Constructor TableroMinas
     * @param fila (int)
     * @param columna (int)
     * */
    public TableroMinas(int fila, int columna){
        super(fila, columna);
        numMaximo = 0;
        this.inicializar();
        repartir();

    }

    /**Constructor TableroMinas 
     * @param fila (int)
     * @param columna (int)
     * @param max (int)
     * */
    public TableroMinas(int fila, int columna, int max){
        super(fila, columna);
        numMaximo = max;
        this.inicializar();
        this.repartir();

    }

    /**Setter numero de minas
     * @param max
     * */
    public void setNumMaximo(int max){
        this.numMaximo = max;
    }

    /**Getter numero de minas
     * @return numMaximo (int)
     * */
    public int getNumMaximo(){
        return this.numMaximo;
    }

    /**Setter para flag en matrice de objectos CeldaMinas
     * @param fila (int)
     * @param columna (int)
     * @param flag (boolean)
     * */
    public void setFlag(int fila, int columna, boolean flag){
        ((es.unex.cum.edi.practica.celda.CeldaMinas)this.tablero[fila][columna]).setFlag(flag);
    }

    /**Getter de flag en matrice de objectos CeldaMinas
     * @param fila (int)
     * @param columna (int)
     * @return flag (boolean)
     * */
    public boolean getFlag(int fila, int columna){

        return ((es.unex.cum.edi.practica.celda.CeldaMinas)this.tablero[fila][columna]).getFlag();
    }
    
     /**Setter para descubierta en matrice de objectos CeldaMinas
     * @param fila (int)
     * @param columna (int)
     * @param descubierta (boolean)
     * */
    public void setDescubierta(int fila, int columna, boolean descubierta){
        ((es.unex.cum.edi.practica.celda.CeldaMinas)this.tablero[fila][columna]).setDescubierta(descubierta);
    }

    /**Getter de descubierta en matrice de objectos CeldaMinas
     * @param fila (int)
     * @param columna (int)
     * @return descubierta (boolean)
     * */
    public boolean getDescubierta(int fila, int columna){

        return ((es.unex.cum.edi.practica.celda.CeldaMinas)this.tablero[fila][columna]).getDescubierta();
    }

        
    /**Set aleatoriamente las minas en tabla de CeldasMinas*/
    @Override
    public void repartir(){
        Random  random = new Random();
        int i=0;
        int fila = random.nextInt(this.numFilas);
        int columna = random.nextInt(this.numColumnas);

        while(i < this.numMaximo){

            if(this.tablero[fila][columna].getEstado() == 0){
                this.tablero[fila][columna].setEstado(-1);
                i++;

            }

            fila = random.nextInt(this.numFilas);
            columna = random.nextInt(this.numColumnas);


        }
           
    }

    /** Inicializar los objetos CeldaMinas en una matrice tablero*/
    @Override
    public void inicializar(){
        for(int i=0; i < this.numFilas; i++){
            
            for (int j=0; j < this.numColumnas; j++){

                this.tablero[i][j] = new es.unex.cum.edi.practica.celda.CeldaMinas(i, j);

            }
        }
    }

    /** Mostrar celdas CeldaMinas*/
    @Override
    public void mostrar(){
         for (int i=0; i < this.numFilas; i++){

            for(int j=0; j < this.numColumnas; j++){

                if (((es.unex.cum.edi.practica.celda.CeldaMinas)this.tablero[i][j]).getDescubierta()){
                    System.out.print(this.tablero[i][j].toString() + " ");

                }else if (((es.unex.cum.edi.practica.celda.CeldaMinas)this.tablero[i][j]).getFlag()){
                    System.out.print("🚩 ");

                }else{
                    System.out.print("- ");

                }
                
            }

            System.out.println();

        }


    }


}
