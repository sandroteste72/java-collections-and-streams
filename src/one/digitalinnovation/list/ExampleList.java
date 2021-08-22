package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExampleList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Sandro");
        names.add("Fabiana");
        names.add("Marco");
        names.add("Emilio");
        names.add("Celia");
        names.add("Lucas");
        names.add("Pedro");
        names.add("Gustavo");
        names.add("Maria");
        names.add("Joao");
        names.add("Socrates");

        System.out.println(names);
        names.set(9, "Armando");
        Collections.sort(names);
        System.out.println(names);
        names.remove(7);
        System.out.println(names);
        String name = names.get(9);
        System.out.println(name);
        int size = names.size();
        System.out.println(size);
        boolean hasSandro = names.contains("Sandro");
        System.out.println(hasSandro);
        boolean hasFernando = names.contains("Fernando");
        System.out.println(hasFernando);
        boolean listIsEmpty = names.isEmpty();
        System.out.println(listIsEmpty);
        int position = names.indexOf("Sandro");
        System.out.println(position);

        for (String n : names) {
            System.out.println("-->" + n);
        }

        System.out.println("=======================");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println("-->" + iterator.next());
        }

        names.clear();
        listIsEmpty = names.isEmpty();
        System.out.println(listIsEmpty);
    }
}
