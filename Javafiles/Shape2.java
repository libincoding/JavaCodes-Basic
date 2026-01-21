import java.applet.*;
import java.awt.*;

public class Shape2 extends Applet {
	public void paint(Graphics g) {
		// Base rectangle
		g.drawRect(150, 300, 500, 200);
		
		// Upper arcs (like windows or roof)
		g.drawArc(150, 200, 250, 200, 0, 180);
		g.drawArc(400, 200, 250, 200, 0, 180);
		
		// Smaller arcs (like wheels or lower details)
		g.drawArc(200, 250, 125, 100, 0, 180);
		g.drawArc(450, 250, 125, 100, 0, 180);
	}
	
	// Simple main method to run the applet in a window
	public static void main(String[] args) {
		java.awt.Frame f = new java.awt.Frame("Shape2");
		Shape2 applet = new Shape2();
		f.add(applet);
		f.setSize(1100, 900);
		f.setVisible(true);
		applet.init();
		applet.start();
	}
}

/*<applet code="Shape2" width="1100" height="900"></applet>*/