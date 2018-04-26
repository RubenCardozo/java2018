
package cours;

import java.lang.*;

public class LesException {
    
    public static void main(String[] args) {
        
        try {
//            if (calcul(12f, 0f)==Float.POSITIVE_INFINITY) {
//                System.out.println("Buzz");
//            }
        //calcul(5f, 0f);
        //calcul(10.0, 0);
        calcul(15);
        }catch (RuntimeException ex) {
            //calcul(5, 0);
            System.err.println("Planté:"+ex.getMessage());
            
        }
        
        System.out.println("fin");
    }
    
    
    static float calcul(int i, int j){
        return i/j;
    }
    
    
    static float calcul(float i, float j){
        if (j==0) {
            throw new ArithmeticException("\t Division pour zero impossible");
        }
        return i/j;
    }
    
     static double calcul(double...td){
        if (td[1]==0) {
            throw new ArrayIndexOutOfBoundsException("\t L'index du tableau n'est pas utilisé");
        }
        return td[0]/td[1];
    }
    
    
}
