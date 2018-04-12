package views;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;


public class BallView
{
	private int x,y;
	private int speedInX, speedInY;
	private int diameter;
	private int score;
	
	
	public BallView()
	{
		this.x=0;
		this.y=0;
		this.speedInX = 1;
		this.speedInY = 1;
		diameter = 30;
		score = 0;
	}
	
	public void move(int width, int heigth, Rectangle racquet, int TopEdgeRacquet)
	{
		boolean isInsidePanelInX = x + speedInX < 0;
		if(isInsidePanelInX)
		{
			speedInX = 1;
		}
		boolean isInsidePanelInY = y + speedInY < 0;
		if(isInsidePanelInY)
		{
			speedInY = 1;
		}
		boolean isTouchingEdgeInX = x + speedInX > width - diameter;
		if(isTouchingEdgeInX)
		{
			speedInX = -1;
		}
		boolean isCollisionBallAndRacquet = this.getBounds().intersects(racquet);
		if(isCollisionBallAndRacquet)
		{
			speedInY = -1;
			y = TopEdgeRacquet - diameter;
			score++;
		}
		x += speedInX;
		y += speedInY;
	}
	
	public boolean isTouchingEdgeInY(int heigth)
	{
		return y + speedInY > heigth - diameter;
	}
	

	public Rectangle getBounds()
	{
		return new Rectangle(x, y, diameter, diameter);
	}
	
	public void paint(Graphics2D g2d)
	{
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.fillOval(x, y, diameter, diameter);
	}
	
	public int getScore()
	{
		return score;
	}

	
	
}
