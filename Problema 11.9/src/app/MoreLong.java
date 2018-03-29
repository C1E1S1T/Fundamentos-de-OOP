package app;

public class MoreLong 
{

	private StringBuilder number;
	
	public MoreLong(String number) 
	{
		this.number = new StringBuilder(number);
	}

	public void add(MoreLong number) 
	{
		Integer term=0, result=0, i=1;
		StringBuilder temp = new StringBuilder();
		do 
		{
			Integer a = toInteger(number, number.toString().length()-i);
			Integer b = toInteger(this, this.toString().length()-i);
			result=a+b;
			StringBuilder total = new StringBuilder(String.valueOf(result));
			Integer subTotal = toInteger(total.reverse(),0);
			temp.append(subTotal + term);
			term = (result>9) ? 1 : 0;
			i++;
		}while(result!=0 || i<=number.toString().length() || i<=this.toString().length());
		this.number = temp.reverse();
		deleteLeftZeros();
	}

	private void deleteLeftZeros() 
	{
		if(this.number.charAt(0) == '0')
		{
			this.number.deleteCharAt(0);
		}
	}

	private <T extends Object> int toInteger(T number, int index) 
	{
		if(index < 0)
		{
			return 0;
		}
		return (int)number.toString().charAt(index) - '0';
	}
	
	public String toString()
	{
		return number.toString();
	}
	
}
