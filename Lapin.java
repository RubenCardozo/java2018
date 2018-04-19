
package cours;

class Lapin extends Lievre{

    private String proprietaire;
    
    public Lapin(String nom) {
        super(nom);
    }

    public Lapin(int age, String nom) {
        super(age, nom);
    }
    
    public String getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }
    
    @Override
    public boolean isMajeur() {
        return getAge()>2;
    }

    @Override
    public Lapin getFrere(Lievre l) {
        return new Lapin("");
    }
    
}