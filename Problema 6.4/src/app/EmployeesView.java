package app;

import java.util.Collection;
import java.util.Scanner;
import java.util.Vector;

import models.Employees;
import views.View;

public class EmployeesView implements View 
{
	Scanner input;;
	
	public EmployeesView()
	{
		this.input = new Scanner(System.in); 
	}
	
	@Override
	public void interact() 
	{
		Vector<Employees> vector = new Vector<Employees>(10,10);
		Employees employees;		
		for(int i=0; i<3;i++)
		{
			employees = new Employees();
			System.out.println("Empleado "+(i+1));
			System.out.print("Salario Actual:");
			employees.setSalary(input.nextInt());
			System.out.print("Nuevo salario:"+employees.increaseSalary());
			System.out.println("\n\n");
			vector.addElement(employees);
		}
	}

}
