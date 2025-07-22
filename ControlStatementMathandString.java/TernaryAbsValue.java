import java.util.Scanner;

class TernaryAbsValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(System.in);
        System.out.println("Welcome to the Absolute Number:");
        System.out.println("Please enter the number:");
        int num = sc.nextInt();

        int result = (num >= 0) ? num : -num;
        System.out.println(
                "Absolute Number Given the number is possitive and negative always number is possitive is :--->"
                        + result);
    }
}
