import java.util.Scanner;

class OneSumAndAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to the Sum of Average Number");
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        double average = average(numArray);
        System.out.println("Sum of the numbers is:" + sum);
        System.out.println("Average of the numbers is " + average);
    }

    public static long sum(int[] numArray) {
        long sum = 0;
        int i = 0;
        while (i < numArray.length) {
            sum = sum + numArray[i];
            i++;
        }
        return sum;
    }

    public static double average(int[] numArray) {
        double sum = sum(numArray);
        return (sum / numArray.length);
    }
}

// Average number max number = 4
// 2, 3, 4, 5 : sum = 14
// Average Number = 3.5 One Time Divide the Number