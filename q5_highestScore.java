
import java.util.Scanner;

public class q5_highestScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter score of student 1: ");
        int a = sc.nextInt();

        System.out.print("Enter score of student 2: ");
        int b = sc.nextInt();

        System.out.print("Enter score of student 3: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Student 1 has the highest score: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Student 2 has the highest score: " + b);
        } else {
            System.out.println("Student 3 has the highest score: " + c);
        }

        sc.close();
    }
}
