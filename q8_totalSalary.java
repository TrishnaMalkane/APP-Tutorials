
import java.util.Scanner;

public class q8_totalSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        System.out.print("Enter allowance: ");
        double allowance = sc.nextDouble();

        double total = basic + allowance;

        System.out.println("Total monthly salary: " + total);

        sc.close();
    }
}
