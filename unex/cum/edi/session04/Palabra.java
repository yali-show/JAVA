package es.unex.cum.edi.session04;

import java.io.*;


public class Palabra{
    private String texto;
    private int longitud;
    private String pista;


    public Palabra(){
                                                            
        texto="";
        longitud=0;
        pista="";
                                                                                                                        
    }


    public Palabra(String t, int l, String p){
        texto = t;
        longitud = texto.length();
        pista = p;

    }
                                                    
    public Palabra(String t, String p){
        texto = t;
        longitud = texto.length();
        pista = p;

    }                                                                                            
                                                            

    public String getTexto(){
        return texto;
    }          

                                                                    public int getLongitud(){
                                                                                    return longitud;
                                                                                            }
                                                                            
                                                                            public String getPista(){
                                                                                            return pista;
                                                                                                    }
                                                                                                                    
                                                                                                        
                                                                                    public void setTexto(String t){
                                                                                                    texto = t;  
                                                                                                            }
                                                                                                                    
                                                                                            public void setLongitud(int l){
                                                                                                            longitud = l;                              
                                                                                                                                                        
                                                                                                                    }
                                                                                                                                
                                                                                                    public void setPista(String p){
                                                                                                                    pista = p;
                                                                                                                            }
                                                                                                                                                
                                                                                                            
                                                                                                            public String toString(){
                                                                                                                            String result= "Palabra[texto=" + texto + ", pista=" + pista + ", longitud=" + longitud + "]";
                                                                                                                                        return result;
                                                                                                                                                }
                                                                                                                    
                                                                                                                    public boolean equals(Palabra p){
                                                                                                                                    
                                                                                                                                    if (texto == p.getTexto()
                                                                                                                                                        & longitud == p.getLongitud()
                                                                                                                                                                    & pista == p.getPista()){
                                                                                                                                                        
                                                                                                                                                        return true;
                                                                                                                                                                        
                                                                                                                                                                    }else{
                                                                                                                                                                                        
                                                                                                                                                                                        return false;
                                                                                                                                                                                                    }
                                                                                                                                                
                                                                                                                                                
                                                                                                                                            }
                                                                                                                            
                                                                                                                            public boolean checkIfExistLetterInText(char l){
                                                                                                                                            int max = texto.length();
                                                                                                                                                        
                                                                                                                                                        for (int i=0; i<max; i++){
                                                                                                                                                                            
                                                                                                                                                                            if (texto.charAt(i) == l){
                                                                                                                                                                                                    
                                                                                                                                                                                                    return true;
                                                                                                                                                                                                                    }
                                                                                                                                                                                            
                                                                                                                                                                                        }
                                                                                                                                                                    
                                                                                                                                                                    return false;
                                                                                                                                                                                
                                                                                                                                                                            }
                                                                                                                                    
                                                                                                                                    public int countVowels(){
                                                                                                                                                    int max = texto.length();
                                                                                                                                                                int count=0;
                                                                                                                                                                            
                                                                                                                                                                            for (int i=0; i<max; i++){
                                                                                                                                                                                                
                                                                                                                                                                                                if (texto.charAt(i) == 'a'
                                                                                                                                                                                                                        || texto.charAt(i) == 'e'
                                                                                                                                                                                                                                        || texto.charAt(i) == 'y'
                                                                                                                                                                                                                                                        || texto.charAt(i) == 'u'
                                                                                                                                                                                                                                                                        || texto.charAt(i) == 'o'
                                                                                                                                                                                                                                                                                        || texto.charAt(i) == 'i'){
                                                                                                                                                                                                                        
                                                                                                                                                                                                                        count ++;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                
                                                                                                                                                                                                            }
                                                                                                                                                                                        
                                                                                                                                                                                        return count;
                                                                                                                                                                                                    
                                                                                                                                                                                                }
                                                                                                                                            
                                                                                                                                            public boolean checkIfAllVowels(){
                                                                                                                                                            boolean all = true;
                                                                                                                                                                        int max = texto.length();
                                                                                                                                                                                    
                                                                                                                                                                                    for (int i=0; i<max; i++){
                                                                                                                                                                                                        
                                                                                                                                                                                                        if (texto.charAt(i) != 'a'
                                                                                                                                                                                                                                & texto.charAt(i) != 'e'
                                                                                                                                                                                                                                                & texto.charAt(i) != 'y'
                                                                                                                                                                                                                                                                & texto.charAt(i) != 'u'
                                                                                                                                                                                                                                                                                & texto.charAt(i) != 'o'
                                                                                                                                                                                                                                                                                                & texto.charAt(i) != 'i'){
                                                                                                                                                                                                                                
                                                                                                                                                                                                                                all = false;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                        
                                                                                                                                                                                                                    }
                                                                                                                                                                                                return all;
                                                                                                                                                                                                            
                                                                                                                                                                                                            
                                                                                                                                                                                                        }
                                                                                                                                                        
                                                                                                                                                
                                                                                                                                                                                                    
}

