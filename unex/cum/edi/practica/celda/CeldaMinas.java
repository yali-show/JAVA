package es.unex.cum.edi.practica.celda;

public class CeldaMinas extends Celda{
     /**
     * Classe CeldaMinas extende de classe Celda de practica final
     * @author: Illia Bilyi
     * @version: practica final 1
     */


    private boolean descubierta;
    private boolean flag;

    /**Constructor por defecto de CeldaMinas classe*/
    public CeldaMinas(){
        super();
        descubierta = false;
        flag = false;

    }
    
     /**Constructor parametrisado de CeldaMinas
     * @param fila variable del classe CeldaMinas fila (int)
     * @param columna variable del classe CeldaMinas columna (columna)
     * */

    public CeldaMinas(int fila, int columna){
        super(fila, columna);
        descubierta = false;
        flag = false;
    }
    
    /**Setter para variable descubierta
     * @param descubierta (boolean) */

    public void setDescubierta(boolean descubierta){
        this.descubierta = descubierta;

    }
    
    /**Getter para variable descubierta 
     * @return descubierta (boolean)
     * */
    public boolean getDescubierta(){
        return this.descubierta;
    }

    /**Setter para variable flag
     * @param flag (boolean) */

    public void setFlag(boolean flag){
        this.flag = flag;

    }
    
    /**Getter para variable flag
     * @return descubierta (boolean)
     * */
    public boolean getFlag(){
        return this.flag;
    }


    /**toString CeldaMinas
     * @return info sobre classe(String)
     * */
    @Override
    public String toString(){
       return String.valueOf(this.estado); 
    }

    /**Equals CeldaMinas
     * @param o object para comporar(Object)
     * @return egual o o no (boolean)
     * */
    @Override 
    public boolean equals(Object o){
        CeldaMinas c = (CeldaMinas) o;
        return super.equals(o) && this.descubierta == c.descubierta;

    }


}
