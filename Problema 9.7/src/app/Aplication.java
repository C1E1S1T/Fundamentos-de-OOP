package app;

import views.FigureView;

public class Aplication
{

	
	public void start()
	{
		FigureView view = new FigureView();
		view.interact();
	}
	

	public static void main(String[] args) 
	{
		new Aplication().start();
	}

}
