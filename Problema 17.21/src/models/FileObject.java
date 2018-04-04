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

public class FileObject 
{

	private File file;

	public FileObject(String path, String name) 
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
		ArrayList<Serializable> objects = new ArrayList<>();
		ObjectInputStream objectReader = instanceObjectInputStream();	
		Serializable object = null;
		try 
		{
			while( ( object = (Serializable) objectReader.readObject() ) != null  )
			{
				objects.add(object);
			}
		} 
		catch(EOFException e)
		{
			return objects;
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		return objects;
	}
	
	public void write(List<Serializable> objects)
	{
		ObjectOutputStream stream = instanceObjectOutputStream();
		objects.stream().forEach( 
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
