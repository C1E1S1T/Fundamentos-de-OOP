package app;

public class Aplication extends GUIAplication
{

	public Aplication(String nameApp) 
	{
		super(nameApp);
	}

	public static void main(String[] args) 
	{
		new Aplication("Calculadora 0.1").start();
	}

	
}
