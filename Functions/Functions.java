
package cours.Functions;


public class Functions {
    public static void main(String[] args) {
        Boite bc= new Boite();
        bc.Ouvrir();
        bc.Fermer();
        
        OuvertureRapide bor = new BoiteRapide();
        bor.Ouvrir();
        bor.Fermer();
    }
}
