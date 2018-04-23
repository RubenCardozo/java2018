
package cours.Functions;

public interface Ouvrable {
    
    void Ouvrir();
    
    default void Fermer(){
        System.out.println("Peut se fermer");
        
    };
}
