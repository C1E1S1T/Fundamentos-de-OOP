public class Aplication 
{
	public static void main(String[] args) 
	{
		int limit=1;
		for(int i=0; i<6;i++)
		{
			for(int j=1; j<=limit;j++)
			{
				System.out.print(j + "\t");
			}
			if(limit <= 4 && i>=3 )
			{
				limit--;
			}
			else
			{
				limit++;
			}
			System.out.println();
		}
	}
}
