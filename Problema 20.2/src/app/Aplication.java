package app;

public class Aplication extends UIAplication
{

	public Aplication(String nameApp) 
	{
		super(nameApp);
	}

	public static void main(String[] args) 
	{
		new Aplication("Lectura de archivos 0.2").start();
	}

	
}
