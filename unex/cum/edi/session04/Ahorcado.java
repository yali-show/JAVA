package es.unex.cum.edi.session04;
import es.unex.cum.edi.session04.Palabra;

public class Ahorcado{
    
    Palabra[] lista;      // conjunto de palabras para seleccionar una y jugar
    Palabra seleccionada; // palabra seleccionada
    private int intentos; // intentos para jugar 
    private int max;   // max intentos para perder

    

    /*contructor por defecto*/    
    public Ahorcado(){
        // init vars 

        seleccionada = null;
        lista = new Palabra[10];
        max = 5;
        intentos = 0;

    }
    
    /*constructor parametrizado*/
    public Ahorcado(Palabra[] l, Palabra p, int i, int m){
        // init paramatrizado

        lista = l;
        seleccionada = p;
        intentos = i;
        max = m;

    }
    
    /*conctructor parametrizado con size de lista y maximo*/
    public Ahorcado(int t, int m){
        lista = new Palabra[t];
        max = m;
        seleccionada = null;
        intentos = 0;


    }

    
    //getters


    /*getter para var sellecionada: Palabra*/
    public Palabra getSelecccionada(){

        return seleccionada;
    }
    
    /*getter para var max: int*/
    public int getMax(){

        return max;
    }
    
    /*getter para var intentos: int*/
    public int getIntentos(){
        return intentos;
    }
    
    /*gettter para var lista: Palabra[]*/
    public Palabra[] getLista(){

        return lista;
    }



    //setters


    /*seter para var seleccionada: Palabra (p: Palabra)*/
    public void setPalabra(Palabra p){

        seleccionada = p;

    }

    /*setter para var intentos: int (i: int)*/
    public void setIntentos(int i){
        intentos = i;

    }

    /*setter para var max: int (m: int)*/
    public void setMax(int m){
        max = m;

    }

    /*setter para var lista: Palabra[] (l_p: Palabra[])*/
    public void setLista(Palabra[] l_p){
        lista = l_p;
        
    }
    
    /*Anadir palabras: Palabra to list: Palabra[] si hay espacio*/
    public boolean addPalabra(Palabra p){

        for (int i=0; i < lista.length; i++){

            if(lista[i] == null){
                lista[i] = p;
                return true;

            }
        }

        return false;
        
        

    }
    

    /*devuelve true si t: String equal al texto de seleccionada: Palabara, seleccionada.getTexto(): String */
    public boolean findText(String t){
        if(seleccionada.getTexto().equals(t)){
            return true;
        }

        return false;

    }
    
    /*devuelve amount de palabras con impar amount de letras*/
    public int countEvenSize(){
        int count=0;

        for(Palabra i: lista){
            if (i.getTexto().length() % 2 != 0){
            
                count ++;
            
            }

        }

        return count;

    }


    /*devuelve true si seleccionada: Palabra esta en lista: Palabara[]*/
    public boolean hasSeleccionada(){
        for(Palabra i: lista){
            if(i.equals(seleccionada)){
                return true;
            
            }

        }

        return false;

    }

    /*to string method to have vars data*/
    public String toString(){

        return "Ahorcado[intentoActual=" + intentos + " maximo de Intento=" + max + "]"; 
    }
}
