package app;

import java.io.Serializable;

public class RationalNumber implements Serializable
{
	private static final long serialVersionUID = 1L;
	private Integer numerator;
	private Integer denominator;


	public RationalNumber(Integer numerator, Integer denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	
	public String toString()
	{
		return numerator + "/" + denominator;
	}

}
