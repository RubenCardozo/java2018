/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours;

class Lutte {
    final int i=50;
    final int j;
    
    final static int CONSTANTE=100000;
    final static int AUTRE_CONSTANTE;
    static {
        AUTRE_CONSTANTE=10000;
    }
    Lutte(){
        j=40;
    }
    Lutte(int z){
        z+=1;
        j=z;  
    }
    Lutte(final Lapin l){
        l.setAge(12);
        j=50;
    }

    final int getI(){
     return i;
    }
    static final int getJ(){
        return CONSTANTE*10;
    }
}
