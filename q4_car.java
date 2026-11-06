
class Car {
    String model;
    double price;

    Car() {
        model = "Unknown";
        price = 0;
    }

    Car(String m) {
        model = m;
        price = 0;
    }

    Car(String m, double p) {
        model = m;
        price = p;
    }

    void display() {
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class q4_car {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Swift");
        Car c3 = new Car("Honda City", 1200000);

        c1.display();
        c2.display();
        c3.display();
    }
}
