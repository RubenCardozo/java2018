
package cours;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;


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
        //Collections.sort(als);
        als.sort(null);
        als.add("EEEEE");
        List<String>ls= als.subList(1, 4);
        System.out.println(als);
        System.out.println(ls);
        ls.remove("CCCCC");
        ls.add("DEDED");
        System.out.println("ls="+ls);//[BBBBB, DDDDD, DEDED]
        als.remove("DEDED");
        System.out.println(als);//[AAAAA, BBBBB, DDDDD, EEEEE]
        //System.out.println(ls);
        als.add("FFFFF");
        System.out.println(als);//[AAAAA, BBBBB, DDDDD, EEEEE, FFFFF]
        ls= als.subList(1, 4);//Il faut recreer la liste
        //System.out.println("ls="+ls);
        System.out.println("A".compareTo("a"));
        System.out.println("à".compareTo("a"));
       
        als.clear();
        als.add("A"); als.add("b"); als.add("à"); als.add("B"); als.add("C");
        System.out.println(als);
        als.sort(new MyStringComparer());
        System.out.println(als);
        
        ArrayList <Double> ald = new ArrayList<Double>();
        
        ald.add(new Double(12.2));
        
        
        
    }
   
        
    }
            

 class MyStringComparer implements Comparator<String>{

        @Override
        public int compare(String o1,String o2) {
            //return o1.compareToIgnoreCase(o2);
            //return String.CASE_INSENSITIVE_ORDER.compare(o1, o2);
            //return o1.toLowerCase().compareTo(o2.toLowerCase());
            return o1.toLowerCase(Locale.FRENCH).compareTo(o2.toLowerCase(Locale.FRENCH));
        }
 }
