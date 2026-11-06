
import java.util.Scanner;

public class q2_javaArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price of first product: ");
        int a = sc.nextInt();

        System.out.print("Enter price of second product: ");
        int b = sc.nextInt();

        System.out.println("Total: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));

        if (b != 0) {
            System.out.println("Quotient: " + (a / b));
            System.out.println("Remainder: " + (a % b));
        } else {
            System.out.println("Division by zero not possible");
        }

        sc.close();
    }
}
