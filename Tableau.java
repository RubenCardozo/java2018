
package cours;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tableau {
    public static void main(String[] args) {
        double[] td0 = {};
        double[] td1 = null;
        double[] td2 = {4d,5D,6.0};
        
        double[][] ttd0={td0,td1,td2,{7d,8d,9.0}};
        td2=new double[4];
        td1=td2;
        System.out.println(ttd0[2][1]==5);
        ttd0=null;//3 objets elligibles au GC (lui,vieux td2, ttd0[3])
        //System.out.println(ttd0[3][1]);
        
        double[][] ttd1=new double[4][5];
        System.out.println(ttd1.length);
        
        
        double[][] ttd2= new double[4][];//4 tableau null
        ttd2[0]=new double[]{1,2,3};
        ttd2[2]=new double[4];
        double[]ttd3[] ; double ttd4 [][];
        
        Object[] tos = new String[3];
        Object to = new String[3];
        
        ((Object[])to)[0]="toto";
        
        System.out.println("**********************************");
        double[] td3 = {10d, 2d, 8d, 4d, 5d, 6.0, 12d};
        System.out.println(Arrays.binarySearch(td3,4d)); // pas trié error
        System.out.println(Arrays.binarySearch(td3,3,6,4d));// trié trouvé
        
        Arrays.sort(td3);
        System.out.println(Arrays.toString(td3));//
        System.out.println(Arrays.binarySearch(td3,4d));//trié ok -> 2
        System.out.println(Arrays.binarySearch(td3,7d));//trié ok -> -5 (-Position théorique)
        
        double[] td4= Arrays.copyOf(td3, td3.length*2);
        double[] td5= Arrays.copyOfRange(td4, 4,9);
        System.out.println(Arrays.toString(td4));
        System.out.println("CopyOfRange "+Arrays.toString(td5));
        System.arraycopy(td4,3,td3,0,4);
        System.out.println(Arrays.toString(td3));
        
        Arrays.fill(td5, 10d);
        double[] td6= Arrays.copyOf(td5,td5.length);
        System.out.println(td5==td6);//false
        System.out.println(td5.equals(td6));//false
        System.out.println(Arrays.equals(td5, td6));//true
        
        Personne[] tp= new Personne[5];
        tp[0] =new Personne(1, "AAAA");
        tp[1] =new Personne(5, "CCCC");
        tp[2] =new Personne(15,"BBBBB");
        tp[3] =new Personne(10,"FFFFF");
        tp[4] =new Personne(18,"EEEEE");
        //System.out.println(tp[0].toString());
        //System.out.println(String.valueOf(tp[0]));
        
        Arrays.sort(tp);
        System.out.println(Arrays.toString(tp));
        System.out.println(Arrays.binarySearch(tp, new Personne(10,"FFFFF")));
        
        Personne[] tp2= Arrays.copyOfRange(tp, 0, 5);
    }
}
