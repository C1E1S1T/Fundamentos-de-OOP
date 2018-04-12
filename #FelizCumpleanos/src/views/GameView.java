package views;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JPanel;

import app.UIAplication;
import app.View;
import controllers.Controller;

public class GameView extends View 
{
	private JDialog dialog;
	private JPanel container;
	
	public GameView()
	{
		dialog = new JDialog(UIAplication.frame);
		container = new GameComponentsView();
	}

	@Override
	public Component interact(Controller... controllers) 
	{
		designView();
		dialog.setVisible(true);
		return container;
	}

	private void designView() 
	{
		dialog.setModal(false);
		dialog.setSize(calculateWindowSize());
		dialog.setLocationRelativeTo(UIAplication.frame);
		dialog.setTitle("Juego");
		dialog.add(container);
	}

	private Dimension calculateWindowSize()
	{
		Dimension screenSize =  UIAplication.frame.getSize();
		Integer width = (int) ((int) screenSize.getWidth() * 0.5);
		Integer heigth = (int) ((int) screenSize.getHeight() * 0.95);
		Dimension windowSize =  new Dimension(width,heigth);
		return windowSize;
	}
	
	@Override
	public Component getContainer() 
	{
		return container;
	}

}
