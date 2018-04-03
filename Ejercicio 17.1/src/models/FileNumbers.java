package models;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileNumbers 
{
	private File file;
	
	public FileNumbers(String path) 
	{
		this.file = new File(path, "numbers.txt");	
		file.getParentFile().mkdirs();
		this.create();
	}
	
	private boolean create()
	{
		boolean result = false;
		try 
		{
			result = file.createNewFile();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return result;
	}

	public void write(List<Integer> numbers)
	{
		ObjectOutputStream numbersReader = instanceNumbersWriter();
		numbers.stream().forEach(  (x) -> {
			try {
				numbersReader.writeInt(x);
				numbersReader.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} );
	}
	
	public ArrayList<Integer> read()
	{
		ArrayList<Integer> numbers = new ArrayList<>();
		ObjectInputStream numbersReader = instanceNumbersReader();	
		try {
			Integer temp = numbersReader.readInt();
			while(temp != null)
			{
				numbers.add(temp);
				temp = numbersReader.readInt();
			}
		} catch (EOFException e) 
		{
			return numbers;
		}	
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return numbers;
	}
	
	private ObjectOutputStream instanceNumbersWriter()
	{
		try {
			return new ObjectOutputStream(new FileOutputStream(this.file));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;	
	}
	
	private ObjectInputStream instanceNumbersReader()
	{
		try {
			return new ObjectInputStream(new FileInputStream(this.file));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;	
	}
	
	public Long countNegativeNumbers() 
	{
		ArrayList<Integer> numbers = read();
		return numbers.stream().filter( (Integer x) -> x<0   ).count();
	}
	
	
}
