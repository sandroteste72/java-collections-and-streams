package one.digitalinnovation.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExampleTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> treeCapitals = new TreeMap<>();

        treeCapitals.put("RS", "Porto Alegre");
        treeCapitals.put("SC", "Florianopolis");
        treeCapitals.put("PR", "Curitiba");
        treeCapitals.put("SP", "Sao Paulo");
        treeCapitals.put("RJ", "Rio de Janeiro");
        treeCapitals.put("MG", "Belo Horizonte");
        treeCapitals.put("ES", "Vitoria");

        System.out.println(treeCapitals);

        System.out.println(treeCapitals.firstKey());
        System.out.println(treeCapitals.lastKey());
        System.out.println(treeCapitals.lowerKey("SC"));
        System.out.println(treeCapitals.higherKey("SC"));
        System.out.println("=============================");
        System.out.println(treeCapitals.firstEntry().getKey() + " - " + treeCapitals.firstEntry().getValue());
        System.out.println(treeCapitals.lastEntry().getKey() + " - " + treeCapitals.lastEntry().getValue());
        System.out.println(treeCapitals.lowerEntry("SC").getKey() + " - " + treeCapitals.lowerEntry("SC").getValue());
        System.out.println(treeCapitals.higherEntry("SC").getKey() + " - " + treeCapitals.higherEntry("SC").getValue());

        System.out.println(treeCapitals);

        Map.Entry<String, String> firstEntry = treeCapitals.pollFirstEntry();
        Map.Entry<String, String> lastEntry = treeCapitals.pollLastEntry();

        System.out.println(firstEntry.getKey() + " - " + firstEntry.getValue());
        System.out.println(lastEntry.getKey() + " - " + lastEntry.getValue());

        System.out.println(treeCapitals);
        System.out.println("=============================");
        Iterator<String> iterator = treeCapitals.keySet().iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " - " + treeCapitals.get(key));
        }

        System.out.println("=============================");

        for (String capital : treeCapitals.keySet()) {
            System.out.println(capital + " -- " + treeCapitals.get(capital));
        }

        System.out.println("=============================");

        for (Map.Entry<String, String> capital : treeCapitals.entrySet()) {
            System.out.println(capital.getKey() + " -- " + capital.getValue());
        }
    }
}
