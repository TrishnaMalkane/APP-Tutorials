
import java.sql.*;
import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String password = System.getenv("MYSQL_PASSWORD");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/appdb",
                    "root", password);

            System.out.print("Enter Course Code: ");
            String code = sc.nextLine();

            PreparedStatement ps = con.prepareStatement(
                    "SELECT * FROM CourseRegistration WHERE CourseCode=?");

            ps.setString(1, code);

            ResultSet rs = ps.executeQuery();

            boolean found = false;

            while (rs.next()) {
                found = true;

                System.out.println("Student ID: " +
                        rs.getInt("StudentID"));

                System.out.println("Student Name: " +
                        rs.getString("StudentName"));

                System.out.println("Course Code: " +
                        rs.getString("CourseCode"));

                System.out.println("Course Name: " +
                        rs.getString("CourseName"));

                System.out.println("Semester: " +
                        rs.getInt("Semester"));

                System.out.println("-------------------");
            }

            if (!found) {
                System.out.println("No students registered for this course");
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        sc.close();
    }
}
