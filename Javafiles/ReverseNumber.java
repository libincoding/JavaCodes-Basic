import javax.swing.*;
import java.awt.event.*;

class ReverseNumber implements ActionListener {
public static void main(String[] args) {
JFrame f = new JFrame("Reverse Number");

JLabel l1 = new JLabel("Enter Number:");
l1.setBounds(50, 50, 100, 30);

JTextField t1 = new JTextField();
t1.setBounds(150, 50, 100, 30);

JButton b = new JButton("Reverse");
b.setBounds(100, 100, 100, 30);

JTextField t2 = new JTextField();
t2.setBounds(150, 150, 100, 30);

b.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String num = t1.getText();
String rev = "";

for (int i = num.length() - 1; i >= 0; i--) {
rev = rev + num.charAt(i);
}

t2.setText(rev);
}
});

f.add(l1);
f.add(t1);
f.add(b);
f.add(t2);

f.setSize(400, 300);
f.setLayout(null);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
} 