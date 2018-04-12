package controllers;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import views.RacquetView;

public class SpriteRacquetController implements KeyListener
{

	private RacquetView view;
	
	public SpriteRacquetController (RacquetView view)
	{
		this.view = view;
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) 
	{
		
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			view.setSpeed(-1);
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			view.setSpeed(1);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) 
	{
		view.setSpeed(0);
	}
	

}
