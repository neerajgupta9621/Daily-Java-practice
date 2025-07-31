package in.kgcoding.Abstractionchellange83;

public class Square extends Shape{

 private final double sideInCms;

 public Square(double sideInCms){
    this.sideInCms = sideInCms;
 }

   public double getSideInCms() {
        return sideInCms;
    }


    @Override
    public double calculateArea() {
        // TODO Auto-generated method stub
        return Math.pow(sideInCms, 2);
    }
}
