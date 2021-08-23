package one.digitalinnovation.optional;

import java.util.Optional;

public class ExampleOptionalStates {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Present value");

        System.out.println("Optional value that is present");
//        Is the same thing
//        optionalString.ifPresentOrElse((valor) -> System.out.println(valor), () -> System.out.println("It isn't present"));
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("It isn't present"));

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Optional value that isn't present");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = It isn't present"));

        Optional<String> emptyOptional = Optional.empty();

        System.out.println("Optional value that isn't present");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = It isn't present"));

        Optional<String> optionalNullError = Optional.of(null);

        System.out.println("Optional value that throws NullPointerException error");
        optionalNullError.ifPresentOrElse(System.out::println, () -> System.out.println("error = It isn't present"));
    }
}
