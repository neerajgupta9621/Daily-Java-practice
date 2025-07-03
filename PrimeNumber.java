
import java.util.Scanner;

class Primenumber {
    public static void main(String[] args) {
        int f = 0, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Prime Number:");
        System.out.println("Please Enter the Number:");
        int num = sc.nextInt();
        for (i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                f = 1;
                break;
            }
        }
        if (f == 0) {
            System.out.println(num + " = Prime Number");
        } else {
            System.out.println(num + " = Not a prime number");
        }
    }
}
// yaha pr prime number return kr rha hai
// Prime number ek aisa natural number hota hai jo sirf 1 ya khud se divide hota
// hai
// Example: 2,3,5,7,11,13
// 1 prime number nhi hota hai
// Prime number = sirf 2 factors (1 aur number)
