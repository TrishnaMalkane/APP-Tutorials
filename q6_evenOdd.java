
import java.util.Scanner;

public class q6_evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter seat number: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Even seat number");
        } else {
            System.out.println("Odd seat number");
        }

        sc.close();
    }
}
