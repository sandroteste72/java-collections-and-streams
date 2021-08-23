package one.digitalinnovation.optional;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class PrimitiveOptionalExample {
    public static void main(String[] args) {

        System.out.println("***** Optional integer value *****");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("***** Optional decimal value *****");
        OptionalDouble.of(55.2).ifPresent(System.out::println);

        System.out.println("***** Optional long value *****");
        OptionalLong.of(23L).ifPresent(System.out::println);
    }
}
