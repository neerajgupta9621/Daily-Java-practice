package in.MethodReferences;

import java.util.List;

public class TestingMethodInterface {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Method References Start:");
        numbers.stream()
                .filter(num -> num % 2 == 1)
                .forEach(System.out::println);// Method References
        System.out.println("Method References End:");

        numbers.stream()
                .filter(num -> num % 2 == 1)
                .forEach(num -> System.out.println(num));
    }
}
