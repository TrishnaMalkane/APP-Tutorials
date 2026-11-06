
import java.util.Scanner;

public class q1_bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] price = new int[5];
        int total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter price of product " + (i + 1) + ": ");
            price[i] = sc.nextInt();
            total += price[i];
        }

        System.out.println("Total Bill: " + total);

        if (total > 5000) {
            System.out.println("Discount Applicable");
        } else {
            System.out.println("No Discount");
        }

        sc.close();
    }
}
