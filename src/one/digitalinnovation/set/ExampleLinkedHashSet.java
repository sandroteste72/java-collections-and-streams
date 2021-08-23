package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExampleLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numericalSequence = new LinkedHashSet<>();

        numericalSequence.add(1);
        numericalSequence.add(2);
        numericalSequence.add(4);
        numericalSequence.add(8);
        numericalSequence.add(16);
        numericalSequence.add(32);

        System.out.println(numericalSequence);

        numericalSequence.remove(32);

        System.out.println(numericalSequence);
        System.out.println(numericalSequence.size());

        Iterator<Integer> iterator = numericalSequence.iterator();

        System.out.println("==============================");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("==============================");

        for (Integer number : numericalSequence) {
            System.out.println("* " + number);
        }

        System.out.println("==============================");

        System.out.println("Is empty? " + numericalSequence.isEmpty());
    }
}
