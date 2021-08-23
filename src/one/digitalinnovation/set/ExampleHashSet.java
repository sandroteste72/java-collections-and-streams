package one.digitalinnovation.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExampleHashSet {
    public static void main(String[] args) {
        Set<Double> studentGrades = new HashSet<>();

        studentGrades.add(5.8);
        studentGrades.add(9.3);
        studentGrades.add(6.5);
        studentGrades.add(10.0);
        studentGrades.add(5.4);
        studentGrades.add(7.3);
        studentGrades.add(3.8);
        studentGrades.add(4.0);

        System.out.println(studentGrades);

        studentGrades.remove(3.8);
        System.out.println(studentGrades);

        System.out.println(studentGrades.size());

        Iterator<Double> iterator = studentGrades.iterator();

        while (iterator.hasNext()) {
            System.out.println("> " + iterator.next());
        }

        for (Double grade : studentGrades) {
            System.out.println("* " + grade + " *");
        }

        studentGrades.clear();

        System.out.println(studentGrades.isEmpty());
    }
}
