
package cours;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Saisissez 'S'aisir ou 'Q'uiter");
        String str = sc.nextLine().toUpperCase();

        ArrayList<LocalDate> ld = new ArrayList<>();
        DateTimeFormatter pat = DateTimeFormatter.ofPattern("d/M/yyyy", Locale.FRANCE);

        while (str.equals("S")) {

            saisirDate(sc, ld, pat);
            
            System.out.println("\nSaisissez: 'S'aisir, 'T'rier ou 'Q'uiter");
            str = sc.nextLine().toUpperCase();
            
            if (str.equals("T")) {
                
                triDate(sc,str,ld);
               
            System.out.println("\nSaisissez: 'S'aisir , 'T'rier, 'Q'uiter");
            str = sc.nextLine().toUpperCase();    
            }

            if (str.equals("Q")) {
                System.out.println("FIN!!!");
                break;
            }
            
            

        }
    }

    static void saisirDate(Scanner sc, ArrayList<LocalDate> ld, DateTimeFormatter pat) {
        System.out.println("Saisissez une Date (ex. 22/12/2000):");
        String str1 = sc.nextLine();

        TemporalAccessor ta = pat.parse(str1);

        LocalDate date = LocalDate.from(ta);

        ld.add(date);

        System.out.println("La date: " + date + " ,vienne d'être ajoutée à la liste");
    }

    static void triDate(Scanner sc, String str, ArrayList<LocalDate> ld) {
        System.out.println("\nChoisissez l'ordre: 'A'scendente ou 'D'escendente?");
        str = sc.nextLine().toUpperCase();
        if (str.equals("A")) {
            ld.sort(new CompareDate());
        }
        if (str.equals("D")) {
            ld.sort(new CompareDate().reversed());
        }
        System.out.println(ld);
    }
}

class CompareDate implements Comparator<LocalDate> {

    @Override
    public int compare(LocalDate da1, LocalDate da2) {
        return da1.compareTo(da2);
    }

}
