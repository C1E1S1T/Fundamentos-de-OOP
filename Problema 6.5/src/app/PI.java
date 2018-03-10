package app;

public class PI 
{
	public void interact()
	{
		IO io = new IO();
		double pi = calculateNumbers(io.readInt("Ingrese el numero de terminos:"));
		io.writeln(pi);
	}
	
	public double calculateNumbers(int limit) 
	{
		double numbers = 1;
		for(double n=1; n<=limit; n++)
		{
			numbers = numbers * calculateTerm(n,-1) * calculateTerm(n, 1);
		}
		return numbers;
	}

	private double calculateTerm(double n, double term) 
	{
		double doubleOfN = (2 * n);
		return ( doubleOfN /  (doubleOfN+term));
	}
	
	
	public void start() 
	{
		this.interact();
	}
	
	public static void main(String[] args) 
	{
		new PI().start();
	}
	
}
