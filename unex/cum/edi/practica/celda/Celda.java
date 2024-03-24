package es.unex.cum.edi.practica.celda;

public abstract class Celda{
    /**
    * Classe Celda de practica final
    * @author: Illia Bilyi
    * @version: practica final 1
     */

    protected int fila;
    protected int columna;
    protected int estado; // -1 -> mina, 0 -> no hay minas cerca, 1 -> 1 mina cerca, 2 -> 2 minas cerca
    
    /**Constructor por defecto Celda*/
    public Celda(){
       this.fila = 0;
       this.columna = 0;
       this.estado = 0;
    }
    
    /**Constructor parametrisado
     * @param fila variable del classe Celda fila (int)
     * @param columna variable del classe Celda columna (columna)
     * */
    public Celda(int fila, int columna){
        this.fila = fila;
        this.columna = columna;
        this.estado = 0;
    }
    
    /**Getter para variable fila
     * @return fila (int)
     * */
    public int getFila(){
        return this.fila;

    }
    
    /**Getter para variable cloumna
     * @return columna (int)
     * */
    public int getColumna(){
        return this.columna;

    }
    
    /**Getter para variable estado
     * @return estdao (int)
     * */

    public int getEstado(){
        return this.estado;

    }
    
    /**Setter para variable fila
     * @param fila (int)
     * */
    public void setFila(int fila){
        this.fila = fila;

    }

    /**Setter para variable columna
     * @param columna (int)
     * */
    public void setColumna(int columna){
        this.columna = columna;

    }

    /**Setter para variable estado
     * @param estado (int)
     * */

    public void setEstado(int estado){
        this.estado = estado;
    }
    
    /**Equala 2 objetos
     * @return (boolean)
     * */
    @Override
    public boolean equals(Object o){
        Celda c = (Celda) o;

        return c.fila == this.fila
               && c.columna == this.columna
               && c.estado == this.estado;
    }

    /**toString da informacion sobre classe
     * @return info sobre classe (String)
     * */
    @Override
    public String toString(){
        return "Celda[fila=" + this.fila + ",columna="+ this.columna +",estado="+ this.estado +"]";
    }

}
