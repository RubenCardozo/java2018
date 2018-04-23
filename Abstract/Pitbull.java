
package cours.Abstract;

import java.time.LocalDate;

public class Pitbull extends Chien implements Reglemente{

    private LocalDate declaration;
    
    public Pitbull(String nom, LocalDate declaration) {
        super(nom);
        if (declaration!= null) {
            this.declaration = declaration;
        }
        
    }
    
    @Override
    public LocalDate getDeclaration() {
            return this.declaration;
    }

    @Override
    public float getNiveau() {
        return 8;
    }
}
