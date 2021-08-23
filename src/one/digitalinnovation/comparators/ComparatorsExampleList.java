package one.digitalinnovation.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExampleList {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Pedro", 19));
        students.add(new Student("Carlos", 23));
        students.add(new Student("Mariana", 21));
        students.add(new Student("Joao", 18));
        students.add(new Student("Thiago", 20));
        students.add(new Student("George", 22));
        students.add(new Student("Larissa", 21));
        students.add(new Student("Sandro", 48));

        System.out.println("***   Insertion Order   ***");
        System.out.println(students);

        System.out.println("---------------------------------------------------------------------------------------------------------");

        students.sort((first, second) -> first.getAge() - second.getAge());
        System.out.println("***   Natural order of numbers - age   ***");
        System.out.println(students);

        System.out.println("---------------------------------------------------------------------------------------------------------");

        students.sort((first, second) -> second.getAge() - first.getAge());
        System.out.println("***   Reverse order of numbers - age   ***");
        System.out.println(students);

        System.out.println("---------------------------------------------------------------------------------------------------------");

        students.sort(Comparator.comparingInt(Student::getAge));
        System.out.println("***   Natural order of numbers - age   ***");
        System.out.println(students);

        System.out.println("---------------------------------------------------------------------------------------------------------");

        students.sort(Comparator.comparingInt(Student::getAge).reversed());
        System.out.println("***   Reverse order of numbers - age   ***");
        System.out.println(students);

        System.out.println("---------------------------------------------------------------------------------------------------------");

        Collections.sort(students);
        System.out.println("***   Natural order of numbers - age   ***");
        System.out.println(students);

        System.out.println("---------------------------------------------------------------------------------------------------------");

        Collections.sort(students, new StudentAgeOrderDescendingComparator());
        System.out.println("***   Reverse order of numbers - age   ***");
        System.out.println(students);
    }
}
