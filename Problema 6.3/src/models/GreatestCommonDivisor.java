package models;

public class GreatestCommonDivisor 
{
	private int numberA;
	private int numberB;
	
	public GreatestCommonDivisor(int numberA, int numberB)
	{
		if(isNegativeNumbers(numberA, numberB))
		{
			throw new ArithmeticException("Negative numbers not valid");
		}
		
		if(numberA < numberB)
		{
			int aux = numberA;
			numberA = numberB;
			numberB = aux;
		}
		
		this.numberA = numberA;
		this.numberB = numberB;	
	}
	
	
	public int calculate()
	{	
		if(numberB == 0)
		{
			return numberA;
		}	
		int remainder;
		int result=0;
		do
		{
			remainder = numberA % numberB;
			numberA = numberB;
			numberB = remainder; 
			if(remainder == 0)
			{
				result = numberA;
			}
		}while(remainder != 0);
		return result;
	}

	
	private boolean isNegativeNumbers(int number1, int  number2)
	{
		return number1 < 0 || number2<0;
	}
}
