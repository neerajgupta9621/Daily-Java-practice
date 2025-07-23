class OccurrencesForEach {
    public static void main(String[] args) {
        System.out.println("Welcome to the Occurrences of a specy+ific element:");
        int[] arr = { 1, 2, 5, 2, 7, 5, 9 };
        int target = 5;
        int count = 0;
        // For Each loop se count kar rahe hai
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        System.out.println(target + " occurs " + count + " times. ");
    }
}
