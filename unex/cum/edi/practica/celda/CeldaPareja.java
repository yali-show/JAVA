package es.unex.cum.edi.practica.celda;

public class CeldaPareja extends Celda{
     /**Classe CeldaMinas extende de classe Celda de practica final
     * @author: Illia Bilyi
     * @version: practica final 1
     */


    private int valor;
    
    /**Constructor por defecto de CeldaPareja classe*/
    public CeldaPareja(){
        super();
        valor = 0;

    }
    
     /**Constructor parametrisado de CeldaPareja
     * @param fila variable del classe CeldaMinas fila (int)
     * @param columna variable del classe CeldaMinas columna (columna)
     * */

    public CeldaPareja(int fila, int columna){
        super(fila, columna);
        valor = 0;
    }
    
    /**Setter para variable valor
     * @param valor (int) */

    public void setValor(int valor){
        this.valor = valor;

    }
    
    /**Getter para variable valor 
     * @return valor (boolean)
     * */
    public int getValor(){
        return this.valor;
    }

    /**Equala 2 objetos
     * @return (boolean)
     * */
    @Override
    public boolean equals(Object o){
        CeldaPareja c = (CeldaPareja) o;
        return super.equals(o) && this.valor == c.valor;
 
    }

    /**toString da informacion sobre classe
     * @return info sobre classe (String)
     * */
    @Override
    public String toString(){
        return "CeldaPareja[valor="+this.estado +"]";
    }



}
