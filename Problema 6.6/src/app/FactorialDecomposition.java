package app;

import java.util.ArrayList;

public class FactorialDecomposition 
{


	public ArrayList<Integer> calculate(int number)
	{
		ArrayList<Integer> factors = new ArrayList<Integer>(10);
		int [] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,67,71,73,79,83,89,97};
		int primesIterator=0;
		int factorIndex=0;
		while(number > 1)
		{
			if( number % primes[primesIterator] == 0  )
			{
				factors.add(primes[primesIterator]);
				number /= factors.get(factorIndex);
				factorIndex++;
			}
			else
			{
				primesIterator++;
			}
		}
		return factors;
	}
	
	
	public void start()
	{
		this.interact();
	}
	
	private void interact() 
	{
		IO io = new IO();
		int number;
		do
		{
			number = io.readInt("Ingrese el numero a descomponer:");
		}while(number < 1900 && number > 2000 );
		ArrayList<Integer> factors = this.calculate(number);
		io.write("Descomposicion:");
		for(int index=0; index<factors.size(); index++)
		{
			io.write(factors.get(index) + " ");
		}
	}


	public static void main(String[] args) 
	{
		new FactorialDecomposition().start();
	}

}
