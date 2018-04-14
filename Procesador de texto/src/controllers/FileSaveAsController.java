package controllers;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

import models.FileStream;
import views.FileView;
import views.TextView;
import views.UIView;

public class FileSaveAsController implements OperationController
{
	private TextView text;
	private FileView fileView;
	
	public FileSaveAsController()
	{
		text = TextView.getInstance();
		fileView = FileView.getInstance();
	}
	
	@Override
	public void actionPerformed(ActionEvent event) 
	{
		File file = fileView.save();
		if(file != null)
		{
			FileStream fileStream = new FileStream(file);
			try 
			{
				fileStream.write(text.getContent());
				UIView.setTitle(file.getName());
			} catch (IOException exeption) 
			{
				String title = "Habido un error al escribir el archivo";
				int iconMessage = JOptionPane.WARNING_MESSAGE;
				JOptionPane.showMessageDialog(null,exeption.getMessage(),title, iconMessage);
			}
		}
	}

}
