
class StudentDetails {
    String name;
    int rollNo;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

public class q3_studentRegistration {
    public static void main(String[] args) {
        StudentDetails s = new StudentDetails();

        s.name = "Rahul";
        s.rollNo = 102;

        s.display();
    }
}
