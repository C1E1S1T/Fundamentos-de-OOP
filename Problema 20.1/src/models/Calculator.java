package models;

import java.util.ArrayList;
import java.util.List;

public class Calculator 
{

	private Double a;
	private Double b;
	private List<Double> results;
	
	public Calculator(Double a, Double b) 
	{
		this.a = a;
		this.b = b;
		results = new ArrayList<>(4);
	}

	public Double add() 
	{
		results.add(a+b);
		return a+b;
	}

	public Double subtract() 
	{
		results.add(a-b);
		return a-b;
	}

	public Double divide() 
	{
		results.add(a/b);
		return a/b;
	}

	public Double multiply() 
	{
		results.add(a*b);
		return a*b;
	}

	public List<Double> getResults() 
	{
		return results;
	}

}
