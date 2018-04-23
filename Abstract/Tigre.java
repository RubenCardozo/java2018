
package cours.Abstract;

import java.time.LocalDate;

class Tigre extends Animal implements Dangereux, Sauvage{

    public Tigre(String nom) {
        super(nom);
    }

    @Override
    public LocalDate getDateDeces() {
       return null;
    }

    @Override
    public float getNiveau() {
        return 10;
    }
}
