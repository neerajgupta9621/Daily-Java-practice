package in.Optional;

import java.util.List;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        // Optional with value
        Optional<String> name = Optional.of("Neeraj");

        // Optional empty
        Optional<String> empty = Optional.empty();

        // Check present
        if (name.isPresent()) {
            System.out.println(name.get()); // Neeraj
        }

        // Default value if empty
        System.out.println(empty.orElse("Default")); // Default
    }
}
