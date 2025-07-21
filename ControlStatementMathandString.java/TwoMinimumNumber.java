import java.util.Scanner;

class TwoMinimumNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the two minimum");
        int num1 = sc.nextInt();
        System.out.println("Now, enter the second number:");
        int num2 = sc.nextInt();
        if (num1 < num2) {
            System.out.println(num1 + "  is a minimum number:");

        } else {
            System.out.println(num2 + "  is a minimum numer");
        }
    }

}
