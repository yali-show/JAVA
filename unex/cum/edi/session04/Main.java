package es.unex.cum.edi.session04;

import es.unex.cum.edi.session04.Ahorcado;
import es.unex.cum.edi.session04.Palabra;
import java.util.*;

public class Main{
    public static void main(String[] aaaaaa){
        Ahorcado a = initAh();

        palabrasSet(a.getLista());
        System.out.println(a.toString());
        showTexto(a.getLista());
        


    }

    public static Ahorcado initAh(){

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int m = s.nextInt();
        s.close();

        return new Ahorcado(t, m);

    }


    public static void palabrasSet(Palabra[] p_list){
        Scanner s = new Scanner(System.in);

        for(int i=0; i < p_list.length; i++){
            String txt = s.nextLine();
            String pst = s.nextLine();

            p_list[i].setTexto(txt);
            p_list[i].setPista(pst);


        }
        
        s.close();

    }

    public static void showTexto(Palabra[] p_list){

        for(Palabra p: p_list){
            System.out.println(p.getTexto());

        }

    }

    public static void sumaOfLen(Palabra[] p_list){
        int suma = 0;

        for(Palabra p: p_list){
            
            suma += p.getTexto().length();
        }

        System.out.println(suma);


    }

}
