package es.unex.cum.edi.practica.celda;

public class CeldaRaya extends Celda{
     /**
     * Classe CeldaRaya extende de classe Celda de practica final
     * @author: Illia Bilyi
     * @version: practica final 1
     */


    private int color;
    
    /**Constructor por defecto de CeldaRaya classe*/
    public CeldaRaya(){
        super();
        color = 0;

    }
    
     /**Constructor parametrisado de CeldaRaya
     * @param fila variable del classe CeldaRaya fila (int)
     * @param columna variable del classe CeldaRaya columna (columna)
     * */

    public CeldaRaya(int fila, int columna){
        super(fila, columna);
        color = 0;
    }
    
    /**Setter para variable color
     * @param color (int) */

    public void setColor(int color){
        this.color = color;

    }
    
    /**Getter para variable color 
     * @return color (int)
     * */
    public int getColor(){
        return this.color;
    }

    /**Equala 2 objetos
     * @return (boolean)
     * */
    @Override
    public boolean equals(Object o){
        CeldaRaya c = (CeldaRaya) o;

        return super.equals(o) && this.color == c.color;

    }

    /**toString da informacion sobre classe
     * @return info sobre classe (String)
     * */
    @Override
    public String toString(){
        return "CeldaRaya[color="+ this.color+"]";
    }



}
