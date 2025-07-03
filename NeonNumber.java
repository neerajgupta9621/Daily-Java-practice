import java.util.Scanner;

class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Welcome to The Neon Number: ");
        System.out.println("Enter The Number: ");
        int num = sc.nextInt();
        // int t = num;
        int sq = num * num;
        while (sq > 0) {
            int r = sq % 10;
               sq = sq / 10;
               sum = sum + r;
        }
        if (num == sum) {
            System.out.println("Neon Number is :");
        } else {
            System.out.println("Not is a Neon Number :");
        }

    }
}
// Neon Number is = 0 , 1 , 9 ;