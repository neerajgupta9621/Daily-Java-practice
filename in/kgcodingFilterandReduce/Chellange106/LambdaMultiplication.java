package in.kgcodingFilterandReduce.Chellange106;

import java.util.function.BinaryOperator;

public class LambdaMultiplication {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiplication = (a, b) -> a * b;
        int result = multiplication.apply(4, 5);
        System.out.println("Multiplication is:  " + result);
    }
}