
class Employee {
    String name;
    int id;
    double basic;

    Employee(String n, int i, double b) {
        name = n;
        id = i;
        basic = b;
    }

    double calculateSalary() {
        return basic;
    }
}

class Professor extends Employee {
    Professor(String n, int i, double b) {
        super(n, i, b);
    }

    double calculateSalary() {
        return basic + 10000;
    }
}

class LabAssistant extends Employee {
    LabAssistant(String n, int i, double b) {
        super(n, i, b);
    }

    double calculateSalary() {
        return basic + 5000;
    }
}

class AdministrativeStaff extends Employee {
    AdministrativeStaff(String n, int i, double b) {
        super(n, i, b);
    }

    double calculateSalary() {
        return basic + 3000;
    }
}

public class q2_employeeSalary {
    public static void main(String[] args) {
        Employee[] e = {
                new Professor("Arun", 101, 50000),
                new LabAssistant("Priya", 102, 30000),
                new AdministrativeStaff("Ravi", 103, 25000)
        };

        for (Employee x : e) {
            System.out.println("Name: " + x.name);
            System.out.println("ID: " + x.id);
            System.out.println("Salary: " + x.calculateSalary());
        }
    }
}
