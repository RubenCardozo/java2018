
package cours;

import java.util.Arrays;
import java.util.List;
import static java.lang.Math.*;

class Init {
    double d= E;
    static int j;
    static{
        int z=30;
        j+=z;
        System.out.println("static init j= "+j);
    }
    
    int i;
    {
        i+=75;
        System.out.println("init init i= "+i);
    }
    Init(){
        i-=5;
        j+=100;
        System.out.println("ctor init i= "+i);
        System.out.println("ctor init j= "+j);
        List<Integer> li = Arrays.asList(i,j);
    }
    {
        i+=25;
        System.out.println("init 2 init i= "+i);
    }
    
}
