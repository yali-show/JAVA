package es.unex.cum.edi.practica.tablero;
  

public abstract class Tablero{
    /**Classe abstracto Tablero para controlar los objetos Celda*/

    protected int numFilas;
    protected int numColumnas;
    protected es.unex.cum.edi.practica.celda.Celda[][] tablero;
    
    /** Constructor por defecto para Tablero*/
    public Tablero(){
        this.numFilas = 0;
        this.numColumnas = 0;
        this.tablero = new es.unex.cum.edi.practica.celda.Celda[0][0];
        

    }
 
   /** Constructor parametrizado para Tablero
    * @param filas (int)
    * @param columnas (int)
    * */
    public Tablero(int filas, int columnas){
        this.numFilas = filas;
        this.numColumnas = columnas;
        this.tablero = new es.unex.cum.edi.practica.celda.Celda[filas][columnas];
    }
    
    /**Setter para numero de filas en matrice de objectos Celda
     * @param fila (int)
     * */
    public void setNumFilas(int fila){
       this.numFilas = fila;
    }

    /**Getter de numaero de filas en matrice de objectos Celda
     * @return fila (int)
     * */
    public int getNumFilas(){
        return  this.numFilas;
    }
    
     /**Setter para numero de columnas en matrice de objectos Celda
     * @param columna (int)
     * */
    public void setNumColumnas(int fila){
       this.numFilas = fila;
    }

    /**Getter de numaero de columnas en matrice de objectos Celda
     * @return fila (int)
     * */
    public int getNumColumnas(){
        return  this.numColumnas;
    }


    /**Setter para estado en matrice de objectos Celda
     * @param fila (int)
     * @param columna (int)
     * @param estado (int)
     * */
    public void setEstado(int fila, int columna, int estado){
       this.tablero[fila][columna].setEstado(estado);
    }

    /**Getter de estado en matrice de objectos Celda
     * @param fila (int)
     * @param columna (int)
     * @param estado (int)
     * */
    public int getEstado(int fila, int columna){

        return tablero[fila][columna].getEstado();
    }

    /**Getter de Celda de matrice de objectos Celda
     * @param fila (int)
     * @param columna (int)
     * @return (Celda)
     * */
    public es.unex.cum.edi.practica.celda.Celda getCelda(int fila, int columna){
        return this.tablero[fila][columna];

    }
    
    /** Inicializar los objectos Celda en matrice de Celda*/
    abstract void inicializar();
    
    /** Poner aliatoriamente los estados de celdas*/
    abstract void repartir();
    
    /** Mostrar los estados celdas (tablero)*/
    abstract void mostrar();

}
