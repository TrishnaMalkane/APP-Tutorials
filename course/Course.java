
package course;

public class Course {
    int code;
    String name;

    public Course(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public void display() {
        System.out.println("Course Code: " + code);
        System.out.println("Course Name: " + name);
    }
}
