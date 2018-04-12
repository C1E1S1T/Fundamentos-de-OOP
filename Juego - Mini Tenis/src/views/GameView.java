package views;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controllers.SpriteRacquetController;

public class GameView extends JPanel
{
	private static final long serialVersionUID = -5065006120392885457L;
	private BallView ball;
	private RacquetView racquet;
	
	public GameView()
	{
		racquet = new RacquetView();
		ball = new BallView();
		addKeyListener(new SpriteRacquetController(racquet));
		setFocusable(true);
	}
	
	public void moveBall()
	{
		ball.move(getWidth(), getHeight(), racquet.getBounds(), racquet.calculateTopEdge());
		if(ball.isTouchingEdgeInY(getHeight()))
		{
			gameOver();
		}
		racquet.move(getWidth());
	}
	
	private void gameOver() 
	{
		JOptionPane.showMessageDialog(this, "Your score is:" + ball.getScore(), "Game over", JOptionPane.OK_OPTION);
		System.exit(ABORT);
	}

	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		ball.paint((Graphics2D) g);
		racquet.paint((Graphics2D) g);
	}
	
	

}
