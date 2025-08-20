package in.kgcodingFilterandReduce;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 5, 7, 9);
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);

        int newSum = numbers.stream()
                .reduce(0, new BinaryOperator<Integer>() {

                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer + integer2;
                    }

                });
        System.out.printf("\nSum using reduce is %d ", newSum);
        // Print Sum
        int add = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.printf("\nSum using reduce is %d ", add);
        // Print Max Number
        int max = numbers.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.printf("\nMax using reduce is %d ", max);
        // Print Min Number
        int min = numbers.stream()
                .reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);
        System.out.printf("\nMin using reduce is %d ", min);

    }
}