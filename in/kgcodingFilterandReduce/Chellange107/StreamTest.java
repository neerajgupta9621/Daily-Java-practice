package in.kgcodingFilterandReduce.Chellange107;

import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<String> fruits = List.of("Banana", "Grapes", "Mango", "Papaya", "Coconut","PineApple","Grapes");

        fruits.stream()
                .forEach(fruit -> System.out.println(fruit));
    }
}
