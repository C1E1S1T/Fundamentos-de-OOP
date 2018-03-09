package views;

import java.util.Scanner;

import models.GreatestCommonDivisor;

public class GreatestCommonDivisorView implements View 
{
	GreatestCommonDivisor gcd;
	Scanner input;
	
	public GreatestCommonDivisorView()
	{
		this.input = new Scanner(System.in); 
	}

	@Override
	public void interact() 
	{
		int [] numbers = new int[2];
		for(int i=0; i<2; i++)
		{
			System.out.print("Ingrese numero "+(i+1) + ":");
			numbers[i] = input.nextInt();
			System.out.println();
		}
		gcd = new GreatestCommonDivisor(numbers[0],numbers[1]);
		System.out.println("Resultado:" + gcd.calculate());
	}
	

}
