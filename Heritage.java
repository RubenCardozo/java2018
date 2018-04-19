
package cours;

import java.util.Scanner;

public class Heritage {
    
    public static void main(String[] args) {
        
        Lievre[] terrier =  new Lievre[4];
        Object ol = new Lievre(null);
        terrier[0] = new Lievre(null);
        terrier[1] = terrier[0];
        terrier[2] = new Lapin(null);
        terrier[3 ]= (Lievre)ol;
        
        for (Lievre lievre : terrier) {
            lievre.setAge(2);
            System.out.println(lievre.isMajeur());
        }
        
    }
    
    private static void Simple(){
     Lapin L1=new Lapin(null);
        Lapin L2= new Lapin(null);
       
        L1.setAge(10);
        L2.setAge(5);
        
        System.out.println( L1.getAge());
        System.out.println( L2.getAge());
        
        Lievre LI1=new Lievre(null);
        LI1.setNom("Devine");
        LI1.setAge(3);
        
        Lievre ll= new Lapin(null);
        ll.setAge(2);//appelle Lievre.setAge
        System.out.println(ll.isMajeur());//appelle Lapin.isMajeur
        System.out.println(ll.toString());//appelle Object.toString
        Object ola = new Lapin(null);
        Object oli = new Lievre(null);
        
        if (ll instanceof Lapin && ll!=null) {
            ((Lapin)ll).setProprietaire("Dupont");//On peut changer le type declaratif à Lapin, mias pas l'objet. 
        }
        if (ola instanceof Lievre) {//vrai
            System.out.println(((Lievre)ola).getNom());
        }
        
        if (oli instanceof Lapin) {//faux
            System.out.println(((Lapin)oli).getNom());
        }
        
        if (ll.getClass().getSimpleName().equals("Lapin")){//vrais
            System.out.println(ll.getClass().getName());
        }
        Class c= ll.getClass();
        
        if (c==Lievre.class) {//faux
            System.out.println(Lievre.class);
        }
    }
}
