package app;

public class Aplication 
{

	
	public static void main(String[] args) 
	{
		new Aplication().start();
	}

	private void start() 
	{
		IO io = new IO();
		MoreLong number1 = new MoreLong(io.readString("Ingrese el numero 1:"));
		MoreLong number2 = new MoreLong(io.readString("Ingrese el numero 2:"));
		number1.add(number2);
		System.out.println("El resultado es:"+"    "+number1);
	}

}
