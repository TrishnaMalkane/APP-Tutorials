
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int[] marks = new int[3];
    double attendance, average;
}

public class q2_studentPerformance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[5];
        int highest = 0;

        for (int i = 0; i < 5; i++) {
            s[i] = new Student();

            System.out.print("Roll No: ");
            s[i].rollNo = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            s[i].name = sc.nextLine();

            int total = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                s[i].marks[j] = sc.nextInt();
                total += s[i].marks[j];
            }

            System.out.print("Attendance: ");
            s[i].attendance = sc.nextDouble();
            s[i].average = total / 3.0;

            System.out.println("Total: " + total);
            System.out.println("Average: " + s[i].average);
            System.out.println(s[i].average >= 50 ? "Pass" : "Fail");
            System.out.println(s[i].average >= 75 && s[i].attendance >= 80 ? "Scholarship Eligible" : "Not Eligible");
            System.out.println(s[i].average >= 85 ? "Excellent" : "Good");

            if (s[i].average > s[highest].average) {
                highest = i;
            }
        }

        System.out.println("\nHighest Average: " + s[highest].name);
        System.out.println("Average: " + s[highest].average);
        sc.close();
    }
}
