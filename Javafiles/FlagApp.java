import javax.swing.*;
import java.awt.*;

public class FlagApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame f = new JFrame("Flag");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.add(new FlagPanel());
            f.setSize(400, 300);
            f.setLocationRelativeTo(null);
            f.setVisible(true);
        });
    }

    static class FlagPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g0) {
            super.paintComponent(g0);
            Graphics2D g = (Graphics2D) g0.create();
            try {
                g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                Color saffron = new Color(244, 196, 48);
                g.setColor(saffron);
                g.fillRect(10, 10, 180, 40);

                g.setColor(Color.white);
                g.fillRect(10, 50, 180, 40);

                g.setColor(Color.green);
                g.fillRect(10, 90, 180, 40);

                // wheel outline
                g.setColor(Color.blue);
                int centerX = 105, centerY = 70, r = 20;
                g.drawOval(centerX - r, centerY - r, r * 2, r * 2);

                // 24 spokes
                for (int i = 0; i < 24; i++) {
                    double angleDeg = i * (360.0 / 24.0);
                    double angleRad = Math.toRadians(angleDeg);
                    int x2 = (int) Math.round(centerX + r * Math.cos(angleRad));
                    int y2 = (int) Math.round(centerY + r * Math.sin(angleRad));
                    g.drawLine(centerX, centerY, x2, y2);
                }
            } finally {
                g.dispose();
            }
        }
    }
}

