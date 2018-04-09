package app;

import java.awt.Dimension;

import java.awt.GridLayout;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import com.raysmond.player.BasicPlayer;
import com.raysmond.player.BasicPlayerException;

import controllers.CongratulationController;
import controllers.Controller;
import views.CongratulationView;
import views.ImageView;

public abstract class UIAplication 
{
	public static JFrame frame;
	private String resourcesPath;
	private BasicPlayer player;
	
	public UIAplication(String nameApp, String resourcesPath)
	{
		frame = new JFrame(nameApp+" - CEST");
		designFrame();
		this.resourcesPath = resourcesPath;
	}
	
	private void designFrame()
	{
		frame.setBounds(100, 100, 450, 300);
		frame.setSize(calculateWindowSize());
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(new ImageIcon(this.getClass().getResource("/logo.png")).getImage());
		frame.getContentPane().setLayout(new GridLayout(0, 2, 0, 0));
	}
	
	private Dimension calculateWindowSize()
	{
		Dimension screenSize =  Toolkit.getDefaultToolkit().getScreenSize();
		Integer width = (int) screenSize.getWidth();
		Integer heigth = (int) ((int) screenSize.getHeight() * 0.96);
		Dimension windowSize =  new Dimension(width,heigth);
		return windowSize;
	}
	
	private void playBackgroundMusic(String name, String audioFormat)
	{
		player = new BasicPlayer();
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
		Controller controller;
		
		View imageView = new ImageView();
		controller = null;
		frame.add(imageView.interact(controller));
		
		View congratulationView = new CongratulationView();
		controller = new CongratulationController(congratulationView);
		frame.add(congratulationView.interact(controller));
		
		playBackgroundMusic("Migos","mp3");
		frame.setVisible(true);
	}
	

}
