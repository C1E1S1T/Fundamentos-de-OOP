package models;


public class Square extends Figure
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


	@Override
	public double getAmountComponents() 
	{
		return 1;
	}


	@Override
	public String getName() 
	{
		return "Cuadrado";
	}
}