import java.util.Scanner;

class AbsoluteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Absolute Negative Possitive Number");
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int absValue = (num < 0) ? -num : num;
        System.out.println(" Absolute Value " + absValue);
    }
}
