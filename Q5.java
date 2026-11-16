
import java.sql.*;
import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String password = System.getenv("MYSQL_PASSWORD");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/appdb",
                    "root", password);

            int ch;

            do {
                System.out.println("\n1. Insert Product");
                System.out.println("2. Search Product");
                System.out.println("3. Update Quantity");
                System.out.println("4. Low Stock Products");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                ch = sc.nextInt();

                if (ch == 1) {
                    System.out.print("Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();

                    PreparedStatement ps = con.prepareStatement(
                            "INSERT INTO Product VALUES (?, ?, ?, ?)");

                    ps.setInt(1, id);
                    ps.setString(2, name);
                    ps.setDouble(3, price);
                    ps.setInt(4, qty);

                    ps.executeUpdate();
                    System.out.println("Product inserted");
                    ps.close();
                }

                else if (ch == 2) {
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();

                    PreparedStatement ps = con.prepareStatement(
                            "SELECT * FROM Product WHERE ProductID=?");

                    ps.setInt(1, id);
                    ResultSet rs = ps.executeQuery();

                    if (rs.next()) {
                        System.out.println(
                                rs.getInt("ProductID") + " " +
                                        rs.getString("ProductName") + " " +
                                        rs.getDouble("Price") + " " +
                                        rs.getInt("Quantity"));
                    } else {
                        System.out.println("Product not found");
                    }

                    rs.close();
                    ps.close();
                }

                else if (ch == 3) {
                    System.out.print("Product ID: ");
                    int id = sc.nextInt();

                    System.out.print("New Quantity: ");
                    int qty = sc.nextInt();

                    PreparedStatement ps = con.prepareStatement(
                            "UPDATE Product SET Quantity=? WHERE ProductID=?");

                    ps.setInt(1, qty);
                    ps.setInt(2, id);

                    int n = ps.executeUpdate();

                    if (n > 0)
                        System.out.println("Quantity updated");
                    else
                        System.out.println("Product not found");

                    ps.close();
                }

                else if (ch == 4) {
                    PreparedStatement ps = con.prepareStatement(
                            "SELECT * FROM Product WHERE Quantity < 10");

                    ResultSet rs = ps.executeQuery();

                    while (rs.next()) {
                        System.out.println(
                                rs.getInt("ProductID") + " " +
                                        rs.getString("ProductName") + " " +
                                        rs.getDouble("Price") + " " +
                                        rs.getInt("Quantity"));
                    }

                    rs.close();
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
