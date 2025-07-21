import java.util.Scanner;
class StudentScore{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Student Score");
        int score = sc.nextInt();
        String result = (score > 80) ? "High for scores > 80":
                         (score<=80 && score>=50) ? "Moderate for 50-80":"Low for < 50";
                         System.out.println("Result " + result);
    }
}