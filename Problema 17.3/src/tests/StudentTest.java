package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import models.Student;

class StudentTest 
{

	@Test
	void testAddScore() 
	{
		Student student = new Student("Carlos");
		student.addScore(9);student.addScore(9);
		student.addScore(9);student.addScore(9);
		ArrayList<Integer> actual = student.getScores();
		ArrayList<Integer> expected = new ArrayList<>();
		expected.add(9); expected.add(9);
		expected.add(9); expected.add(9);
		assertEquals(expected.toString(), actual.toString());
	}
	
	@Test
	void testCalculateAvarage() 
	{
		Student student = new Student("Carlos");
		student.addScore(9);student.addScore(9);
		student.addScore(9);student.addScore(9);
		Integer actual = student.calculateAvarage();
		Integer expected = 9;
		assertEquals(expected.toString(), actual.toString());
	}


}
