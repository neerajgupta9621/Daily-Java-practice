import java.util.Scanner;

class Sumnumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Welcome to sum number");

        System.out.println("Enter the number");
        int num = sc.nextInt();

        while (num > 0) {
            int r = num % 10;
            num = num / 10;
            sum = sum + r;
        }

        System.out.println("Reverse of Number " + sum);
    }

}
// Ham ek bar me kitna bhi number input kre wah jo hai hame sabhi number ka sum
// karje dega