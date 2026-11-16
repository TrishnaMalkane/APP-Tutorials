
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Q5 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Course Management");
        f.setSize(550, 400);
        f.setLayout(null);

        JLabel l = new JLabel("Student Name:");
        l.setBounds(20, 20, 100, 30);

        JTextField name = new JTextField();
        name.setBounds(130, 20, 150, 30);

        String[] courses = { "Java", "Python", "DSA", "DBMS" };
        JList<String> list = new JList<>(courses);

        JScrollPane sp1 = new JScrollPane(list);
        sp1.setBounds(20, 70, 150, 130);

        String[] columns = { "Student", "Course", "Status" };
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);

        JScrollPane sp2 = new JScrollPane(table);
        sp2.setBounds(190, 70, 320, 200);

        JButton add = new JButton("Add");
        add.setBounds(50, 290, 100, 30);

        JButton remove = new JButton("Remove");
        remove.setBounds(200, 290, 100, 30);

        add.addActionListener(e -> {
            if (!name.getText().isEmpty() && list.getSelectedValue() != null) {
                model.addRow(new Object[] {
                        name.getText(), list.getSelectedValue(), "Enrolled"
                });
            }
        });

        remove.addActionListener(e -> {
            int row = table.getSelectedRow();
            if (row != -1) {
                model.removeRow(row);
            }
        });

        f.add(l);
        f.add(name);
        f.add(sp1);
        f.add(sp2);
        f.add(add);
        f.add(remove);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
