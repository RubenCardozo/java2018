
package cours;


class Util {
    int w;
    static int v;//Champ de class ou variable de class
    static int getV(){
        return v;
        //return v+ new Util().w;//On peut acceder "w" à partir de un neuf objet(instance)
        //return v+w;//impossible d'utiliser 
    }
    int getW(){
        
        return w;//On peut utiliser les variable d'instance et de classe
    }
}
