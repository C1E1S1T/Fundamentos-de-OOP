package app;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;

import controllers.CalculatorController;
import views.CalculatorView;

public abstract class GUIAplication 
{
	private JFrame frame;
	
	public GUIAplication(String nameApp)
	{
		frame = new JFrame(nameApp);
		JLabel title = new JLabel(nameApp);
		frame.add(title, BorderLayout.NORTH );
		designFrame();
	}
	
	private void designFrame()
	{
		frame.setSize(calculateWindowSize());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
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
		CalculatorView calculatorView = new CalculatorView();
		CalculatorController calculatorController = new CalculatorController(calculatorView);
		frame.add(calculatorView.interact(calculatorController), BorderLayout.CENTER);
		frame.setVisible(true);
	}
	

}
