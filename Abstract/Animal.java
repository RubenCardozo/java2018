
package cours.Abstract;

import java.time.LocalDate;

public abstract class Animal extends EtreVivant implements DateNaissence{
    
    String nom;
    
    public String getNom() {
        return nom;
    }
    

    public void setNom(String nom) {
        this.nom = nom;
    }
    

    public Animal (String nom) {
        this.nom = nom;
    }

    @Override
    public LocalDate getNaissance() {
        return DateNaissence.MAXDATE;
    }
    
    public abstract LocalDate getDateDeces();
    
    public int Age(LocalDate dNais, LocalDate auj){
        
     return 0;
    }
}
