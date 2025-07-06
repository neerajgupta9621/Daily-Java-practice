import java.util.Scanner;
class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
           int[] arr = {2, 4, 6, 9, 12, 30, 38, 60, 90, 80};
        System.out.println("Welcome To Array Searching\n");
        System.out.println("Enter the number you want to search");
        int num =input.nextInt();
        boolean isFound = isFound(arr, num);
        if (isFound) {
            System.out.println("Your number was found in the array:");
        }else{
            System.out.println("Your number was not found in the array");
        }

    }  
    public static boolean isFound(int[] arr, int num){
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == num) {
                return true;
            }
            index++;
        }
           return false;
    }
}
