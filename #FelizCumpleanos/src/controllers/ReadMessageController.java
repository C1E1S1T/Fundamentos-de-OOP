package controllers;

import java.awt.event.ActionEvent;
import java.io.File;

import app.View;
import models.FileComparator;
import views.MessageView;

public class ReadMessageController extends Controller 
{

	public ReadMessageController(View view) 
	{
		super(view);
	}

	@Override
	public void actionPerformed(ActionEvent event)
	{
		File file = new File("resources","Message.txt");
		FileComparator message = new FileComparator(file);
		MessageView messageView = new MessageView();
		messageView.interact(message.read());	
	}

}
