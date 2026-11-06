
import java.util.Scanner;

public class q4_rollNoSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first roll number: ");
        int a = sc.nextInt();

        System.out.print("Enter second roll number: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Using temporary variable:");
        System.out.println("a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Without temporary variable:");
        System.out.println("a = " + a + ", b = " + b);

        sc.close();
    }
}
