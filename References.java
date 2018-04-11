
package cours;

public class References {
    
    public static void main(String[] args) {
        Personne p = new Personne();
        Personne r = p;
        r.id=1;
        p.nom=null;
        r=null;
        ChangeNomEnBond(p);
        //ChangeNomEnMonde(r);//Inutile
        r=ChangeRayMonde();
        
        System.out.println("Reference p= "+p.nom +", "+p.id);
        System.out.println("Reference r= "+r.nom +", "+r.id);
        
    }  
    
    static void ChangeNomEnBond(Personne pr){
        pr.nom="Bond";
    }
    
    static void ChangeNomEnMonde(Personne pr){//Inutile
        pr = new Personne();
        pr.nom="Raymonde";
    }
    
    static Personne ChangeRayMonde(){//Factory de objets
        Personne pr = new Personne();
        pr.nom="Raymonde";
        return pr;
    } 
}


 class Personne{
        int id;
        String nom ="anonyme";
    }