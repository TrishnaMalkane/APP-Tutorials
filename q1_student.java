
class Student {
    String name;
    int rollNo;
    String dept;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Department: " + dept);
    }
}

public class q1_student {
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Rahul";
        s.rollNo = 101;
        s.dept = "CSE";

        s.display();
    }
}
