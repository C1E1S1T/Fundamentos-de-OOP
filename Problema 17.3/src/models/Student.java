package models;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Integer scoresAmount;
	private ArrayList<Integer> scores;

	public Student(String name) 
	{
		this.name = name;
		scoresAmount = 4;
		scores = new ArrayList<>(scoresAmount);
	}

	public void addScore(Integer score) 
	{
		Boolean isRange = (score>=1) && (score<=25);
		Boolean isNotMajorScoresAmount = scores.size() <= scoresAmount;
		if(isNotMajorScoresAmount && isRange)
		{
			this.scores.add(score);
		}
	}

	public String toString()
	{
		return "Name is "+this.name+" Scores:"+scores.toString();
	}
	
	public ArrayList<Integer> getScores() 
	{
		return scores;
	}

	public Integer calculateAvarage() 
	{
		Integer total = scores.stream().reduce(0, (x,y) -> x + y);
		return total/4;
	}

}
