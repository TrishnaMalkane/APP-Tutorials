
class Area {
    void calculate(int side) {
        System.out.println("Area of Square: " + (side * side));
    }

    void calculate(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    void calculate(double radius) {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}

public class q5_area {
    public static void main(String[] args) {
        Area a = new Area();

        a.calculate(5);
        a.calculate(10, 6);
        a.calculate(4.5);
    }
}
