import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterchangeText implements ActionListener {
    JTextField t1, t2;
    
    public void actionPerformed(ActionEvent e) {
        String temp = t1.getText();
        t1.setText(t2.getText());
        t2.setText(temp);
    }
    
    public static void main(String[] args) {
        JFrame f = new JFrame("Swap Values");
        f.setSize(300, 200);
        f.setLayout(null);
        
        JTextField t1 = new JTextField();
        t1.setBounds(50, 30, 200, 30);
        f.add(t1);
        
        JTextField t2 = new JTextField();
        t2.setBounds(50, 70, 200, 30);
        f.add(t2);
        
        JButton b = new JButton("Swap");
        b.setBounds(100, 110, 100, 30);
        f.add(b);
        
        InterchangeText it = new InterchangeText();
        it.t1 = t1;
        it.t2 = t2;
        b.addActionListener(it);
        
        f.setVisible(true);
    }
}