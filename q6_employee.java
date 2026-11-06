
class Employee {
    int id;
    String name;
    double salary;

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class q6_employee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.id = 101;
        e1.name = "Arun";
        e1.salary = 30000;

        e2.id = 102;
        e2.name = "Priya";
        e2.salary = 35000;

        e1.display();
        e2.display();
    }
}
