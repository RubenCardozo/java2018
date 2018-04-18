/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez 'S'pour saisir , 'T' pour trier ou 'Q' pour sortir");
        String str = sc.nextLine();
        
        ArrayList<LocalDate> ld = new ArrayList<LocalDate>();
        DateTimeFormatter pat = DateTimeFormatter.ofPattern("d/M/yyyy");
        
        
        while (str.equals("S")) {

            Scanner sc1 = new Scanner(System.in);
            System.out.println("Saisissez une Date : ");
            String str1 = sc1.nextLine();
            
            TemporalAccessor ta = pat.parse(str1);

            LocalDate date = LocalDate.from(ta);

            System.out.println(date);

            System.out.println("Vous venez de saisir la date: " + date.format(pat));

            ld.add(date);

           

           
            System.out.println("Saisissez 'S'pour saisir , 'T' pour trier ou 'Q' pour sortir");
            str = sc.nextLine();
            
            
            if (str.equals("L")) {
                System.out.println("Liste de  dates: \n" + date.toString());
                str = sc.nextLine();
            }
           
            
            if (str.equals("T")) {

            }
            
            if (str.equals("Q")) {
                break;
            }
        }

        //System.out.println("Saisissez 'S'pour saisir , 'T' pour trier ou 'Q' pour sortir");

    }

}
