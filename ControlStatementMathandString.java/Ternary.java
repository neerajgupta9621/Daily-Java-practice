import java.util.Scanner;

class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to number Chaecker:");
        System.out.println("Please enter your first number: ");
        int num1 = sc.nextInt();
        System.out.println("Now, enter the second number: ");
        int num2 = sc.nextInt();

        // int greaterNumber;
        // if (num1 > num2) {
        // greaterNumber = num1;
        // // System.out.println(num1 + " Is the greates number");
        // } else {
        // greaterNumber = num2;
        // }
        int greaterNumber = num1 > num2 ? num1 : num2;
        System.out.println(greaterNumber + " Is the greatest number");
    }

}
