import java.util.Scanner;

class ExitOnExit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Break and Continue :");
        while (true) {
            System.out.println("Enter your command");
            String command = sc.next();
            // Two object ko ham == double equal se compare nhi kr sakte hai
            // equalsIgnoreCase me ham kisi bhi letter me input denge to wah shi man lega
            if (command.equalsIgnoreCase("exit")) { 
                break;
            }
        }
        System.out.println("You have successfully exited.");
    }
}
