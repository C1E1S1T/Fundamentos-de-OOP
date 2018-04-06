package app;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import com.raysmond.player.BasicPlayer;
import com.raysmond.player.BasicPlayerException;

import controllers.Controller;
import controllers.FileController;
import views.FileView;
import views.View;

public abstract class UIAplication 
{
	private JFrame frame;
	
	public UIAplication(String nameApp)
	{
		frame = new JFrame(nameApp+"- CEST");
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
	
	private void playBackgroundMusic()
	{
		BasicPlayer player = new BasicPlayer();
		try 
		{
			player.open(new File("resources","Background.mp3"));
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
		View fileView = new FileView();
		Controller fileController = new FileController(fileView);
		frame.add(fileView.interact(fileController),BorderLayout.CENTER);
		playBackgroundMusic();
		frame.setVisible(true);
	}
	

}
