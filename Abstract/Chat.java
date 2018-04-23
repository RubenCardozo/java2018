
package cours.Abstract;

import java.time.LocalDate;

public class Chat extends Animal implements Gentil{
    
    public Chat(String nom) {
        super(nom);
    } 

    @Override
    public LocalDate getDateDeces() {
        return null;
    }

    @Override
    public int getNiveau() {
        return 10;
    }
    
}
