package models;

public class Triangle {

	private double sideA;
	private double sideB;
	private double sideC;

	public Triangle(double sideA, double sideB, double sideC) 
	{
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public double calculateArea() 
	{
		double semiperimeter = calculatePerimeter()/2 ;
		double heronFormula = semiperimeter*subscractSide(semiperimeter, sideA)*subscractSide(semiperimeter, sideB)*subscractSide(semiperimeter, sideC);
		return Math.sqrt(heronFormula);
	}

	private double subscractSide(double semiperimeter, double side) {
		return semiperimeter - side;
	}

	public double calculatePerimeter() 
	{
		return sideA + sideB + sideC;
	}

}
