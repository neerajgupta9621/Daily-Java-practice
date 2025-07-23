import java.util.Scanner;

class OccurrencesForEach1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = ArrayUtility.inputArray();
        // Search element input
        System.out.println("Now, enter the number you want to search: ");
        int element = sc.nextInt();
        int count = countOccurrences(nums, element);
        System.out.println("Your element was found: " + count + " times.");
    }

    public static int countOccurrences(int[] nums, int element) {
        int count = 0;
        for (int num : nums) {
            if (num == element) {
                count++;
            }
        }
        return count;
    }
}
