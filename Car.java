class Car {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public Car(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }
    @Override
    public String toString() {
        return "Car [noOfWheels=" + noOfWheels + ", noOfDoors=" + noOfDoors + ", maxSpeed=" + maxSpeed + ", name="
                + name + ", modelNumber=" + modelNumber + ", company=" + company + "]";
    }
}


class MyCar {
    public static void main(String[] args) {
        Car swift = new Car(4, 4, 210, "Thar", "SW897", "Maruti");
        System.out.println(swift.toString());
    }
}
