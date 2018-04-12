package views;

import javax.swing.JFrame;

import app.View;

public class UIView implements View
{
	private JFrame frame;	
	private GameView xxx;
	
	public UIView(String nameApp)
	{
		frame = new JFrame(nameApp);
		xxx = new GameView();
	}
	
	@Override
	public void interact() 
	{
		frame.add(xxx);
		frame.setSize(300, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		while(true)
		{
			xxx.moveBall();
			xxx.repaint();
			try 
			{
				Thread.sleep(10);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}

}
