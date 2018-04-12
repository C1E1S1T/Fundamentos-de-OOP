package views;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;

import app.View;
import controllers.Controller;

public class ImageView extends View
{
	private JLabel container;
	private ImageIcon imagePerson;
	
	public ImageView()
	{
		container = new JLabel("");
		designView();
	}
	
	private void designView()
	{
		Image image = new ImageIcon(this.getClass().getResource("/friendship.jpg")).getImage();
		imagePerson = new ImageIcon(image);
		container.setIcon(imagePerson);
	}
	
	public JComponent getContainer()
	{
		return container;
	}

	@Override
	public JComponent interact(Controller...controllers) 
	{
		designView();
		return container;
	}

	

}
