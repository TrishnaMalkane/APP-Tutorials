
class StudentRecord {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class q5_twoStudents {
    public static void main(String[] args) {
        StudentRecord s1 = new StudentRecord();
        StudentRecord s2 = new StudentRecord();

        s1.name = "Rahul";
        s1.age = 19;

        s2.name = "Priya";
        s2.age = 20;

        s1.display();
        s2.display();
    }
}
