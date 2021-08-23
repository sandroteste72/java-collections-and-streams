package one.digitalinnovation.map;

import java.util.Hashtable;
import java.util.Map;

public class ExampleHashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> students = new Hashtable<>();

        students.put("Carlos", 21);
        students.put("Mariana", 33);
        students.put("Rafaela", 18);
        students.put("Pedro", 44);

        System.out.println(students);

        students.put("Pedro", 55);

        System.out.println(students);

        students.remove("Pedro");
        System.out.println(students);

        int studentAge = students.get("Mariana");
        System.out.println("Mariana's age: " + studentAge + " years old.");
        System.out.println(students.size());

        System.out.println("===================");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("===================");

        for (String key : students.keySet()) {
            System.out.println(key + " - " + students.get(key));
        }
    }
}
