package models;

public class Operator 
{
	public float memory;
	
	public Operator()
	{
		System.out.println("Activar maquina operador");
		memory = 0.0F;
	}
	public float add(float f)
	{
		memory += f;
		return memory;
	}
	
	public void finalize()
	{
		System.out.println("Objeto liberado "+memory+" memoria");
	}
	
}
