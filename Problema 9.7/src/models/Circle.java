package models;

public class Circle 
{

	private double radius;

	public Circle(double radius) 
	{
		this.radius = radius;
	}
	
	public double calculateArea() 
	{
		return Math.PI * radius * radius;
	}

	public double calculateDiameter() 
	{
		return radius*2;
	}

	public double calculatePerimeter() 
	{
		return 2 * radius * Math.PI;
	}

}
