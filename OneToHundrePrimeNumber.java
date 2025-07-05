class OnetohundredPrimenumber {
    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {
            int f = 0;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    f = 1;
                    break;
                }
            }
            if (f == 0) {
                System.out.println(num + " Prime Number");
            } else {
                System.out.println(num + " Not a prime number");
            }
        }
    }

}

// Yah jo program hai wah 1 to 100 tk jitne prime number hai unme se jo prime number hai whai number de raha hai
