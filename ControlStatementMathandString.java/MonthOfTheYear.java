import java.util.Scanner;

class MonthOfTheYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the year:");
        System.out.println("Please enter the year of number:");
        int year = sc.nextInt();

        switch (year) {

            case 1:
                System.out.println("Welcome to the January");
                break;
            case 2:
                System.out.println("Welcome to the Feburary");
                break;
            case 3:
                System.out.println("Welcome to the March");
                break;
            case 4:
                System.out.println("Welcome to the April");
                break;
            case 5:
                System.out.println("Welcome to the May");
                break;
            case 6:
                System.out.println("Welcome to the June");
                break;
            case 7:
                System.out.println("Welcome to the July");
                break;
            case 8:
                System.out.println("Welcome to the August");
                break;
            case 9:
                System.out.println("Welcome to the September");
                break;
            case 10:
                System.out.println("Welcome to the October");
                break;
            case 11:
                System.out.println("Welcome to the November");
                break;
            case 12:
                System.out.println("Welcome to the December");
                break;
            default:
                System.out.println("Invalid Year ");
                break;
        }
    }
}
