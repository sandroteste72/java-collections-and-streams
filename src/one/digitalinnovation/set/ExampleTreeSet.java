package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExampleTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCapitals = new TreeSet<>();

        treeCapitals.add("Porto Alegre");
        treeCapitals.add("Florianopolis");
        treeCapitals.add("Curitiba");
        treeCapitals.add("Sao Paulo");
        treeCapitals.add("Rio de Janeiro");
        treeCapitals.add("Belo Horizonte");
        treeCapitals.add("Aracaju");
        treeCapitals.add("Terezina");
        treeCapitals.add("Joao Pessoa");

        System.out.println(treeCapitals);

        System.out.println(treeCapitals.first());

        System.out.println(treeCapitals.last());

        System.out.println("Lower: " + treeCapitals.lower("Florianopolis"));

        System.out.println("Higher: " + treeCapitals.higher("Florianopolis"));

        System.out.println(treeCapitals);

        System.out.println("Poll first: " + treeCapitals.pollFirst());

        System.out.println("Poll last: " + treeCapitals.pollLast());

        System.out.println(treeCapitals);

        System.out.println("================================");

        Iterator<String> iterator = treeCapitals.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("================================");

        for (String capital : treeCapitals) {
            System.out.println("Capital: " + capital);
        }
    }
}
