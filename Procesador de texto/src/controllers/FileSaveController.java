package controllers;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

import models.FileStream;
import views.FileView;
import views.TextView;

public class FileSaveController implements OperationController 
{
	private TextView text;
	private FileView fileView;
	
	public FileSaveController()
	{
		text = TextView.getInstance();
		fileView =  FileView.getInstance();
	}
	
	@Override
	public void actionPerformed(ActionEvent event) 
	{
		File file = fileView.getFile();
		if(file != null)
		{
			FileStream fileStream = new FileStream(file);
			try 
			{
				fileStream.write(text.getContent());
			} catch (IOException exeption) 
			{
				String title = "Habido un error al escribir el archivo";
				int iconMessage = JOptionPane.WARNING_MESSAGE;
				JOptionPane.showMessageDialog(null,exeption.getMessage(),title, iconMessage);
			}
		}
	}

}
