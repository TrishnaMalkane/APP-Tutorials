
import java.util.Scanner;

class Product {
    int id, quantity;
    String name;
    double price;
}

public class q1_productBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] p = new Product[5];

        for (int i = 0; i < 5; i++) {
            p[i] = new Product();
            System.out.println("Product " + (i + 1));
            System.out.print("ID: ");
            p[i].id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            p[i].name = sc.nextLine();
            System.out.print("Price: ");
            p[i].price = sc.nextDouble();
            System.out.print("Quantity: ");
            p[i].quantity = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            double total = p[i].price * p[i].quantity;
            double discount = total >= 5000 ? total * 0.10 : total * 0.05;
            double finalPrice = total - discount;

            System.out.println("\nProduct ID: " + p[i].id);
            System.out.println("Name: " + p[i].name);
            System.out.println("Total Price: " + total);
            System.out.println("Discount: " + discount);
            System.out.println("Final Price: " + finalPrice);
        }
        sc.close();
    }
}
