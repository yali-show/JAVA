package es.unex.cum.edi.practica;

import es.unex.cum.edi.practica.tablero.JuegoMinas;

public class Main {

    public static void main(String[] aaaaa){
        // Vamos ir probando si funcionan las minas random etc.

        JuegoMinas juego = new JuegoMinas(10, 10, 100);
        juego.jugar();


    }
}
