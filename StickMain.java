import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class StickMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("KickBall");
		
		frame.setBounds(200,50,1000,1000);
		frame.setLayout(null);
		frame.setSize(1000,1000);
		
		StickFigure sf = new StickFigure(50,50);
		Ball ball = new Ball(70,100);
		frame.add(sf);
		frame.add(ball);
		
		
		
		
		frame.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int code = e.getKeyCode();
				int xValue = sf.getX();
				int yValue = sf.getY();
				
				
				switch(code)
				{
				case KeyEvent.VK_A:
					 if (sf.getX() > 0) {
					        if (ball.getX() < xValue && ball.getX() + ball.getWidth() > xValue &&
					            ball.getY() < yValue + sf.getHeight() && ball.getY() + ball.getHeight() > yValue) {
					            ball.setLocation(xValue - ball.getWidth(), ball.getY());
					        } else {
					            sf.setLocation(xValue - 5, sf.getY());
					        }
					    }
					break;
				case KeyEvent.VK_D:
					 if (xValue < frame.getWidth() - sf.getWidth()) {
					        if (ball.getX() < xValue + sf.getWidth() && ball.getX() + ball.getWidth() > xValue + sf.getWidth() &&
					            ball.getY() < yValue + sf.getHeight() && ball.getY() + ball.getHeight() > yValue) {
					            ball.setLocation(xValue + sf.getWidth(), ball.getY());
					        } else {
					            sf.setLocation(xValue + 5, sf.getY());
					        }
					    }
					    
					break;
				case KeyEvent.VK_W:
					 if (sf.getY() > 0) {
					        if (ball.getX() < sf.getX() + sf.getWidth() && ball.getX() + ball.getWidth() > sf.getX() &&
					            ball.getY() < sf.getY() && ball.getY() + ball.getHeight() > sf.getY()) {
					            ball.setLocation(ball.getX(), sf.getY() - ball.getHeight());
					        } else {
					            sf.setLocation(sf.getX(), sf.getY() - 5);
					        }
					    }
					break;
				case KeyEvent.VK_S:
					if (sf.getY() + sf.getHeight() < frame.getHeight()) {
				        if (ball.getX() < sf.getX() + sf.getWidth() && ball.getX() + ball.getWidth() > sf.getX() &&
				            ball.getY() < sf.getY() + sf.getHeight() && ball.getY() + ball.getHeight() > sf.getY() + sf.getHeight()) {
				            ball.setLocation(ball.getX(), sf.getY() + sf.getHeight());
				        } else {
				            sf.setLocation(sf.getX(), sf.getY() + 5);
				        }
				    }
					break;
				default:
					break;
				}
				
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
