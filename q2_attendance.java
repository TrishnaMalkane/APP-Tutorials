
import java.util.Scanner;

public class q2_attendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] attendance = new int[7];
        int present = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter attendance for day " + (i + 1) + ": ");
            attendance[i] = sc.nextInt();

            if (attendance[i] == 1) {
                present++;
            }
        }

        double percentage = present * 100.0 / 7;

        System.out.println("Present Days: " + present);
        System.out.println("Attendance: " + percentage + "%");

        if (percentage >= 75) {
            System.out.println("Eligible for Exam");
        } else {
            System.out.println("Not Eligible");
        }

        sc.close();
    }
}
