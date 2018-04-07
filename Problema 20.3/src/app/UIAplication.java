package app;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import com.raysmond.player.BasicPlayer;
import com.raysmond.player.BasicPlayerException;

public abstract class UIAplication 
{
	private JFrame frame;
	private String resourcesPath;
	
	public UIAplication(String nameApp, String resourcesPath)
	{
		frame = new JFrame(nameApp+" - CEST");
		designFrame();
		this.resourcesPath = resourcesPath;
	}
	
	private void designFrame()
	{
		frame.setSize(calculateWindowSize());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setIconImage(new ImageIcon(resourcesPath, "icon.png").getImage());
	}
	
	private Dimension calculateWindowSize()
	{
		Dimension screenSize =  Toolkit.getDefaultToolkit().getScreenSize();
		Integer width = (int) screenSize.getWidth()/2;
		Integer heigth = (int) screenSize.getHeight()/2;
		Dimension windowSize =  new Dimension(width,heigth);
		return windowSize;
	}
	
	private void playBackgroundMusic(String name, String audioFormat)
	{
		BasicPlayer player = new BasicPlayer();
		String soundName = name+"."+audioFormat;
		try 
		{
			player.open(new File(resourcesPath,soundName));
		} catch (BasicPlayerException e) 
		{
			e.printStackTrace();
		}
		try 
		{
			player.play();
		} catch (BasicPlayerException e) 
		{
			e.printStackTrace();
		}
	}

	public void start()
	{
		playBackgroundMusic("Background2","mp3");
		frame.setVisible(true);
	}
	

}
