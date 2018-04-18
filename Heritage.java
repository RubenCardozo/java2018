
package cours;

import java.util.Scanner;

public class Heritage {
    public static void main(String[] args) {
        
        Lapin L1=new Lapin();
        Lapin L2= new Lapin();
       
        L1.setAge(10);
        L2.setAge(5);
        
        System.out.println( L1.getAge());
        System.out.println( L2.getAge());
        
        Lievre LI1=new Lapin();
        LI1.setNom("Devine");
        LI1.setAge(3);
        
        Lievre ll= new Lapin();
        Object ola = new Lapin();
        Object oli = new Lapin();
        
        if (ll instanceof Lapin && ll!=null) {
            ((Lapin)ll).setProprietaire("Dupont");
        }
        System.out.println("Comandes: S (Saisir)");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }
}
