package in.Challenge113;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 0, 5, 3, 4, 2, 1);
        List<Integer> distinctItems = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Before Number:" + numbers);
        System.out.println("After Number:" + distinctItems);
    }
}
