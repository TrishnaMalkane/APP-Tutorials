
import student.Student;
import course.Course;

public class Q1 {
    public static void main(String[] args) {
        Student s = new Student(101, "Arun");
        Course c = new Course(201, "Java Programming");

        s.display();
        c.display();
    }
}
