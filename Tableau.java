
package cours;

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
    }
}
