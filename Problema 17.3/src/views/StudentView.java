package views;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

import models.FileObject;
import models.Student;

public class StudentView 
{

	public void interact() 
	{
		ArrayList<Serializable> students = new ArrayList<>();
		students.add(new Student("Carlos"));
		Random number = new Random();
		
		for(int i=0; i<4;i++)
		{
			((Student) students.get(0)).addScore(number.nextInt(24)+1);
		}
		
		FileObject fileStudents = new FileObject("resources", "students.dat");
		fileStudents.create();
		fileStudents.write(students);
		
		IO io = new IO();
		ArrayList<Serializable> temp = fileStudents.read();
		Student actual = (Student) temp.get(0);
		io.write(actual.toString());
		
		
		
	}

}
