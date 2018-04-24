
package cours.Functions;


@FunctionalInterface
public interface Ouvrable {
    
    void Ouvrir();
    int TEMPSDEFERMATURE =10;
    
    default void Fermer(){
        System.out.println("Peut se fermer en "+getTempsDeFermature()+" sec.");  
    }
    
    static int getTempsDeFermature(){
        return TEMPSDEFERMATURE;
    }
}
