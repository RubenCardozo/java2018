
package cours;

public class DefF extends DefB{
    void MF(){
        pubMB();
        MB();//acces package
        new DefB().MB();
    }
}
