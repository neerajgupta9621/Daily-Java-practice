import java.util.Scanner;

class TernaryEvenOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the even odd number:");
        System.out.println("Please enter the number");
        int num = sc.nextInt();

        String result = (num % 2 == 0) ? "Even Number" : "Odd Number";
        System.out.println("Number is " + result);
    }
}
