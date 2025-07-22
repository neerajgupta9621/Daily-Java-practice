import java.util.Scanner;

class passwordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the password checker\n");
        String password;
        do {
            System.out.println("Please enter your password: ");
            password = sc.next();
        } while (!isValidPassword(password));
        System.out.println("Thanks for entering a valid password");
    }

    public static boolean isValidPassword(String password) {
        return password.length() > 6;
    }
}
