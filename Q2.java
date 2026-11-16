
import javax.swing.*;

class ServiceModel {
    int calculate(boolean a, boolean b, boolean c, boolean d) {
        int total = 0;

        if (a)
            total += 1000;
        if (b)
            total += 800;
        if (c)
            total += 1200;
        if (d)
            total += 500;

        return total;
    }
}

class ServiceView extends JFrame {
    JTextField reg = new JTextField();
    JComboBox<String> type = new JComboBox<>(new String[] { "Two Wheeler", "Car" });

    JCheckBox c1 = new JCheckBox("General Service - Rs.1000");
    JCheckBox c2 = new JCheckBox("Oil Change - Rs.800");
    JCheckBox c3 = new JCheckBox("Brake Service - Rs.1200");
    JCheckBox c4 = new JCheckBox("Battery Check - Rs.500");

    JButton button = new JButton("Calculate Cost");
    JLabel result = new JLabel("Total: Rs.0");

    ServiceView() {
        setTitle("Vehicle Service");
        setSize(400, 400);
        setLayout(new java.awt.GridLayout(9, 1));

        add(new JLabel("Vehicle Registration Number:"));
        add(reg);
        add(type);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(button);
        add(result);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

class ServiceController {
    ServiceController(ServiceModel m, ServiceView v) {
        v.button.addActionListener(e -> {
            int total = m.calculate(
                    v.c1.isSelected(),
                    v.c2.isSelected(),
                    v.c3.isSelected(),
                    v.c4.isSelected());

            v.result.setText("Total: Rs." + total);
            JOptionPane.showMessageDialog(v,
                    "Vehicle: " + v.reg.getText() +
                            "\nType: " + v.type.getSelectedItem() +
                            "\nTotal Cost: Rs." + total);
        });
    }
}

public class Q2 {
    public static void main(String[] args) {
        ServiceModel m = new ServiceModel();
        ServiceView v = new ServiceView();
        new ServiceController(m, v);
    }
}
