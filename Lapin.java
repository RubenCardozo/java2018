
package cours;

class Lapin extends Lievre{

    private String proprietaire;
    
    public Lapin(String nom) {
        this(nom, 0, null);
    }

    public Lapin( String nom, int age) {
        this(nom, age, null);
    }

    public Lapin( String nom, int age, String proprietaire) {
        super(nom, age);
        this.setProprietaire(proprietaire);
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