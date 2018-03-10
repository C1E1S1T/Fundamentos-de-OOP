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
	
	
	public static void main(String[] args) 
	{

	}

}
