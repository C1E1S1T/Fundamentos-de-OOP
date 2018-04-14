package views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JFrame;

import app.Aplication;
import app.View;
import controllers.OperationController;

public class UIView implements View 
{
	public static JFrame frame; 
	private MenuView menu;
	private TextView textView;
	
	public UIView() 
	{
		frame = new JFrame();
		menu = MenuView.getInstance();
		textView = TextView.getInstance();
	}

	@Override
	public void interact(HashMap<String, ArrayList<OperationController>> controllers) 
	{
		designView();
		menu.interact(controllers.get("MenuControllers"));
		frame.add(menu , BorderLayout.NORTH);
		frame.add(textView , BorderLayout.CENTER);
		frame.setVisible(true);
	}

	private void designView() 
	{
		setTitle("Nuevo");
		frame.setBounds(100, 100, 450, 300);
		frame.setSize(calculateWindowSize(0.96, 1.0));
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
	}

	private Dimension calculateWindowSize(Double heightPercentage, Double witdhPercentage )
	{
		Dimension screenSize =  Toolkit.getDefaultToolkit().getScreenSize();
		Integer width = (int) ((int) screenSize.getWidth() * witdhPercentage);
		Integer heigth = (int) ((int) screenSize.getHeight() * heightPercentage);
		Dimension windowSize =  new Dimension(width,heigth);
		return windowSize;
	}

	public static void setTitle(String name) 
	{
		frame.setTitle( name + " - " + Aplication.nameApp);
	}
	
	
}

