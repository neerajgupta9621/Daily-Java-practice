class Driver {
    static int minAgeForDriving = 18;
    String name;
    int age;
    String dateOfLicense;

    public boolean isAllowedToDrive() {
        return this.age >= minAgeForDriving;
    }

    public static void main(String args[]) {
        Driver myDriver = new Driver();
        myDriver.dateOfLicense = "1/jan/2025";// Non Static variable ko static ke andr use nhi kr sakta 
        System.out.println(minAgeForDriving);// but static variable ko static ke andr use kr sakta hu
    }
}
