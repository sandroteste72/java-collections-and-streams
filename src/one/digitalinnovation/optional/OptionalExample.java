package one.digitalinnovation.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Optional value");

        System.out.println(optionalString.isPresent());
        System.out.println(optionalString.isEmpty());

        optionalString.ifPresent(System.out::println);

        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Value isn't present"));

        if (optionalString.isPresent()) {
            String value = optionalString.get();
            System.out.println(value);
        }

        optionalString.map((value) -> value.concat(" *&%$#@")).ifPresent(System.out::println);

        System.out.println(optionalString.orElseThrow(IllegalStateException::new));
    }
}
