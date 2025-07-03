import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Welcome to the Armstrong Number");
        System.out.println("Enter The Any Number:");
        int num = sc.nextInt();
        int t = num;
        while (num > 0) {
            int r = num % 10;
            num = num / 10;
            sum = sum + (r * r * r);
        }
        if (sum == t) {
            System.out.println("Armstrong Number:" + sum);
        } else {
            System.out.println("Not Armstrong Number:" + sum);
        }
    }
}

// Armstrong Number wah hota hai jise ham cube banate hai aur use sum se add kar
// dete hai
// Jaise Ex: 153 ko 1*1*1 + 5*5*5 + 3*3*3
//                        1+125+27 = Add Three = 153 aise hi hota hai
// Armstrong Number Hai = 0 , 1 , 153 , 370 , 371 , 407