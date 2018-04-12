package views;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JTextArea;

import app.UIAplication;
import app.View;
import controllers.Controller;

public class MessageView extends View
{

	private JDialog container; 
	private JTextArea content;
	
	public MessageView()
	{
		container = new JDialog(UIAplication.frame);
		content = new JTextArea(5,10);
	}
	
	@Override
	public Component interact(Controller...controller) 
	{
		designView();
		container.setVisible(true);
		return container;
	}
	
	public Component interact(String message) 
	{
		designView();
		content.setText(message);
		content.setEditable(false);
		container.add(content);
		container.setVisible(true);
		return container;
	}
	
	private void designView() 
	{
		container.setModal(false);
		container.setSize(calculateWindowSize());
		container.setLocationRelativeTo(UIAplication.frame);
		container.setTitle("Carta de cumpleanos");
		content.setFont(new Font("Times New Roman",Font.PLAIN,16));
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
