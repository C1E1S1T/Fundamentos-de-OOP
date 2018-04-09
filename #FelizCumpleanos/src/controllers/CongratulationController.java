package controllers;

import java.awt.event.ActionEvent;
import java.io.File;

import app.View;
import models.FileComparator;
import views.MessageView;

public class CongratulationController extends Controller 
{

	public CongratulationController(View view) 
	{
		super(view);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		File file = new File("resources\\message.txt");
		FileComparator message = new FileComparator(file);
		MessageView messageView = new MessageView();
		messageView.interact(message.read());
	}

}
