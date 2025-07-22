import java.util.Scanner;
class TernaryMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Welcome to the monimum of two number: ");
        System.out.println("Please enter first number:");
        int num1=sc.nextInt();
        System.out.println("Now enter the second number");
        int num2 = sc.nextInt();
         
          int result=(num1 < num2)? num1 : num2;
          System.out.println("Minimum Number is " + result);
    }
}
