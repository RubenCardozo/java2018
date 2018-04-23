
package cours.Functions;

import static cours.Functions.Ouvrable.*;


public interface OuvertureRapide extends Ouvrable{
    int TEMPSDEFERMATURE=2;
    
    @Override
    default void Fermer(){
        System.out.println("Peut se fermer en " + TEMPSDEFERMATURE +" sec"); 
    }

    @Override
    default void Ouvrir(){
        System.out.println("Peut s'ouvrir en " + Ouvrable.getTempsDeFermature()/2+" sec");
    }
    
}
