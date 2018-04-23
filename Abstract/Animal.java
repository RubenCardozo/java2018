
package cours.Abstract;

abstract class Animal {
    
    String nom;
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    

    public Animal(String nom) {
        this.nom = nom;
    }
    
    
}
