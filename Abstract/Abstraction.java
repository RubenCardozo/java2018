
package cours.Abstract;

import java.time.LocalDate;
import java.time.Month;

public class Abstraction {
    public static void main(String[] args) {
        
        Animal t= new Tigre("gros minou");
        
        System.out.println(t.getNom());
        
        Dangereux td= new Tigre("autre gros minou");
        if(td instanceof Animal){
            System.out.println(((Animal)td).getNom());
        }
        
        Dangereux d = new Pitbull("TRex",LocalDate.now());
        if(d instanceof Animal){
            System.out.println(((Animal)d).getNaissance());
        }
        
        //Dangereux od=(Dangereux)d;
        
        //Object og =(Gentil)d; cours.Pitbull cannot to cours.Gentil
        //Dangereux dc = (Dangereux)new Chien("");    
    } 
}

