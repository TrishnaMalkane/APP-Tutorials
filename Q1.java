
import javax.swing.*;

class StudentModel {
    String name;
    int total;
    double average;
    String grade;

    void calculate(String name, int a, int b, int c) {
        this.name = name;
        total = a + b + c;
        average = total / 3.0;

        if (average >= 90)
            grade = "A";
        else if (average >= 75)
            grade = "B";
        else if (average >= 60)
            grade = "C";
        else if (average >= 50)
            grade = "D";
        else
            grade = "F";
    }
}

class StudentView extends JFrame {
    JTextField name = new JTextField();
    JTextField m1 = new JTextField();
    JTextField m2 = new JTextField();
    JTextField m3 = new JTextField();
    JButton button = new JButton("Calculate Result");

    StudentView() {
        setTitle("Student Grade Calculator");
        setSize(350, 300);
        setLayout(new java.awt.GridLayout(5, 2, 10, 10));

        add(new JLabel("Student Name:"));
        add(name);
        add(new JLabel("Subject 1:"));
        add(m1);
        add(new JLabel("Subject 2:"));
        add(m2);
        add(new JLabel("Subject 3:"));
        add(m3);
        add(button);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

class StudentController {
    StudentController(StudentModel model, StudentView view) {
        view.button.addActionListener(e -> {
            try {
                int a = Integer.parseInt(view.m1.getText());
                int b = Integer.parseInt(view.m2.getText());
                int c = Integer.parseInt(view.m3.getText());

                if (a < 0 || a > 100 || b < 0 || b > 100 || c < 0 || c > 100) {
                    JOptionPane.showMessageDialog(view, "Enter marks from 0 to 100");
                    return;
                }

                model.calculate(view.name.getText(), a, b, c);

                JOptionPane.showMessageDialog(view,
                        "Name: " + model.name +
                                "\nTotal: " + model.total +
                                "\nAverage: " + model.average +
                                "\nGrade: " + model.grade);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(view, "Enter valid marks");
            }
        });
    }
}

public class Q1 {
    public static void main(String[] args) {
        StudentModel m = new StudentModel();
        StudentView v = new StudentView();
        new StudentController(m, v);
    }
}
