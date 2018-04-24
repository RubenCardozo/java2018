
package cours.Abstract;

import java.time.LocalDate;

public class Chien extends Animal{

    public Chien(String nom) {
        super(nom);
    }
    
    

    @Override
    public LocalDate getDateDeces() {
       return null;
    }

   
    
}
