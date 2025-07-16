class SumAndAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to sum and average  2D array\n");
        int[][] numArr = ArrayUtility.input2DArray();
        long sum = sum(numArr);
        double average = average(numArr);
        System.out.println("Your sum of array is: " + sum);
        System.out.println("Your average of array is: " + average);
    }

    public static double average(int[][] numArr) {
        if (numArr.length == 0) {// Agar array me koi row hi nhi hai to average calculate nahi kar sakte isiliye
                                 // return 0;
            return 0;
        }
        int rows = numArr.length; // kitni rows hai
        int cols = numArr[0].length;// har row me kitne columns (assume all rows are equal length)
        double size = rows * cols;// total element count karna 2 * 3 = 6
        return sum(numArr) / size;// sum (numArr)method se total sum milega (example: 1+2+3+4+5+6= 21)
    }
     // average = 21 / 6 = 3.5
      // numArr ={
      // {1, 2, 3}
      // {4, 5, 6}
      // };
      // sum =21
      // size = 6
      // Average = 21 / 6 = 3.5

    public static long sum(int[][] numArr) {
        long sum = 0;
        int i = 0;
        while (i < numArr.length) {
            int j = 0;
            while (j < numArr.length) {
                sum = sum + numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
}
