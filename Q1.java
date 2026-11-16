
class Vehicle {
    String vehicleNumber, brand;
    int speed;

    Vehicle(String number, String brand, int speed) {
        this.vehicleNumber = number;
        this.brand = brand;
        this.speed = speed;
    }

    void displayDetails() {
        System.out.println(vehicleNumber + " " + brand + " " + speed);
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(String number, String brand, int speed, int doors) {
        super(number, brand, speed);
        numberOfDoors = doors;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Doors: " + numberOfDoors);
    }
}

class Bike extends Vehicle {
    boolean hasGear;

    Bike(String number, String brand, int speed, boolean gear) {
        super(number, brand, speed);
        hasGear = gear;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Has Gear: " + hasGear);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Vehicle v;

        v = new Car("TN01AB1234", "Honda", 120, 4);
        v.displayDetails();

        v = new Bike("TN02CD5678", "Yamaha", 100, true);
        v.displayDetails();
    }
}
