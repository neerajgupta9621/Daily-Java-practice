import java.util.Scanner;

class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Day of the week detector\n");
        System.out.println("Please enter your day in number:");
        int day = sc.nextInt();

        switch (day) {

            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("Holiday");
                break;
            // case 8:
            // int sum=0;
            // Scanner input = new Scanner(System.in);
            // System.out.println("enter the two number:");
            // int num1=input.nextInt();
            // int num2=input.nextInt();
            // sum = num1+num2;
            // System.out.println(sum);
            // break;

            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
