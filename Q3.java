
import javax.swing.*;
import java.util.ArrayList;

class EmployeeModel {
    String password = "admin123";
    ArrayList<String> employees = new ArrayList<>();

    boolean login(String user, String pass) {
        return user.equals("admin") && pass.equals(password);
    }

    void addEmployee(String id, String name, String dept) {
        employees.add(id + " - " + name + " - " + dept);
    }
}

class EmployeeView extends JFrame {
    JTextField user = new JTextField();
    JPasswordField pass = new JPasswordField();
    JButton login = new JButton("Login");

    JMenuItem add = new JMenuItem("Add Employee");
    JMenuItem view = new JMenuItem("View Employee");
    JMenuItem change = new JMenuItem("Change Password");
    JMenuItem logout = new JMenuItem("Logout");
    JMenuItem exit = new JMenuItem("Exit Application");

    EmployeeView() {
        setTitle("Employee Login");
        setSize(350, 200);
        setLayout(new java.awt.GridLayout(3, 2));

        add(new JLabel("Username:"));
        add(user);
        add(new JLabel("Password:"));
        add(pass);
        add(login);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    void showPortal() {
        getContentPane().removeAll();
        setLayout(new java.awt.BorderLayout());
        add(new JLabel("Welcome to Employee Management Portal",
                SwingConstants.CENTER));

        JMenuBar bar = new JMenuBar();
        JMenu emp = new JMenu("Employee");
        JMenu tools = new JMenu("Tools");
        JMenu ex = new JMenu("Exit");

        emp.add(add);
        emp.add(view);
        tools.add(change);
        ex.add(logout);
        ex.add(exit);

        bar.add(emp);
        bar.add(tools);
        bar.add(ex);

        setJMenuBar(bar);
        setSize(450, 300);
        revalidate();
        repaint();
    }
}

class EmployeeController {
    EmployeeController(EmployeeModel m, EmployeeView v) {
        v.login.addActionListener(e -> {
            if (m.login(v.user.getText(), new String(v.pass.getPassword()))) {
                JOptionPane.showMessageDialog(v, "Login Successful");
                v.showPortal();
            } else {
                JOptionPane.showMessageDialog(v, "Invalid Credentials");
            }
        });

        v.add.addActionListener(e -> {
            String id = JOptionPane.showInputDialog(v, "Employee ID:");
            if (id == null)
                return;
            String name = JOptionPane.showInputDialog(v, "Employee Name:");
            if (name == null)
                return;
            String dept = JOptionPane.showInputDialog(v, "Department:");
            if (dept == null)
                return;

            m.addEmployee(id, name, dept);
            JOptionPane.showMessageDialog(v, "Employee Added");
        });

        v.view.addActionListener(e -> {
            JOptionPane.showMessageDialog(v,
                    m.employees.isEmpty() ? "No Employees" : String.join("\n", m.employees));
        });

        v.change.addActionListener(e -> {
            JPasswordField oldPass = new JPasswordField();
            JPasswordField newPass = new JPasswordField();
            JPasswordField confirm = new JPasswordField();

            Object[] fields = {
                    "Old Password:", oldPass,
                    "New Password:", newPass,
                    "Confirm Password:", confirm
            };

            int choice = JOptionPane.showConfirmDialog(v, fields,
                    "Change Password", JOptionPane.OK_CANCEL_OPTION);

            if (choice != JOptionPane.OK_OPTION)
                return;

            String old = new String(oldPass.getPassword());
            String next = new String(newPass.getPassword());
            String check = new String(confirm.getPassword());

            if (!old.equals(m.password))
                JOptionPane.showMessageDialog(v, "Incorrect Old Password");
            else if (next.isEmpty() || !next.equals(check))
                JOptionPane.showMessageDialog(v, "Passwords Do Not Match");
            else {
                m.password = next;
                JOptionPane.showMessageDialog(v, "Password Changed");
            }
        });

        v.logout.addActionListener(e -> {
            v.dispose();
            new EmployeeController(m, new EmployeeView());
        });

        v.exit.addActionListener(e -> System.exit(0));
    }
}

public class Q3 {
    public static void main(String[] args) {
        new EmployeeController(new EmployeeModel(), new EmployeeView());
    }
}
