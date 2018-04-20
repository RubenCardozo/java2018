
package cours;

import autre.PubC;

public class PubA {
    public static void main(String[] args) {
        new PubA().priMA();
        new PubA().MA();
        new PubA().pubMA();
        
        DefB db = new DefB();
        //db.priMB;//private
        db.MB();//Acces package
        
        PubC pc = new PubC();
        //pc.MC();//acces package
        pc.pubMC();//acces public
        
        //DefD dd = new DefD();//Access Default, impossible de instancier à partir d'autre package
        
        
    }
    void MA(){
        
    }
    
    public void pubMA(){
        
    }
    
    private void priMA(){
        
    }
}
