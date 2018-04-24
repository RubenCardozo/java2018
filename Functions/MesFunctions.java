package cours.Functions;

import java.time.LocalDate;
import cours.Abstract.Chien;
import cours.Abstract.*;
import java.time.Month;
import java.time.Period;

public class MesFunctions {

    public static void main(String[] args) {
        Boite bc = new Boite();
        bc.Ouvrir();
        bc.Fermer();

        OuvertureRapide bor = new BoiteRapide();
        bor.Ouvrir();
        bor.Fermer();

        Ouvrable oa = new Ouvrable() {
            int valeur = 15;

            private void test() {
                System.out.println("valeur = " + valeur);
            }

            ;
            @Override
            public void Ouvrir() {
                System.out.println("J'ouvre l'objet de la class anonyme");
                test();
            }
        };
        oa.Ouvrir();
        oa.Fermer();

        Chien anom = new Chien("medor") {
            @Override
            public LocalDate getDateDeces() {
                return LocalDate.now().minusMonths(2);
            }

            @Override
            public void setNom(String nom) {
                super.setNom(nom.toUpperCase());
            }
        };
        anom.setNom("medor");

        System.out.println(anom.getNom());

        Ouvrable oa2 = () -> {
            System.out.println("J'ouvre l'objet lambda");
        };
        oa2.Ouvrir();

        OuvertureRapide or = () -> {
            System.out.println("je jette l'objet lambda en " + Ouvrable.TEMPSDEFERMATURE + " sec.");
        };

        or.Ouvrir();
        or.Jeter();

        OuvertureRapide or2 = ()-> System.out.println("je jette l'objet lambda en " + Ouvrable.TEMPSDEFERMATURE + " sec.");
        
        Calculable addition = new Calculable(){
            @Override
            public double Calcul(double i , double j){
                return i+j;
            }
        };
       
        Calculable division=(double i, double j)-> {return i/j;}; 
        Calculable soustraction=(double i, double j)-> i-j;
        Calculable multiplication=(i , j)-> i*j;
        
        System.out.println("Addition= "+ addition.Calcul(10, 20));
        System.out.println("Division= "+ division.Calcul(10, 20));
        System.out.println("Soustraction= "+ soustraction.Calcul(10, 20));
        System.out.println("Multiplication= "+ multiplication.Calcul(10, 20));
        
        System.out.println("\n*********************Moyenne Age****************************");
        
        Animal PapaOurs= new Animal("papours"){
            @Override
            public LocalDate getDateDeces() {
                return null;
            }

            @Override
            public LocalDate getNaissance() {
                return LocalDate.of(2000, Month.OCTOBER, 10); 
            }
        };
        
        Animal MamaOurs= new Animal("mamours"){
            @Override
            public LocalDate getDateDeces() {
                return null;
            }

            @Override
            public LocalDate getNaissance() {
                return LocalDate.of(2004, Month.JUNE, 20); 
            }   
        };
        
        
        
        CalculableAge moyenne = (Animal a1, Animal a2)-> {
        int ageA1 = Period.between(a1.getNaissance(), LocalDate.now()).getYears();
        int ageA2 = Period.between(a2.getNaissance(), LocalDate.now()).getYears();
        return (ageA1 + ageA2)/2;
        };
        
        int agePa= Period.between(PapaOurs.getNaissance(), LocalDate.now()).getYears();
        int ageMa = Period.between(MamaOurs.getNaissance(), LocalDate.now()).getYears();
        System.out.println("Age de papa ours: "+ agePa+" ans");
        System.out.println("Age de mama ours: "+ ageMa+" ans");
        System.out.println("Difference de age: "+(agePa-ageMa)+" ans");
        System.out.println("Moyenne: "+moyenne.Calcul(PapaOurs, MamaOurs)+" ans");
        
    }  

}
