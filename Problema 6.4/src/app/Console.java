package app;

import views.View;

public class Console 
{
	String titleApp;
	String endApp;
	View view;
	
	public Console()
	{
		this.titleApp = "6.4 Salarios\n\n\n";
		this.endApp = "\n\n\nCEST ;)";
		this.view = new EmployeesView();
	}
	
	public void start()
	{
		System.out.println(titleApp);
		view.interact();
		System.out.println(endApp);
	}

}
