
package cours;

class Lievre {
    
    private int age;//champ ou variable d'instance.
    private String nom; //champ ou variable d'instance.  

    public boolean isMajeur() {
        return age>1;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    /***
     * Récupere l'age du lievre
     * @return l'age du lievre
     */
    public int getAge(){//Methode d'instance.
        return this.age;//this = objet, ma variable d'instance.
    }
    
    /**
     * Methode qui permet de donner l'age du lievre
     * @param age doit être positif
     */
    public void setAge(int age){//Methode d'instance.
        if (age<0 || age>99) {
            throw new RuntimeException("Mauvais age pour le lapin >0 et < 99");
        }
        this.age = age;
    }
}
