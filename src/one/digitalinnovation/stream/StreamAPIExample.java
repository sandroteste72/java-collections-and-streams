package one.digitalinnovation.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamAPIExample {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>();

        students.add("Sandro");
        students.add("Marco");
        students.add("Emilio");
        students.add("Celia");
        students.add("Fabiana");
        students.add("Thiago");
        students.add("Juliana");
        students.add("George");
        students.add("Ana");
        students.add("Washington");

        System.out.println(students);

        System.out.println("Count: " + students.stream().count());
        System.out.println("Greater number of letters: " + students.stream().max(Comparator.comparingInt(String::length)));
        System.out.println("Lowest number of letters: " + students.stream().min(Comparator.comparingInt(String::length)));

        System.out.println("With the letter r in the name: " + students.stream().filter((student) -> student.toLowerCase().contains("r")).collect(Collectors.toList()));

        System.out.println("Returns a new collection with the number of letters: " + students.stream()
                .map(student -> student.concat(" - ").concat(String.valueOf(student.length()))).collect(Collectors.toList()));

        System.out.println("Returns the first three elements: " + students.stream().limit(3).collect(Collectors.toList()));

        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Displays each element in the console and then returns the same collection: " + students.stream()
                .peek(System.out::println).collect(Collectors.toList()));

        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Display each element in the console without returning another collection: ");
        students.stream().forEach(System.out::println);

        System.out.println("Do all elements have the letter w in the name? " + students.stream().allMatch(element -> element.contains("W")));
        System.out.println("Is there an element with the letter W in the name? " + students.stream().anyMatch(element -> element.contains("W")));
        System.out.println("Does no element have the lowercase letter w in the name? " + students.stream().noneMatch(element -> element.contains("w")));

        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Returns the first element of the collection: ");
        students.stream().findFirst().ifPresent(System.out::println);

        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Chained operation: ");
        System.out.println(students.stream()
                .peek(System.out::println)
                .map(student -> student.concat(" - ").concat(String.valueOf(student.length())))
                .peek(System.out::println)
                .filter((student) -> student.toLowerCase().contains("a"))
//                .collect(Collectors.toList()));
//                .collect(Collectors.joining(", ")));
//                .collect(Collectors.toSet()));
                .collect(Collectors.groupingBy(student -> student.substring(student.indexOf("-") + 1))));
    }
}
