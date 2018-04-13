
package cours;

public class References {
    
    public static void main(String[] args) {
        Personne p = new Personne();
        Personne r = p;
        r.id=1;
        p.nom=null;
        r=null;
        ChangeNomEnBond(p);
        System.out.println(p.nom);
        //ChangeNomEnMonde(r);//Inutile
        r=ChangeRayMonde();
        
        //System.out.println("Reference p= "+p.nom +", "+p.id);
        //System.out.println("Reference r= "+r.nom +", "+r.id);
        
        String petit = "e2n petit";
        petit = petit.toUpperCase();
        
        
        StringBuilder sb = new StringBuilder(24);
        sb.append(petit);
        for (int i = 0; i < 3; i++) {
            sb.append(" OK") ;
            //System.out.println(sb.toString());
        }
        
        petit = sb.toString();
        //System.out.println(petit);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("abcde").append("fghij").insert(5, "  ").replace(9,11,"");
        //System.out.println(sb2);
        
        String d="chaine";
        String e="chaine";
        String f =new String("chaine");
        
        d=d.toLowerCase();
        d=d.trim();
        
        
        System.out.println(d==e);//true
        System.out.println(d==f);//false
        
        
        d="Chaine";
        f="Chaine";
        System.out.println(d==f);//true
        
        
        d="chaine";
        f=f.toLowerCase();
        System.out.println(d==f);//false
        System.out.println(d.equals(f));//true
        
        
        StringBuilder sb3 = new StringBuilder("chaine");
        System.out.println(d.equals(sb3));//false
        StringBuilder sb4 = new StringBuilder("chaine");
        System.out.println(sb3.equals(sb4));//false
        System.out.println(sb3.toString().equals(sb4.toString()));//true
        
        System.out.println("*********************************");
        
        Object o = "lapin";
        String s = "lapin";
        System.out.println(o.equals(s));
        System.out.println(String.valueOf(10).equals("10")); 
        
        System.out.println(String.format("%f est different de %s", 4.12, "quatro"));
        System.out.println(String.format("%2$s est different de %1$s", 4.12, "quatro"));
         System.out.println(String.format("%(,20.3f ", -12_000_000.2_546));
         System.out.println("*********************************");
         int [] ti = {4,5,6};
         System.out.println(somme(1,2,ti));
         System.out.println(somme(4,5,6));
         System.out.println(somme(1,2));
         System.out.println(somme(10,20,ti));
        
    }  
    static int somme (int p, int d, int... tabi){//varargs
        int res = d+p;
        for (int i = 0; i < tabi.length; i++) {
            res += tabi[i];
        } 
        return res;
    }
    static int somme (int p, int d, int t){
        int res = d+p+t;
        return res;
    }
    
    static void ChangeNomEnBond(Personne pr){
        pr.nom="Bond";
    }
    
    static void ChangeNomEnMonde(Personne pr){//Inutile
        pr = new Personne();
        pr.nom="Raymonde";
    }
    
    static Personne ChangeRayMonde(){//Factory de objets de type Personne
        Personne pr = new Personne();
        pr.nom="Raymonde";
        return pr;
    } 
}

 class Personne implements Comparable<Personne>{
        int id;
        String nom ="anonyme";
    
    public Personne() {
    }
     
    public Personne(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }   

    @Override
    public String toString() {
        return "Personne: {" + "id= " + id + ", nom= " + nom + '}';
    }

    @Override
    public int compareTo(Personne p) {
        return (this.id > p.id ? 1 : 
                  (this.id == p.id ? 0: 
                    -1));
    }
    
    @Override
    public boolean equals(Object p){
        if (p instanceof Personne) {
            return ((Personne)p).compareTo(this)==0;
        }
        return false;
    }  
}