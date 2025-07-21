import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the simple Calculator");
        System.out.println("Please enter the  Number");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter the Number:");
                int num1 = input.nextInt();
                System.out.println("Please enter the second number");
                int num2 = input.nextInt();
                int sum1 = num1 + num2;
                System.out.println("Addition of two number:" + sum1);
                break;

            case 2:
                Scanner input1 = new Scanner(System.in);
                System.out.println("Please enter the Number:");
                int num3 = input1.nextInt();
                System.out.println("Please enter the second number");
                int num4 = input1.nextInt();
                int sum2 = num3 - num4;
                System.out.println("Subtraction of two number:" + sum2);
                break;

            case 3:
                Scanner input2 = new Scanner(System.in);
                System.out.println("Please enter the Number:");
                int num5 = input2.nextInt();
                System.out.println("Please enter the second number");
                int num6 = input2.nextInt();
                int sum3 = num5 * num6;
                System.out.println("Multiplication of two number:" + sum3);
                break;

            case 4:
                Scanner input3 = new Scanner(System.in);
                System.out.println("Please enter the Number:");
                int num7 = input3.nextInt();
                System.out.println("Please enter the second number");
                int num8 = input3.nextInt();
                int sum4 = num7 / num8;
                System.out.println("Division of two number:" + sum4);
                break;

        }
    }
}
