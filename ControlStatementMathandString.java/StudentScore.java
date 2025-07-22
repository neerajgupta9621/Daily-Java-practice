import java.util.Scanner;

class StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Student Score Using Nested Ternary:");
        System.out.println("Please enter the student score:");
        int marks = sc.nextInt();
        // String result = (marks > 80) ? "High for scores > 80":
        // (marks<=80 && marks>=50) ? "Moderate for 50-80":"Low for < 50";
        String result = (marks > 80) ? "High for scores > 80" : (marks > 50) ? "Moderate for 50-80" : "Low for < 50";

        System.out.println("Your Category is: " + result);
    }
}