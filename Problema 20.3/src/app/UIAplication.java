package app;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public abstract class UIAplication 
{
	private JFrame frame;
	
	public UIAplication(String nameApp)
	{
		frame = new JFrame(nameApp+" - CEST");
		designFrame();
	}
	
	private void designFrame()
	{
		frame.setSize(calculateWindowSize());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setIconImage(new ImageIcon("resources\\icon.png").getImage());
	}
	
	private Dimension calculateWindowSize()
	{
		Dimension screenSize =  Toolkit.getDefaultToolkit().getScreenSize();
		Integer width = (int) screenSize.getWidth()/2;
		Integer heigth = (int) screenSize.getHeight()/2;
		Dimension windowSize =  new Dimension(width,heigth);
		return windowSize;
	}
	

	
	public void start()
	{
		
		frame.setVisible(true);
	}
	

}
