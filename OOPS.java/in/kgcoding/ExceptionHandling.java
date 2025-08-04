package in.kgcoding;

import java.util.Scanner;

class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Calculator:");
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Now enter the second number:");
        int b = sc.nextInt();
        try {
            int result = a / b;
            System.out.printf("Result is: %d", result);
           
        } catch (ArithmeticException exception) {
            if (exception.getMessage()
                    .equals("/ by zero")) {
                System.out.println("Divide by zero Occurred.");
            } else {
                throw exception;
            }
        }
    }
}
