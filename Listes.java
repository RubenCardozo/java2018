
package cours;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listes {
    public static void main(String[] args) {
        
        ArrayList al = new ArrayList();
        
        ArrayList<String> als = new ArrayList<String>();
        als.add("AAAAA");
        
        als.ensureCapacity(20);
        als.add(0,"BBBBB");
        
        System.out.println(als.get(0));
        System.out.println(als.size());
        System.out.println(als);
        
        System.out.println(als.indexOf("AAAAA"));
        System.out.println(als.lastIndexOf("AAAAA"));
        String old= als.set(1, "CCCCC");//return le vieu element
        System.out.println(als);
        als.add(old);
        System.out.println(als);
        als.remove("BBBBB");
        als.remove(1);
        
        als.add("DDDDD");
        als.add("BBBBB");
        als.add("AAAAA");
        System.out.println(als);
        
        ArrayList<String> als2 =new ArrayList<String>();
        als2.add("AAAAA");
        als2.add("BBBBB");
        als2.add("EEEEE");
        als2.add("FFFFF");
        
        //als.addAll(als2);//[CCCCC, DDDDD, BBBBB, AAAAA, AAAAA, BBBBB, EEEEE, FFFFF]
        
        //als.removeAll(als2);//[CCCCC, DDDDD]
        //als.retainAll(als2);// Partie commun [BBBBB, AAAAA]
        Collections.sort(als);
        als.add("EEEEE");
        List<String>ls= als.subList(1, 4);
        System.out.println(als);
        System.out.println(ls);
        ls.remove("CCCCC");
        ls.add("DEDED");
        System.out.println(als);
        
    }
            
}
