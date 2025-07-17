class Car {

    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    public Car start() {
        if (currentFuelInLiters == 0) {
            System.out.println("Car is out if fuel, can not start");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car is in reserved mode, please refuel");

        } else {
            System.out.println("Car is started.. bruhhhh.....");
        }
        return this;
    }

    public void drive() {
        currentFuelInLiters--;
        System.out.println("Car is driving");

    }

    public void addFuel(float fuel) {
        currentFuelInLiters += fuel;
    }

    public float getcurrentFuelLevel() {
        return currentFuelInLiters;
    }
}

class Driver {
    public static void main(String[] args) {
        Car myCar = new Car();
        // myCar.drive();
        // myCar.addFuel(6);
        // myCar.drive();
        // myCar.drive();
        // myCar.drive();
        // myCar.addFuel(3);
        // myCar.drive();
        // System.out.println(myCar.getcurrentFuelevel());

        Car swift = new Car();
        swift.addFuel(6);
        Car startedCar = swift.start();
        startedCar.drive();

    }
}
