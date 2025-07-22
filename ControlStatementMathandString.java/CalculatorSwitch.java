import java.util.Scanner;

class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to calculator :");
        System.out.println("Please enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Now, enter the second number:");
        int num2 = sc.nextInt();
        System.out.println("Now, enter the operation");
        String operation = sc.next();

        int result = switch (operation) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            case "%" -> num1 % num2;
            default -> -1;
        };
        System.out.println("Your answer is " + result);
    }
}
