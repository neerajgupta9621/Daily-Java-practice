import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Printing Tables:");
        System.out.println("Please enter the table number");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int table = num * i;

            System.out.println(num + " * " + " = " + table);
        }

    }
}
