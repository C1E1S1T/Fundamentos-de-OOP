
import views.GreatestCommonDivisorView;
import views.View;

public class Aplication 
{
	String titleApp;
	String endApp;
	View view;
	
	public Aplication()
	{
		this.titleApp = "6.3 Algoritmo de Euclides\n\n\n";
		this.endApp = "\n\n\nCEST ;)";
		this.view = new GreatestCommonDivisorView();
	}
	
	public void start()
	{
		System.out.println(titleApp);
		view.interact();
		System.out.println(endApp);
	}

}
