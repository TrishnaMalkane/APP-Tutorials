
import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Monthly Salary: " + salary);
    }

    void annualSalary() {
        System.out.println("Annual Salary: " + salary * 12);
    }

    void bonus() {
        double amount = salary >= 30000 ? salary * 12 * 0.10 : 0;
        System.out.println("Bonus: " + amount);
    }

    void eligibility() {
        System.out.println(salary >= 30000 ? "Bonus Eligible" : "Not Eligible");
    }
}

public class q3_employeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] e = new Employee[5];

        for (int i = 0; i < 5; i++) {
            e[i] = new Employee();
            System.out.print("Employee ID: ");
            e[i].id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            e[i].name = sc.nextLine();
            System.out.print("Monthly Salary: ");
            e[i].salary = sc.nextDouble();
        }

        for (int i = 0; i < 5; i++) {
            e[i].display();
            e[i].annualSalary();
            e[i].bonus();
            e[i].eligibility();
            System.out.println();
        }
        sc.close();
    }
}
