package app;

import java.awt.Dimension;

import java.awt.GridLayout;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import com.raysmond.player.BasicPlayer;
import com.raysmond.player.BasicPlayerException;

import controllers.ReadMessageController;
import controllers.ChangeMusicController;
import controllers.Controller;
import controllers.PlayController;
import views.CongratulationView;
import views.ImageView;

public abstract class UIAplication 
{
	public static JFrame frame;
	private static BasicPlayer player;
	
	public UIAplication(String nameApp)
	{
		frame = new JFrame(nameApp+" - CEST");
		designFrame();
		player = new BasicPlayer();
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
	
	public static void playBackgroundMusic(String soundName)
	{
		try 
		{
			player.open(new File(soundName));
		} catch (BasicPlayerException e) 
		{
			e.printStackTrace();
		}
		boolean isPlaying = player.getStatus() == 0;
		if(isPlaying)
		{
			try {
				player.pause();		
				player.play();
			} catch (BasicPlayerException e) 
			{
				e.printStackTrace();
			}
		}
		else
		{
			try 
			{
				player.play();
			} catch (BasicPlayerException e) 
			{
				e.printStackTrace();
			}
		}
	}

	public void start()
	{
		View imageView = new ImageView();
		frame.add(imageView.interact());
		
		View congratulationView = new CongratulationView();
		Controller controller = new ReadMessageController(congratulationView);
		Controller controller2 = new  ChangeMusicController(congratulationView);
		Controller controller3 = new PlayController(congratulationView);
		frame.add(congratulationView.interact(controller,controller2, controller3));
		
		playBackgroundMusic("resources\\Walk It Talk It.mp3");
		frame.setVisible(true);
	}
	

}
