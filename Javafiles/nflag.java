import javax.swing.*;
import java.awt.*;

public class nflag extends JFrame {

    public static void main(String[] args) {
        nflag frame = new nflag();
        frame.setVisible(true);
    }

    public nflag() {
        setTitle("Flag");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
    }

    public void paint(Graphics g) {
        super.paint(g);

        Color saffron = new Color(244, 196, 48);

        // Flag stripes
        g.setColor(saffron);
        g.fillRect(10, 10, 180, 40);

        g.setColor(Color.WHITE);
        g.fillRect(10, 50, 180, 40);

        g.setColor(Color.GREEN);
        g.fillRect(10, 90, 180, 40);

        // Chakra with 24 spokes
        g.setColor(Color.BLUE);
        g.drawOval(85, 50, 40, 40);
        
        // 24 lines from center
        g.drawLine(105, 70, 125, 70);
        g.drawLine(105, 70, 124, 75);
        g.drawLine(105, 70, 122, 80);
        g.drawLine(105, 70, 119, 85);
        g.drawLine(105, 70, 115, 89);
        g.drawLine(105, 70, 110, 90);
        g.drawLine(105, 70, 105, 90);
        g.drawLine(105, 70, 100, 90);
        g.drawLine(105, 70, 95, 89);
        g.drawLine(105, 70, 91, 85);
        g.drawLine(105, 70, 88, 80);
        g.drawLine(105, 70, 86, 75);
        g.drawLine(105, 70, 85, 70);
        g.drawLine(105, 70, 86, 65);
        g.drawLine(105, 70, 88, 60);
        g.drawLine(105, 70, 91, 55);
        g.drawLine(105, 70, 95, 51);
        g.drawLine(105, 70, 100, 50);
        g.drawLine(105, 70, 105, 50);
        g.drawLine(105, 70, 110, 50);
        g.drawLine(105, 70, 115, 51);
        g.drawLine(105, 70, 119, 55);
        g.drawLine(105, 70, 122, 60);
        g.drawLine(105, 70, 124, 65);
        
        g.fillOval(102, 67, 6, 6);
    }
}