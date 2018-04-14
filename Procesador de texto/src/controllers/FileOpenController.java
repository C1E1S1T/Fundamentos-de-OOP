package controllers;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

import models.FileStream;
import views.FileView;
import views.TextView;

public class FileOpenController implements OperationController
{
	private TextView text;
	
	public FileOpenController()
	{
		text = TextView.getInstance();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		FileView fileView = new FileView();
		File file = fileView.open();
		if(file != null)
		{
			FileStream fileStream = new FileStream(file);
			try 
			{
				text.setContent(fileStream.read());
			} catch (IOException e1) 
			{
				e1.printStackTrace();
			}
		}
	}
	
	
	

}
