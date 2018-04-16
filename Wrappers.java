
package cours;

import javafx.scene.transform.Transform;

public class Wrappers {
    public static void main(String[] args) {
        
        Double d= new Double("45.2D");
        double ds= Double.parseDouble("152.3D");
        
        int i= Integer.parseInt("145");
        i= Integer.parseInt("CAFE",16);
        //i = 0xcafe;
        System.out.println(i);
        
        Long lL= Long.decode("0x123456");
        System.out.println(lL);
        
        Integer in= Integer.valueOf("145");
        System.out.println(in);
        
        Integer ins = 45;
        //i = ins.intValue();
        int io = new Integer(15);
        
        
        
        double dd = new Integer(15);
        //Double ddo = new Integer(15);//Operation impossible
        Double ddo = (double)new Integer(15);
        
        Integer it = new Integer(15);//instanciation
        int dt= it.intValue();//methode de conversion
        double ddt=(double) dt;//conversion elargissante
        Double dddt = new Double(ddt);//instanciation
        
        byte by= 10;
        //Integer iii= by;
        Integer iii= (int)by;
        
        Affiche(10);//byte, short, int, char, Integer, Byte, Short, Character.
        Affiche(iii);//Integer, int.
        
        Do(10);
    }
    
    static void Affiche(int i){
    
    }

    static void Affiche2(Integer i){
    
    }
    
    static void Do(int... i){
    
    }
    
    static void Do(Integer i){
    
    }
}

