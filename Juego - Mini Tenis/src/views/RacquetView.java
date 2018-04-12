package views;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class RacquetView 
{
	private int x;
	private int y;
	private int heigth;
	private int speedInX;
	private int width;
	
	public RacquetView()
	{
		x = 0;
		speedInX = 0;
		width = 60;
		heigth = 10;
		y = 330;
	}
	
	public void move(int widthContainer)
	{
		boolean isInsidePanelInX = x + speedInX > 0;
		boolean isTouchingEdgeInX = x + speedInX < widthContainer - width;
		if(isInsidePanelInX && isTouchingEdgeInX)
		{
			x += speedInX;
		}
	}
	
	public void paint(Graphics2D graphics)
	{
		graphics.fillRect(x, y, width, heigth);
	}
	
	public void setSpeed(int speed)
	{
		speedInX = speed;
	}
	
	public Rectangle getBounds()
	{
		return new Rectangle(x, y, heigth, width);
	}
	
	public int calculateTopEdge()
	{
		return y - heigth;
	}
	
}
