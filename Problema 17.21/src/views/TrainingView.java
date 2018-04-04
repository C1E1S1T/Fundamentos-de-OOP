package views;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

import models.FileObject;
import models.Traininig;


public class TrainingView 
{
	private IO io;
	
	public void interact() 
	{
		io = new IO();
		ArrayList<Integer> intervals = new ArrayList<Integer>();
		Random number = new Random();
		Integer interval;
		for(Integer i=0;i<Traininig.pulsationNumber;i++)
		{
			interval = number.nextInt(100)+1;
			intervals.add(interval);
		}
		Traininig training = new Traininig(intervals);
		FileObject fileTraining = new FileObject("resources","entrenamiento");
		fileTraining.create();
		ArrayList<Serializable> trainings = new ArrayList<>();
		trainings.add(training);
		fileTraining.write( trainings   );
		
		ArrayList<Serializable> temp = fileTraining.read();
		Traininig actual = (Traininig) temp.get(0);
		io.write(actual.toString());
	}

}
