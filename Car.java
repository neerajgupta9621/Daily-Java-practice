class Car {

    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;
    
    public void drive() {
        if (currentFuelInLiters == 0) {
            System.out.println("Car is out if fuel");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car is in reserved mode, please refuel");
            currentFuelInLiters--;
        }
        System.out.println("Car is driving");
        currentFuelInLiters--;
    }

    public void addFuel(float fuel) {
        currentFuelInLiters += fuel;
    }

    public float getcurrentFuelLevel() {
        return currentFuelInLiters;
    }
}

class main {
    public static void main(String[] args) {
        Car myCar = new Car();
        // myCar.drive();
        myCar.addFuel(6);
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.addFuel(3);
        myCar.drive();
        System.out.println(myCar.getcurrentFuelLevel());
    }
}
