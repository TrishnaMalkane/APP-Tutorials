
abstract class Product {
    int id;
    String name;
    double price;

    Product(int i, String n, double p) {
        id = i;
        name = n;
        price = p;
    }

    abstract double calculateDiscount();

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Final Price: " + (price - calculateDiscount()));
    }
}

class Electronics extends Product {
    Electronics(int i, String n, double p) {
        super(i, n, p);
    }

    double calculateDiscount() {
        return price * 0.10;
    }
}

class Clothing extends Product {
    Clothing(int i, String n, double p) {
        super(i, n, p);
    }

    double calculateDiscount() {
        return price * 0.20;
    }
}

class Books extends Product {
    Books(int i, String n, double p) {
        super(i, n, p);
    }

    double calculateDiscount() {
        return price * 0.05;
    }
}

public class q4_productDiscount {
    public static void main(String[] args) {
        Product[] p = {
                new Electronics(101, "Laptop", 50000),
                new Clothing(102, "Shirt", 1000),
                new Books(103, "Java Book", 500)
        };

        for (Product x : p) {
            x.display();
        }
    }
}
