package models;


public class Square 
{
	private double side;
	
	public Square(double side)
	{
		this.side = side;
	}
	
	
	public double calculateArea()
	{
		return getSideSquared();
	}

	public double calculatePerimeter() 
	{
		int amountSides = 4;
		return amountSides*side;
	}

	public double calculateDiagonal() 
	{
		double hypotenuses=2*getSideSquared();
		return Math.sqrt(hypotenuses);
	}

	private double getSideSquared()
	{
		return side * side;
	}
}