import java.util.Scanner;

class PrintOnlyEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Print only even number:");
        int num = 0;
        System.out.println("Even Number Logic 1\n");
        EvenNumber1(num);
        System.out.println();
        System.out.println("Even Number logic 2");
        EvenNumber2(num);
    }

    public static void EvenNumber1(int num) {
        for (num = 1; num <= 100; num++) {
            if (num % 2 == 1) {
                continue;
            }
            System.out.println("Print even number: " + num);
        }
    }

    public static void EvenNumber2(int num) {
        for (num = 1; num <= 100; num++) {
            if (num % 2 == 0) {
                System.out.println("Print even number " + num);
            } else {
                continue;
            }

        }
    }
}
