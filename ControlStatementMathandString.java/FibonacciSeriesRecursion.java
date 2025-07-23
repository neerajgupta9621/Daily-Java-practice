import java.util.Scanner;

class FibonacciSeriesRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the printing fibonacci: ");
        System.out.println("Please enetr the number:");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int position) {
        System.out.print(".");
        if (position == 1) {
            return 0;
        }
        if (position == 2) {
            return 1;
        }
        return fibonacci(position - 1) + fibonacci(position - 2);
    }
}