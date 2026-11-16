
import javax.swing.*;

public class Q6 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Text Editor");
        f.setSize(500, 400);

        JTextArea text = new JTextArea();
        JScrollPane sp = new JScrollPane(text);

        JMenuBar mb = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");

        JMenuItem newFile = new JMenuItem("New");
        JMenuItem clear = new JMenuItem("Clear");
        JMenuItem exit = new JMenuItem("Exit");

        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");

        newFile.addActionListener(e -> text.setText(""));
        clear.addActionListener(e -> text.setText(""));
        exit.addActionListener(e -> f.dispose());

        cut.addActionListener(e -> text.cut());
        copy.addActionListener(e -> text.copy());
        paste.addActionListener(e -> text.paste());

        file.add(newFile);
        file.add(clear);
        file.add(exit);

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);

        mb.add(file);
        mb.add(edit);

        f.setJMenuBar(mb);
        f.add(sp);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
