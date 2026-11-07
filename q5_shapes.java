
import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double calculateArea() {
        return length * breadth;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class q5_shapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter length and breadth: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.print("Enter base and height: ");
        double base = sc.nextDouble();
        double h = sc.nextDouble();

        Shape[] shapes = {
                new Circle(r),
                new Rectangle(l, b),
                new Triangle(base, h)
        };

        System.out.println("Circle Area: " + shapes[0].calculateArea());
        System.out.println("Rectangle Area: " + shapes[1].calculateArea());
        System.out.println("Triangle Area: " + shapes[2].calculateArea());

        sc.close();
    }
}
