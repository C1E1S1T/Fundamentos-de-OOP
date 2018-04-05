package app;

import views.StudentView;

public class Aplication {

	public static void main(String[] args) 
	{
		new Aplication().start();
	}

	private void start() 
	{
		new StudentView().interact();
	}

}
