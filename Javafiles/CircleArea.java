import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
class CircleArea implements ActionListener 
{ 
JFrame f; 
JLabel l1,l2; 
JTextField t1,t2; 
JButton b; 
CircleArea() 
{ 
f=new JFrame("Circle_Area "); 
f.setLayout(null); 
l1=new JLabel("Enter Radius"); 
l2=new JLabel("Area "); 
t1=new JTextField(); 
t2=new JTextField(); 
b=new JButton("Calculate Area");   
l1.setBounds(100,100,150,100); 
l2.setBounds(100,230,150,100); 
t1.setBounds(275,100,150,70); 
t2.setBounds(275,230,150,70); 
b.setBounds(200,320,200,70); 
f.add(l1);f.add(t1); 
f.add(l2);f.add(t2); 
f.add(b); 
f.setSize(600,600); 
f.setVisible(true); 
b.addActionListener(this);   
} 
public void actionPerformed(ActionEvent ae) 
{ 
int r=Integer.parseInt(t1.getText()); 
double area=3.14*r*r;  
t2.setText(area+"");   
} 
public static void main(String args[]) 
{ 
new CircleArea(); 
} 
} 