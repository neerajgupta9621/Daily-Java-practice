class BraekandContinue {
    public static void main(String[] args) {
        System.out.println("before loop ");
        for (int i = 1; i < 10; i++) {
            if (i == 2) {
                // break;// loop se bahar
                continue;// skip the single iteration number
            }
            System.out.println(i);
        }
        System.out.println("Out Of Loop");
    }
}
