package cours;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class LesStreams {

    public static void main(String[] args) {
        System.out.println("**************parallel distinct******************");
        Stream.of(4, 5, 6, 7, 8, 9, 4, 6, 8)
                .parallel()
                .distinct()
                .forEachOrdered((i) -> System.out.println("i= " + i));

        System.out.println("\n**************filter sorted (pair)*************");
        Stream.of(4, 5, 6, 7, 8, 9, 4, 6, 8)
                .filter((i) -> i % 2 == 0)
                .sorted((i, j) -> Integer.compare(j, i))
                .forEach((i) -> System.out.println("i= " + i));

        System.out.println("\n******************max valeur*******************");
        Optional<Integer> oi = Stream.of(4, 5, 6, 7, 8, 9, 4, 6, 8)
                .max((i, j) -> Integer.compare(i, j));

        if (oi.isPresent()) {
            System.out.println(oi.get());

        } else {
            System.out.println("pas de max");
        }

        System.out.println("\n********************map************************");
        System.out.println("Moyenne= " + Stream.of(4, 5, 6, 7, 8, 9, 4, 6, 8, 3)
                .mapToInt((i) -> i.intValue()).average());

        System.out.println("Somme= "+ IntStream.of(4, 5, 6, 7, 8, 9, 4, 6, 8, 3)
                .sum());

        "maman".chars()
               .distinct()
               .forEach((c) -> System.out.println("c= " + (char) c));

        
        System.out.println("\n*********Collection des lievres****************");
        
        List<Lievre> terrier = new ArrayList<>();
        terrier.add(new Lievre("lapineu", 5));
        terrier.add(new Lievre("pierre", 2));
        terrier.add(new Lievre("bugs", 8));
        terrier.add(new Lievre("ruben", 15));
        terrier.add(new Lievre("sofia", 12));
        terrier.add(new Lievre("roger", 2));
        terrier.add(new Lievre("jessica", 8));

        Lievre plusAge = terrier.stream()
                .max((l, m) -> Integer.compare(l.getAge(), m.getAge())).get();
        
        System.out.println("Le plus agé est " + plusAge.getNom() + " avec " + plusAge.getAge() + " ans");

        int somme = terrier.stream().mapToInt((l) -> l.getAge()).sum();
        
        Double averAge = terrier.stream()
                .mapToInt((l) -> l.getAge()).average().getAsDouble();
        
        System.out.println("Somme d'age des lievres= " + somme + " ans");
        System.out.println("Moyenne d'age= " + averAge);

        System.out.println("\n************Exercise nom plus long*************");

        //Consumer<Lievre> affiche = (l) -> System.out.println(l.getNom() + ", " + l.getAge());

        int longNom = terrier.stream()
                      .max((l, m) -> Integer.compare(l.getNom().length(), m.getNom().length()))
                      .get()
                      .getNom()
                      .length();

        terrier.stream()
                .filter((l) -> l.getNom().length() == longNom)
                .forEach((l)-> System.out.println(l.getNom()));

        List<Integer> li= Arrays.asList(15,14,16);
    }

}
