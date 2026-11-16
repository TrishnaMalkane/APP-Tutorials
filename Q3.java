
import javax.swing.*;

public class Q3 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Student Registration");
        f.setSize(350, 350);
        f.setLayout(null);

        JLabel l1 = new JLabel("Name:");
        l1.setBounds(30, 30, 100, 30);
        JTextField name = new JTextField();
        name.setBounds(140, 30, 150, 30);

        JLabel l2 = new JLabel("Register No:");
        l2.setBounds(30, 70, 100, 30);
        JTextField reg = new JTextField();
        reg.setBounds(140, 70, 150, 30);

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        male.setBounds(80, 110, 80, 30);
        female.setBounds(170, 110, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        String[] departments = { "CSE", "ECE", "EEE", "IT" };
        JComboBox<String> dept = new JComboBox<>(departments);
        dept.setBounds(140, 160, 150, 30);

        JButton b = new JButton("Submit");
        b.setBounds(110, 220, 100, 30);

        b.addActionListener(e -> {
            String gender = male.isSelected() ? "Male" : female.isSelected() ? "Female" : "Not Selected";

            JOptionPane.showMessageDialog(f,
                    "Name: " + name.getText() +
                            "\nRegister No: " + reg.getText() +
                            "\nGender: " + gender +
                            "\nDepartment: " + dept.getSelectedItem());
        });

        f.add(l1);
        f.add(name);
        f.add(l2);
        f.add(reg);
        f.add(male);
        f.add(female);
        f.add(dept);
        f.add(b);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
