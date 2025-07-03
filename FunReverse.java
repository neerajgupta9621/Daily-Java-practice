import java.util.Scanner;

class FunReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Reverse Number:");
        System.out.println("Please Enter the Number: ");
        int num = sc.nextInt();
        int rev = reverse(num);
        System.out.println("Reverse of Your Number is: " + rev);
    }

    public static int reverse(int num) {
        int revnewnumber = 0;
        while (num > 0) {
            int digit = num % 10;
            num = num / 10;
            revnewnumber = revnewnumber * 10 + digit;
        }
        return revnewnumber;

        // int i = 1;
        // while (num > 0) {
        // int reverse = 0;
        // int r = num % 10;
        // num = num / 10;
        // reverse = reverse * 10 + r;
        // return reverse;
        // }
        // return i++;
        // Yah Logic Jo hai Yah kitna number bhi enter kr de yah us digit ka last number
        // nikal kr dega
    }
}
