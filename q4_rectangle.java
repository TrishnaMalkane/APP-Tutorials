
class Rectangle {
    double length;
    double breadth;

    void area() {
        double a = length * breadth;
        System.out.println("Area: " + a);
    }
}

public class q4_rectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.length = 10;
        r.breadth = 5;

        r.area();
    }
}
