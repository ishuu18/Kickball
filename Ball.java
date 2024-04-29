

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class Ball extends JComponent
{
	private Ellipse2D.Double ball = new Ellipse2D.Double(0,0,10,10);
			
	public Ball(int x, int y)
	{
		this.setSize(new Dimension(11,11));
		this.setLocation(x,y);
	}
			

	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.GRAY);
		g2.draw(ball);
		g2.setColor(Color.BLUE);
		g2.fill(ball);
			
	}
		
}


