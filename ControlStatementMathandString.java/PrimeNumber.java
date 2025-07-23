import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = 0;
        System.out.println("Welcome to the prime Number:");
        System.out.println("Please enter the number:");
        int num = sc.nextInt();
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                f = 1;
                break;
            }
        }
        if (f == 0) {
            System.out.println("Number is Prime " + num);
        } else {
            System.out.println("Number is not Prime " + num);
        }
    }
}
// Prime Number Jo Number apne alawa 1 se divide ho aur number pura pura na
// divide kr paye prime number
