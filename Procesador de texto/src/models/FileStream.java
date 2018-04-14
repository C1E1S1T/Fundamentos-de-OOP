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

public class FileStream 
{

	private File file;

	public FileStream(String string, String string2) 
	{
		this.file = new File(string, string2);
	}
	
	public FileStream(File file) 
	{
		this.file = file;
	}

	public String read() throws IOException
	{
		StringBuilder content = new StringBuilder();
		Path path = Paths.get(file.getAbsolutePath());
		Stream<String> stream = Files.lines(path);
		stream.forEach((line) ->  content.append(line+"\n"));
		stream.close();
		return content.toString();
	}

	public void write(String text) throws IOException
	{
		BufferedWriter writer = instantiateWriter();	
		writer.write(text);
		writer.flush();
		writer.close();
	}

	private BufferedWriter instantiateWriter() 
	{
		if(file.exists() && file.canWrite())
		{
			return instantiateBufferedWriter(StandardOpenOption.TRUNCATE_EXISTING);
		}
		else
		{
			return instantiateBufferedWriter(StandardOpenOption.CREATE);
		}
	}
	
	private BufferedWriter instantiateBufferedWriter(StandardOpenOption standardOpenOption)
	{
		Path path = Paths.get(file.getAbsolutePath());
		try 
		{
			return Files.newBufferedWriter(path, Charset.defaultCharset(),
						standardOpenOption);
		} catch (IOException e) 
		{	
			e.getStackTrace();
			return null;
		}
	}
	
	public File getFile()
	{
		return file;
	}

}
