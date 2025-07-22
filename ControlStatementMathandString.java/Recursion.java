import java.util.Scanner;

class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the factorial generator\n");
        System.out.println("Please enter the number");
        int num = sc.nextInt();
        long fact = factorial(num);
        //long fact = factorialIterative(num);
        System.out.println("Factorial of your number is: " + fact);
    }

    public static long factorial(int num) {
        System.out.println("Function called for: " + num);
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static long factorialIterative(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

}
