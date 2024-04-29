import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

public class StickFigure extends JComponent 
{
	
	private Rectangle2D.Double body;
	private Rectangle2D.Double rightLeg;
	private Rectangle2D.Double leftLeg;
	private Ellipse2D.Double face;
	private Rectangle2D.Double leftArm;
	private Rectangle2D.Double rightArm;
	public StickFigure(int x, int y)
	{
		body = new Rectangle2D.Double(30,20,10,60);
		leftArm = new Rectangle2D.Double(10,20,20,10);
		rightArm = new Rectangle2D.Double(40,20,20,10);
		leftLeg = new Rectangle2D.Double(20,80,10,30);
		rightLeg = new Rectangle2D.Double(40,80,10,30);
		face = new Ellipse2D.Double(25,0,20,20);
		
		this.setBounds(x,y,50,120);
		this.setFocusable(false);
		
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(body);
		g2.draw(leftLeg);
		g2.draw(rightLeg);
		g2.draw(rightArm);
		g2.draw(leftArm);
		g2.draw(face);
		g2.setColor(Color.BLUE);
		g2.fill(face);
		g2.fill(leftLeg);
		g2.fill(rightLeg);
		g2.fill(leftArm);
		g2.fill(rightArm);
		g2.fill(body);
		
	}
	
}
