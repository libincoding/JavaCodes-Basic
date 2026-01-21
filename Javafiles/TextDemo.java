import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextDemo implements ActionListener {
  JFrame f;
  JLabel l1;
  JTextField t1;
  JTextArea t2;
  JButton b1;

  TextDemo() {
    f = new JFrame("TextDemo");
    f.setLayout(null);
    l1 = new JLabel("Enter a string");
    t1 = new JTextField();
    t2 = new JTextArea("This is a Sample text");
    b1 = new JButton("Delete");

    // reasonable bounds for components
    l1.setBounds(100, 100, 150, 30);
    t1.setBounds(275, 100, 150, 30);
    t2.setBounds(100, 150, 600, 300);
    b1.setBounds(350, 470, 100, 30);

    f.add(l1);
    f.add(t1);
    f.add(t2);
    f.add(b1);
    f.setSize(800, 800);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
    b1.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent ae) {
    String s = t1.getText();
    String txt = t2.getText();
    if (s != null && !s.isEmpty()) {
      t2.setText(txt.replace(s, ""));
    }
  }

  public static void main(String args[]) {
    SwingUtilities.invokeLater(() -> new TextDemo());
  }
}
