package app;

import models.Operator;

public class Problema84 
{

	public void start()
	{
		Operator test = new Operator();
		test.add((float)1.4);
		test = null;
		System.gc();
	}
	
	public static void main(String[] args) 
	{
		new Problema84().start();
	}

}
