package one.digitalinnovation.map;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {
    public static void main(String[] args) {
        Map<String, Integer> fifaWorldChampions = new HashMap<>();

        fifaWorldChampions.put("Brazil", 5);
        fifaWorldChampions.put("Germany", 4);
        fifaWorldChampions.put("Italy", 4);
        fifaWorldChampions.put("Uruguay", 2);
        fifaWorldChampions.put("Argentina", 2);
        fifaWorldChampions.put("France", 2);
        fifaWorldChampions.put("England", 1);
        fifaWorldChampions.put("Spain", 1);

        System.out.println(fifaWorldChampions);

        fifaWorldChampions.put("Brazil", 6);
        System.out.println(fifaWorldChampions);

        System.out.println("World Cups won by Argentina: " + fifaWorldChampions.get("Argentina"));

        System.out.println(fifaWorldChampions.containsKey("France"));

        fifaWorldChampions.remove("France");
        System.out.println(fifaWorldChampions.containsKey("France"));

        System.out.println(fifaWorldChampions.containsValue(6));

        System.out.println(fifaWorldChampions);

        fifaWorldChampions.put("France", 2);

        System.out.println(fifaWorldChampions.size());

        System.out.println(fifaWorldChampions);

        System.out.println("======================================================================================");

        for (Map.Entry<String, Integer> entry : fifaWorldChampions.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        System.out.println("======================================================================================");

        for (String key : fifaWorldChampions.keySet()) {
            System.out.println(key + " -- " + fifaWorldChampions.get(key));
        }
    }
}
