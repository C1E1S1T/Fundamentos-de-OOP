package models;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

public class FileComparator 
{
	private File file;

	public FileComparator(String path, String name) 
	{
		this.file = new File(path, name);
	}
	
	public FileComparator(File file) 
	{
		this.file = file;
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

	public boolean equals(FileComparator fileComparator) 
	{
		if(this.file.equals(fileComparator.getFile()))
		{
			return true;
		}
		String fileContent = fileComparator.read();
		String thisFileContent = this.read();
		return thisFileContent.equals(fileContent);
	}

	public File getFile() 
	{
		return file;
	}
	
	public String read() 
	{
		StringBuilder content = new StringBuilder();
		Path path = Paths.get(file.getAbsolutePath());
		try (Stream<String> stream = Files.lines(path)) 
		{
		   stream.forEach((line) ->  content.append(line+"\n") );
		} 
		catch (IOException e) 
		{
		   e.printStackTrace();
		}
		return content.toString();
	}

	public void write(String text) 
	{
		Path path = Paths.get(file.getPath());
		try (BufferedWriter writer = Files.newBufferedWriter(path, Charset.defaultCharset(),
				StandardOpenOption.CREATE)) {
			writer.write(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
