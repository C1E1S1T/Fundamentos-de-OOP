package app;

import views.TrainingView;

public class Aplication 
{

	public static void main(String[] args) 
	{
		new Aplication().start();
	}

	private void start() 
	{
		new TrainingView().interact();
	}

}
