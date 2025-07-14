class SortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome tO array shorting chack post\n");
        int[] numArr = ArrayUtility.inputArray();
        boolean isDec = isDecreasing(numArr);
        boolean isInc = isIncreasing(numArr);
        if (isInc || isDec) {
            System.out.println("Your array is sorted");
        } else {
            System.out.println("Your array is not sorted");
        }
    }

    public static boolean isDecreasing(int[] numArr) {
        int i = 1;
        while (i < numArr.length) {
            if (numArr[i] > numArr[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isIncreasing(int[] numArr) {
        int i = 1;
        while (i < numArr.length) {
            if (numArr[i] < numArr[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
