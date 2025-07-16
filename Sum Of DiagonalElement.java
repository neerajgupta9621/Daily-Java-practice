import java.util.Scanner;

class SumOfDiagonalElement {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Sum of Diagonal Elements");
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Check for square matrix
        if (rows != cols) {
            System.out.println("Diagonal sum can only be calculated for square matrices.");
            return;
        }

        int[][] arr = new int[rows][cols];

        // Input
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Sum of primary diagonal (i == j)(i+j ==2)
        for (int i = 0; i < rows; i++) {
            sum += arr[i][i];
        }

        System.out.println("Sum of primary diagonal elements: " + sum);

        // 👉 If you want secondary diagonal too (uncomment below lines):
        /*
         * int secSum = 0;
         * for (int i = 0; i < rows; i++) {
         * secSum += arr[i][rows - 1 - i];
         * }
         * System.out.println("Sum of secondary diagonal elements: " + secSum);
         */
    }
}
