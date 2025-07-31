package in.kgcoding.chellangeMOL85;

public class Calculater1 {

    public int Add(int first, int second) {
        return first + second;
    }

    public int Add(int first, int second, int third) {
        return first + second + third;
    }

    public double Add(double first, double second) {
        return first + second;
    }

    public static void main(String[] args) {
        Calculater1 clc = new Calculater1();
        System.out.println(clc.Add(7, 8));
        System.out.println(clc.Add(3, 7, 9));
        System.out.println(clc.Add(5.0, 6.2));
    }
}
