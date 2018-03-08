
import aplication.Triangle;
import java.util.Scanner;

public class Aplication 
{
	
	public static void main(String[] args) 
	{
		Triangle triangle = new Triangle();
		Scanner input = new Scanner(System.in); 
		
		int amountLines;
		do 
		{
			System.out.print("Ingrese un entero positivo:");
			amountLines = input.nextInt();
		}while(amountLines <= 0);

		int[] lines = triangle.drawLines(amountLines);
		for(int i=0; i<lines.length; i++)
		{
			if( lines[i]  == -1)
			{
				System.out.println();
			}
			else
			{
				System.out.print(lines[i] + "\t");
			}
		}
	}


}
