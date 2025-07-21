import java.util.Scanner;

class EvenOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Even Odd Number:");
        System.out.println("Please enter the number");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " Even Number");

        } else {
            System.out.println(num + " Odd Number");
        }
    }
}
