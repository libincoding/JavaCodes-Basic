import javax.swing.*;
import java.awt.*;

public class IndianFlag extends JPanel {
    
    private static final Color SAFFRON = new Color(255, 153, 51);
    private static final Color INDIA_GREEN = new Color(19, 136, 8);
    private static final int FLAG_X = 100;
    private static final int FLAG_Y = 50;
    private static final int FLAG_WIDTH = 200;
    private static final int BAND_HEIGHT = 50;
    private static final int CHAKRA_SIZE = 50;
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawFlag(g);
    }
    
    private void drawFlag(Graphics g) {
        drawSaffronBand(g);
        drawWhiteBand(g);
        drawGreenBand(g);
        drawChakra(g);
    }
    
    private void drawSaffronBand(Graphics g) {
        g.setColor(SAFFRON);
        g.fillRect(FLAG_X, FLAG_Y, FLAG_WIDTH, BAND_HEIGHT);
    }
    
    private void drawWhiteBand(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(FLAG_X, FLAG_Y + BAND_HEIGHT, FLAG_WIDTH, BAND_HEIGHT);
    }
    
    private void drawGreenBand(Graphics g) {
        g.setColor(INDIA_GREEN);
        g.fillRect(FLAG_X, FLAG_Y + 2 * BAND_HEIGHT, FLAG_WIDTH, BAND_HEIGHT);
    }
    
    private void drawChakra(Graphics g) {
        g.setColor(Color.BLUE);
        int chakraX = FLAG_X + (FLAG_WIDTH - CHAKRA_SIZE) / 2;
        int chakraY = FLAG_Y + BAND_HEIGHT;
        g.fillOval(chakraX, chakraY, CHAKRA_SIZE, CHAKRA_SIZE);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
    
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Indian Flag");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new IndianFlag());
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}