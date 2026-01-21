import javax.swing.*;

public class DeleteText {
public static void main(String[] args) {
JFrame f = new JFrame();

JTextArea ta = new JTextArea();
ta.setBounds(50, 50, 300, 200);

JTextField tf = new JTextField();
tf.setBounds(50, 270, 200, 30);

JButton b = new JButton("Delete");
b.setBounds(260, 270, 90, 30);

b.addActionListener(e -> {
String text = ta.getText();
String word = tf.getText();
ta.setText(text.replace(word, ""));
});

f.add(ta);
f.add(tf);
f.add(b);
f.setSize(400, 400);
f.setLayout(null);
f.setVisible(true);
}
}