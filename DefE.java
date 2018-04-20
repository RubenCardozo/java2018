
package cours;

import autre.PubC;


public class DefE extends PubC{
     void ME(){
         pubMC();
         new PubC().pubMC();
         //MC();//acces package
         //new PubC().proMC();!!Attention access protected impossible à partir de un neuf objet.
         proMC();//access protected directament s'est possible d'acceder
         super.proMC();
         
     }
}
