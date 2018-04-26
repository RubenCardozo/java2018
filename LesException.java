package cours;

import cours.ExceptionClass.*;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class LesException {

    public static void main(String[] args) {
        
        try {
            Metier();
        } catch (Exception ex) {
             if (ex.getCause()!=null) {
                System.err.println("Cause metier = "+ex.getCause().getMessage());
            }
            System.out.println("GUI = "+ex.getMessage());
        }
  
    }
    
    
    static void Metier() throws MetierException{
        try {
            Dal();
        } catch (Exception mex) {
            if (mex.getCause()!=null) {
                System.err.println("Cause dal = "+mex.getCause().getMessage());
            }
            throw new MetierException("Creation de fichier impossible.",mex);
        }
    }
        
    static void Dal() throws DalException {
        try {
            File.createTempFile("Tempo", "\\1iti");
        }catch (IOException ioex) {
            throw new DalException("pas de creation de fichier.",ioex);
        }
    }

    
    
    private static void Danger() {
        try {
            CreerFichier2();
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

        try {
            Piege();
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        
        try {
            FauxPiege();
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        try {
            Nounours();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        
        try {
            SuperVillain();
        } catch (IOException iex) {
            System.err.println(iex.getMessage());
        } catch (SQLException iex) {
            System.err.println(iex.getMessage());
        }
        
        try {
            SuperVillain();
        } catch (Exception ex){
            System.err.println(ex.getMessage());
        }
        
        try {
            DocStrange();
        } catch (Throwable ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    static void CreerFichier() {
        try {
            File.createTempFile("tempo", "titi");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void CreerFichier2() throws IOException {
        File.createTempFile("tempo", "titi");
    }

    static void Nounours() throws RuntimeException {
        int i = 15 / 0;
    }

    static void Piege() throws IOException {
        if (false) {
            throw new IOException("Warning!!!!");
        }
    }
    
    static void FauxPiege() throws IOException {
    }

    static void SuperVillain() throws IOException, SQLException{
    
    }
    
    static void DocStrange() throws Throwable{//Summum de la dangerosité
    }
    
    static void Hulk() throws Error{
    }
    
    private static void runtime() {

        try {
//            if(calcul(12f, 0f)==Float.POSITIVE_INFINITY)
//            {
//                System.out.println("Buzz");
//            }
            // calcul(12f, 0);
            //calcul(10.0, 0);
            calcul(10D, 0);
        } catch (ArithmeticException ae) {
            System.out.println("calcul planté " + ae.getMessage());
        } catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println("pas assez de chiffres, planté " + aie.getMessage());
        } catch (RuntimeException ex) {
            System.err.println("oups...." + ex.getMessage());
            // ex.printStackTrace();
            Stream.of(ex.getStackTrace()).forEach((t) -> System.err.println(t.getMethodName()));
            System.exit(0);
            //return;
        } catch (Exception ex) {
            System.out.println("oups...." + ex.getMessage());
        } finally {
            System.out.println("fin");
        }
        try {
            calcul(10D, 0);
        } finally {
            System.out.println("fin quoiqu'il arrive");
        }

//        catch(RuntimeException ex)
//        {
//            if(ex.getClass()== ArithmeticException.class){
//                
//            }
//            //calcul(5, 0);
//            System.out.println("planté "+ex.getMessage()  );
//        }
        System.out.println("fin");

    }

    static float calcul(int i, int j) {
        return i / j;
    }

    static float calcul(float i, float j) {
        if (j == 0) {
            throw new ArithmeticException("sorry");
        }
        return i / j;
    }

    static double calcul(double... td) {
        if (td[0] == 10) {
            throw new UnsupportedOperationException("oups!");
        }
        if (td[1] == 0) {
            throw new ArithmeticException("oups!");
        }
        return td[0] / td[1];
    }

}
