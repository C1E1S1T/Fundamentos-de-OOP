package models;

import java.util.ArrayList;

public class Vector3D 
{

	private ArrayList<Double> components;
	
	public Vector3D(double x, double y, double z) 
	{
		components = new ArrayList<Double>(3);
		components.add(x);
		components.add(y);
		components.add(z);
	}
	
	public ArrayList<Double> getCompontents()
	{
		return components;
	}
	
	public static boolean equals(Vector3D vectorA, Vector3D vectorB) 
	{
		return isEquals(vectorA.getCompontents(), vectorB.getCompontents());
	}

	public boolean equals(Vector3D vector)
	{
		return isEquals(this.components, vector.getCompontents());
	}

	private static boolean isEquals(ArrayList<Double> componentsA, ArrayList<Double> componentsB)
	{
		int size=(componentsA.size()>componentsB.size()) ? componentsA.size() : componentsB.size(); 
		for(int index=0; index<size; index++)
		{
			if((double)componentsA.get(index) != (double)componentsB.get(index))
			{
				return false;
			}
		}
		return true;
	}
	
	public double calculateNorm() 
	{
		double sum=0;
		for(int index=0; index<components.size();index++)
		{
			sum += (double)components.get(index) * (double)components.get(index);
		}
		return Math.sqrt(sum);
	}
	
	
}
