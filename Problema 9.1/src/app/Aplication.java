package app;

import views.PalindromeView;

public class Aplication {

	public void start()
	{
		PalindromeView view = new PalindromeView();
		view.interact();
	}
	
	public static void main(String[] args) 
	{
		new Aplication().start();

	}

}
