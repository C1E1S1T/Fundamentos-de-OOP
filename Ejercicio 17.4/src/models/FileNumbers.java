package models;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FileNumbers 
{

	private File file;

	public FileNumbers(String path, String name) 
	{
		file = new File(path, name);
	}
	public File create()
	{
		file.getParentFile().mkdir();
		try 
		{
			file.createNewFile();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		return file;
	}
	
	public ArrayList<Serializable> read() 
	{
		ArrayList<Serializable> numbers = new ArrayList<>();
		ObjectInputStream numbersReader = instanceObjectInputStream();	
		Serializable number = null;
		try 
		{
			while( ( number = (Serializable) numbersReader.readObject() ) != null  )
			{
				numbers.add(number);
			}
		} 
		catch(EOFException e)
		{
			return numbers;
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		return numbers;
	}
	
	public void write(List<Serializable> numbers)
	{
		ObjectOutputStream stream = instanceObjectOutputStream();
		numbers.stream().forEach( 
					number -> 
						{
							try {
								stream.writeObject(number);
							} catch (IOException e) {
								e.printStackTrace();
							}
						}
				);
	}

	private ObjectOutputStream instanceObjectOutputStream() 
	{
		try {
			return new ObjectOutputStream(new FileOutputStream(this.file));
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
			return null;
		} catch (IOException e) 
		{
			e.printStackTrace();
			return null;
		}
	}

	private ObjectInputStream instanceObjectInputStream() 
	{
		try 
		{
			return new ObjectInputStream(new FileInputStream(this.file));
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		return null;
	}

	
	
	
	
	
	
}
