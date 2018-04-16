package cours;

import java.util.Date;
import java.util.Random;

public class Itta {

    public static void main(String[] args) {

        int[] tabi = {8, 6, 4, 2, 0, -2};
        byte b=12;
        //for (int i = 0; i < tabi.length; i++) {
        /*Partie initialisation; partie condition entrée et continuation de la boucle; et la partie fin boucle*/
        //}
        // int i;
        // for (i=0;i<10;i++) System.out.println(i); System.out.println(i);
        System.out.println("*******Boucle For************");
        for (int j = 0; j < tabi.length; j++) {
            System.out.print(tabi[j]+", ");
        }

        System.out.println("\n*****************************");
        for (int j = tabi.length - 1; j > -1; j--) {
            System.out.print(tabi[j]+", ");
        }

        System.out.print("\n*******Boucle While************\n");
        int j = 0;
        while (j < tabi.length/*condition entrée et continuation*/) {

            System.out.print(tabi[j]+", ");
            j++;
        }
        
        System.out.println("\n*****************************");
        j = 0;
        if (j<tabi.length) {
            while (true/*condition entrée et continuation*/) {

            System.out.print(tabi[j]+", ");
            j++;
                if (j>=tabi.length) {
                    break;
                }
            } 
        }
       
        System.out.print("\n*******Boucle Do - While************\n");
        j = 0;
        if (j<tabi.length) {
            do{
                System.out.print(tabi[j]+", ");
                j++;
            }
        
            while (j< tabi.length/*condition entrée et continuation*/);
        }
        
        
        System.out.println("\n************Double boucle for*****************");
        
        for (int k = 0; k < 5; k++) {
            int l=0;
            for (l=0; l < 3; l++) {
                System.out.print(k+" - "+l+", ");
            }
             System.out.println(" k*l= "+k*l); 
        }
        
        System.out.println("\n*****************************");
        boolean arret = false;
         for (int k = 0; k < 5 && arret==false; k++) {
            for (int l=0; l < 5; l++) {
                if (k*l>10) {
                    arret = true;
                    break;
                }
                System.out.println(k+" - "+l+", ");
            }  
        }
         
        final int z =3;
        int v =3;
        switch (v){
            default : 
                System.out.println("autre");
            break;
            
            case 1 : 
                System.out.println("un");
            break;
            
            case 2 : 
                System.out.println("deux");
            break;
            
            case z : 
                System.out.println("trois");
            break; 
        }
        boolean bo= false;
        if ( bo = true) {
            System.out.println("Toujour vrai");
        }
         if ( !bo /* bo== false*/) {
            System.out.println("?????????");
        }
        int r=0xA; byte b=10; double d=9.9999_999_999_999_999D;
        System.out.println(r==b);
        System.out.println(r==d);
        ++r;
        if (r == 11) {
            System.out.println(r+" == "+r);
        }
        else
            System.out.println(r+" != "+12);
        System.out.println(2 + 5 * 3 );//priorité * et /
        System.out.println(5 >> 2);//Opérateurs numeriques pouse a gauche deux position
        System.out.println(5 & 2);//0
        System.out.println(5 | 2);//7
        
        r=10;
        System.out.println(r==10 || ++r==10);//true //chorte code
        System.out.println(r);
        
        r=10;
        System.out.println(r==10 | ++r==10);//true
        System.out.println(r);//10
        
        r=10;
        System.out.println(r==10 && ++r==10);//false //chort code
        System.out.println(r);//10
        
        r=10;
        System.out.println(r==11 && ++r==10);//false //chort code
        System.out.println(r);//10
        
        r=10;
        System.out.println(r==11 & ++r==10);//false
        System.out.println(r);//11
        
        r=10;
        System.out.println(r==10 ^ ++r==10);//true
        System.out.println(r);//11
        
        r=10;
        System.out.println(r==10 ^ ++r==11);//false
        System.out.println(r);//11
        
        long l = (r=45);//45
        
        l= r>12 ? 13: 11;//l=13
        //l= r>12 ? 13: 11.5;//Ne compile pas car l est long et un de resultat possible est un double.
        l= r==12 ? 13 : r < 25 ? 35 : 52;//l=52
        System.out.println(l);
        l= r==12 ? 13 : ++r < 25 ? 35 : --r > 25 ? 65 : 52;//65
        System.out.println(l);
        
        System.out.println("***************Tableau*****************");
        
        for (int w : tabi) {
            //System.out.println(w);
            w+=1;//
            if (w <= 2)
                    break;
        }
        
        
        int index = 0;
        for (int w : tabi) {
            tabi[index++]++;//tout va bien
            System.out.println(w);
            
        }
        System.out.println("********************************");
        
        for (int k = 0; k < 20; k++) {
            if (k%2==0) 
                continue;
            System.out.println("K= "+k);
            
            if (k>=10) {
                break;
            }
              
        }
        
        System.out.println("********************************");
        for (int k = 0; k < 10; k++) {
            for (int m = 0; m < 10; m++) {
                if (m*k %3 ==0) 
                    continue;
                System.out.print("k*m= "+ k*m +", ");    
            }
            System.out.println(" ");
        }
        
    
        System.out.println("");   
    }

    
    private static void CaseEtAll() {
        byte b = 25;
        short s = 26;
        //b=s;//illegal variable
        b = (byte) s;
        //System.out.println(b);

        s = b;
        final int fs = 127; // sealed, const
        byte bs = fs;
        int r, r1 = 10, r2 = 20;//!!! r pas initialisé
        r1 = addition(r1, r2);
        System.out.println(r1);
        int[] ti;
        boolean[] tj;
        ti = new int[5];
        tj = new boolean[]{true, false, true};
        tj[0] = tj[1];
        int[] tk = {0, r1, r2};
        addition2(tk);
        System.out.println(tk[0]);
    }

    public static void simplevar() {
        // les types primitifs ont unt valeur et aucune méthode
        byte b;
        short s;
        int i;
        long l;// types primitifs numeriques
        float f;
        double d; //Types primitifs à virgule
        boolean bo; //Type primitif boolean
        char c; //Type primitif charactère

        bo = true;
        bo = false;

        b = -128;
        b = 127;//byte va de -128 à 127 valeur en bits(01111111)

        b++;//-128 valeur en bits (10000000)

        s = 32767;
        s++;
        i = 2147483647;
        i = i + 1;

        //b=b+1; //Invalide car le resultat donne des int avec tous les operators(+ - * /)
        System.out.println(i);//-2147483648 le resultat passe à negatif

        long lo = 2500000000000000000L;

        int z = 017;//octal
        System.out.println(z);

        lo = 0xCAFE_BABAL;//hexadecimal
        System.out.println(lo);

        s = 0b100000000;
        System.out.println(s);

        lo = 1_000_000_000;

        f = 12;
        f = 12.0F;

        double db = 1_000_100_999.00F;
        float v = 1_000_000_000.00F;
        System.out.println(db - v);

        char ch = 'a';
        int ich = 'i';
        ch = 24;
        ch = '\u000F';
        int a = '\u0061';

        System.out.println(a);
        System.out.println(Integer.toHexString(\u0061));

        ch++;
        ch *= 5;
        System.out.println(ch);

    }

    static int addition(int i, int j) {
        return i + j;
    }

    static void addition2(int[] ti) {
        ti[0] = ti[1] + ti[2];
    }
}
