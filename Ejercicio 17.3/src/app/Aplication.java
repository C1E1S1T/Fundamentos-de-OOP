package app;

import models.FileComparator;

public class Aplication 
{

	public static void main(String[] args) 
	{
		FileComparator file1 = new FileComparator("resources","file1.txt");
		FileComparator file2 = new FileComparator("resources","file2.txt");
		System.out.println("Archivo 1");
		System.out.println(file1.read());
		System.out.println("Archivo 2");
		System.out.println(file2.read());
		String result=(file1.equals(file2)) ? "iguales" : "distintos";
		System.out.println("Los archivos son "+result);
	}

}
