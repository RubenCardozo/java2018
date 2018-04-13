
package cours;

public class MonTableau {
    public static void main(String[] args) {
       
        int  max = 6;
        int [][] tab = new int[max][];
        int compteur=1;
        
            for (int i = 0; i < tab.length/2; i++){
                tab [i]= new int[i+1];
                tab [max-i-1]= new int[i+1]; 
                 for (int j =1 ; j < tab[i].length; j++) {
                    tab [i][j]= compteur;
                    tab [max-i-1][j]= compteur*2;
                    compteur++;
                }
            }
            
           

            for (int[] ti : tab) {
                for(int m : ti){
                    System.out.println(m);
                }
            }
    }
}
            
            
        
//        int r = 0;
//        int r2 = 0;
//        int v =1;
//        int[][] tab = new int[3][];
//                
//        for (int t = 0; t < tab.length; t++) { //0 à 3
//
//            for (int taille = 0; taille < tab.length; taille++) { //0 à 3
//                
//                tab[t][taille] = v ;
//                r = tab[t][taille];
//                
//                //r2 = (tab2[t][taille]) * 2;
//                
//                System.out.println(r +"= "+r2+" ");
//                v++;
//            }
            //System.out.println(r+" "+r2);    
    //}
        
//     static void maMethode(int a, int b){
//        int r = 0;
//        //int r2 = 0;
//        int[][] tab2 = new int[1][6];
//
//        for (int i = 0; i < tab2.length; i++) {
//
//            for (int l = 0; l < 6; l++) {
//                tab2[i][l] = l + 1;
//                r = tab2[i][l];
//                //r2 = (tab2[i][l]) * 2;
//                if ((l%3)==0) {
//                    System.out.println(r);
//                }
//            }
//
//            //System.out.println(r+" "+r2);
//        }
    //}

