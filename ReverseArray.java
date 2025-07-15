import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {
        int i, l;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Reverse Number\n");
        System.out.println("Enter the Elements:");
        int size = sc.nextInt();
        int[] newArr = new int[size];

        // Input Array
        System.out.println("Please Enter the element:");
        for (i = 0; i < newArr.length; i++)
            newArr[i] = sc.nextInt();
        {

            // OutPut
            i = 0;
            l = newArr.length - 1;

            while (i < l) {
                int temp = newArr[i];
                newArr[i] = newArr[l];
                newArr[l] = temp;
                i++;
                l--;
            }
            System.out.println("Reverse Array:");
            for (i = 0; i < newArr.length; i++) {
                System.out.print(" " + newArr[i]);
            }
        }
    }
}
