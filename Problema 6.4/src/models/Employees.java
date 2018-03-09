package models;

public class Employees 
{
	private int salary;
	
	public void setSalary(int salary) 
	{
		this.salary=salary;
	}

	public double increaseSalary() 
	{
		return (salary*determinateIncreaseSalary());
	}

	private double determinateIncreaseSalary() 
	{
		double percentage = 0;
		if(salary>0 && salary<=9000)
		{
			percentage = 0.2;
		}
		if(salary>9000 && salary<=15000)
		{
			percentage = 0.1;
		}
		if(salary>15000 && salary<=20000)
		{
			percentage = 0.05;
		}
		if(salary>20000)
		{
			percentage = 0;
		}
		return 1 + percentage;
	}

}
