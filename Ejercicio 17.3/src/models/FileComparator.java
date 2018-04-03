package models;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileComparator 
{
	private File file;

	public FileComparator(String path, String name) 
	{
		this.file = new File(path, name);
		createFile();
	}

	private File createFile() 
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

	public boolean equals(FileComparator fileComparator) 
	{
		if( this.file.equals(fileComparator.getFile()))
		{
			return true;
		}
		String fileContent = fileComparator.read();
		String thisFileContent = this.read();
		return thisFileContent.equals(fileContent);
	}

	private File getFile() 
	{
		return this.file;
	}

	
	public String read() 
	{
		StringBuilder content = new StringBuilder();
		Path path = Paths.get(file.getAbsolutePath());
		try (Stream<String> stream = Files.lines(path)) 
		{
		   stream.forEach(content::append);
		} 
		catch (IOException e) 
		{
		   e.printStackTrace();
		}
		return content.toString();
	}
	
	
}
