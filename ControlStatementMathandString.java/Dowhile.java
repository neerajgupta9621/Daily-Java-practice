import java.util.Scanner;

class Dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Please enter your age");
        // int age = sc.nextInt();
        // while (age < 0 || age > 100) {
        // System.out.println("Please enter your age");
        // age = sc.nextInt();
        // }
        int age;
        do {
            System.out.println("Please enter your age");
            age = sc.nextInt();
        } while (age < 0 || age > 100);// yaha pr AGE less than 0 and age greaterthan 100 ho tab tak yah chalega
        System.out.println("Your age is " + age + " Year");
    }
}
