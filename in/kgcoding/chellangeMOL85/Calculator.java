package in.kgcoding.chellangeMOL85;

public class Calculator {
 
    public void Add(int first,int second){
           System.out.println("Two integer Sum " +( first+second));
    }
    public void Add(int first, int second, int third){
System.out.println("Three Integer Sum " +(first+second+third));
    }
    public void Add(double first, double second){
        System.out.println("Two Double Sum " + (first+second));
    }
}
class MyProgram{
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.Add(2, 4);
        obj.Add(3, 5,9);
        obj.Add(2.5, 6.5);
    }
}
