
import java.util.Scanner;

class Patient {
    String name;
    double fee, discount, finalAmount;

    Patient(String n, double f) {
        name = n;
        fee = f;
    }

    void calculate(double fee) {
        discount = fee >= 2000 ? fee * 0.10 : fee * 0.05;
        finalAmount = fee - discount;
    }

    void display() {
        System.out.println("Patient: " + name);
        System.out.println("Consultation Fee: " + fee);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);
    }
}

public class q4_patientBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patient[] p = new Patient[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Patient Name: ");
            String name = sc.nextLine();
            System.out.print("Consultation Fee: ");
            double fee = sc.nextDouble();
            sc.nextLine();

            p[i] = new Patient(name, fee);
            p[i].calculate(fee);
        }

        for (int i = 0; i < 5; i++) {
            p[i].display();
            System.out.println();
        }
        sc.close();
    }
}
