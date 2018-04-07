package app;

public class Aplication extends UIAplication
{

	public Aplication(String nameApp, String resourcesPath) 
	{
		super(nameApp, resourcesPath);
	}

	public static void main(String[] args) 
	{
		new Aplication("Aprendiendo Swing","resources").start();
	}

	
}
