class TwoDimensionalArray {
    public static void main(String[] args) {
        // int[][] arr = new int[6][6];
        // arr[0][0] = 20;
        // arr[1][1] = 30;
        // arr[2][2] = 62;
        // arr[3][3] = 205;
        // arr[4][4] = 34;
        // arr[5][5] = 42;

        // System.out.println(arr[0][0]);
        // System.out.println(arr[1][1]);
        // System.out.println(arr[2][2]);
        // System.out.println(arr[3][3]);
        // System.out.println(arr[4][4]);
        // System.out.println(arr[5][5]);

        int[][] newArr = { { 2, 3, 4, 8, 1 }, { 5, 6, 9, 3, 5 }, { 4, 7, 5, 9, 2 } };
        // System.out.println(newArr[0].length);

        int index = 0;
        while (index < newArr.length) {
            int index1 = 0;
            while (index1 < newArr[index].length) {
                System.out.print(newArr[index][index1] + " ");
                index1++;
            }
            System.out.println();
            index++;
        }
    }
}
