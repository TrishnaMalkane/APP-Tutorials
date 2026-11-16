
import java.sql.*;
import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String password = System.getenv("MYSQL_PASSWORD");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/appdb",
                    "root", password);

            int ch;

            do {
                System.out.println("\n1. Insert Book");
                System.out.println("2. Search Book");
                System.out.println("3. Display Available Books");
                System.out.println("4. Issue Book");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                ch = sc.nextInt();

                if (ch == 1) {
                    System.out.print("Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Title: ");
                    String title = sc.nextLine();

                    System.out.print("Author: ");
                    String author = sc.nextLine();

                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    PreparedStatement ps = con.prepareStatement(
                            "INSERT INTO Book VALUES (?, ?, ?, ?, ?)");

                    ps.setInt(1, id);
                    ps.setString(2, title);
                    ps.setString(3, author);
                    ps.setDouble(4, price);
                    ps.setString(5, "Available");

                    ps.executeUpdate();
                    System.out.println("Book inserted");
                    ps.close();
                }

                else if (ch == 2) {
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();

                    PreparedStatement ps = con.prepareStatement(
                            "SELECT * FROM Book WHERE BookID=?");
                    ps.setInt(1, id);

                    ResultSet rs = ps.executeQuery();

                    if (rs.next()) {
                        System.out.println(
                                rs.getInt("BookID") + " " +
                                        rs.getString("Title") + " " +
                                        rs.getString("Author") + " " +
                                        rs.getDouble("Price") + " " +
                                        rs.getString("Availability"));
                    } else {
                        System.out.println("Book not found");
                    }

                    rs.close();
                    ps.close();
                }

                else if (ch == 3) {
                    PreparedStatement ps = con.prepareStatement(
                            "SELECT * FROM Book WHERE Availability='Available'");

                    ResultSet rs = ps.executeQuery();

                    while (rs.next()) {
                        System.out.println(
                                rs.getInt("BookID") + " " +
                                        rs.getString("Title") + " " +
                                        rs.getString("Author") + " " +
                                        rs.getDouble("Price"));
                    }

                    rs.close();
                    ps.close();
                }

                else if (ch == 4) {
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();

                    PreparedStatement ps = con.prepareStatement(
                            "UPDATE Book SET Availability='Issued' " +
                                    "WHERE BookID=? AND Availability='Available'");

                    ps.setInt(1, id);

                    int n = ps.executeUpdate();

                    if (n > 0)
                        System.out.println("Book issued");
                    else
                        System.out.println("Book not found or already issued");

                    ps.close();
                }

            } while (ch != 5);

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        sc.close();
    }
}
