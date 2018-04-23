
package cours.Functions;


class Boite implements Ouvrable, Fermable{

    @Override
    public void Ouvrir() {
        System.out.println("J'ouvre la boite");
    }

    @Override
    public void Fermer() {//implementation obligatoire malgré le default
        Ouvrable.super.Fermer();//appel au code de la super-interface
        System.out.println("mais pas si facilement");
    }
    
}
