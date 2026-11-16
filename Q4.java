
import javax.swing.*;

public class Q4 {
    public static void main(String[] args) {
        JFrame f = new JFrame("User Login");
        f.setSize(350, 300);
        f.setLayout(null);

        JLabel l1 = new JLabel("Username:");
        l1.setBounds(30, 30, 100, 30);

        JTextField user = new JTextField();
        user.setBounds(140, 30, 150, 30);

        JLabel l2 = new JLabel("Password:");
        l2.setBounds(30, 70, 100, 30);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(140, 70, 150, 30);

        JCheckBox c1 = new JCheckBox("Remember Me");
        c1.setBounds(50, 120, 130, 30);

        JCheckBox c2 = new JCheckBox("Receive Notifications");
        c2.setBounds(50, 150, 200, 30);

        JButton b = new JButton("Login");
        b.setBounds(110, 200, 100, 30);

        b.addActionListener(e -> {
            String username = user.getText();
            String password = new String(pass.getPassword());

            if (!username.isEmpty() && !password.isEmpty()) {
                JOptionPane.showMessageDialog(f,
                        "Login Successful\nWelcome " + username +
                                "\nRemember Me: " + c1.isSelected() +
                                "\nNotifications: " + c2.isSelected());
            } else {
                JOptionPane.showMessageDialog(f, "Enter all details");
            }
        });

        f.add(l1);
        f.add(user);
        f.add(l2);
        f.add(pass);
        f.add(c1);
        f.add(c2);
        f.add(b);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
