package es.unex.cum.edi.practica.tablero;

public abstract class Juego{

    /** Constructor por defecto Juego*/
    public Juego(){
 

    }
    
    /** Saber si jugador gano o perdi o sique jugando*/
    public abstract boolean verSiFin();

    /** Empezar el procaeso de juego*/
    public abstract void jugar();
    
    /** Analizar los datos puestos*/
    public abstract void resolver(char s, int fila, int columna);

}
