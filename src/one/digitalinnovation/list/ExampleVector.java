package one.digitalinnovation.list;

import java.util.List;
import java.util.Vector;

public class ExampleVector {
    public static void main(String[] args) {
        List<String> sports = new Vector<>();

        sports.add("Soccer");
        sports.add("Basketball");
        sports.add("Volleyball");
        sports.add("Tennis");

        for (String sport : sports) {
            System.out.println(sport);
        }

        sports.set(0, "Football");

        System.out.println("==========================================");
        System.out.println(sports);
        System.out.println("==========================================");
        System.out.println(sports.get(0));
        System.out.println();
        sports.set(0, "Ping Pong");
        System.out.println(sports);
        sports.remove("Ping Pong");
        System.out.println(sports);
        sports.remove(2);
        System.out.println(sports);
    }
}
