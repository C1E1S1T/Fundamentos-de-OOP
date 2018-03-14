package models;

public class Rectangle 
{
	private double sideA;
	private double sideB;
	
	public Rectangle(double sideA, double sideB)
	{
		this.sideA = sideA;
		this.sideB = sideB;
	}
	
	public double calculateArea()
	{
		return sideA * sideB;
	}

	public double calculatePerimeter() 
	{
		int amountSides = 2;
		return amountSides*sideA + amountSides*sideB;
	}

	public double calculateDiagonal() 
	{
		double hypotenuseA = sideA * sideA;
		double hypotenuseB = sideB * sideB;
		return Math.sqrt(hypotenuseA + hypotenuseB);
	}

}
