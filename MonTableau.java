
package cours;

public class MonTableau {
    public static void main(String[] args) {
       
        System.out.println(maMethode(1,6));
       
    }
    static int[] maMethode(int a, int b){
        int[][] t0={};
        int [] t1={};
        int res =0;
        for (int i = 0; i < b+1; i++) {  
          t0[i]= new int[]{a+i};
          t1 = t0[i];
          res = t1[i];
        }
        return t1;
    }
}
