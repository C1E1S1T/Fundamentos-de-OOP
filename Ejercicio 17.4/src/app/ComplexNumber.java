package app;

import java.io.Serializable;

public class ComplexNumber implements Serializable 
{

	private static final long serialVersionUID = 1L;
	private Integer real;
	private Integer imaginary;
	
	public ComplexNumber(Integer real, Integer imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;
	}

	public String toString()
	{
		return real + "+" + imaginary + "i";
	}
	
}
