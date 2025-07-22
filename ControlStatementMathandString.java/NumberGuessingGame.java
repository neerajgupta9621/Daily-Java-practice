import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 5, guess;
        System.out.println("Welcome to the number Guessing Game:  ");
        do {
            System.out.print("Please guess the number between 0 and 10: ");
            guess = sc.nextInt();

        } while (num != guess);
        System.out.println("Congratulation You Guessed the Number is: " + num);
    }
}
