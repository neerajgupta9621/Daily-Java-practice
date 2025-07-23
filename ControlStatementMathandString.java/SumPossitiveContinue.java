import java.util.Scanner;

class SumPositiveContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WElcome to the Sum Of positive Continue:");

        int[] numArr = ArrayUtility.inputArray();
        int sum = 0;
        for (int num : numArr) {
            if (num > 0) {
                sum = sum + num;
            } else {
                continue;
            }
        }
        System.out.println("Sum of the positive number is: " + sum);
    }
}