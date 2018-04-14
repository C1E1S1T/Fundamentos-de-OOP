package views;

import java.io.File;

import javax.swing.JFileChooser;

public class FileView 
{
	private JFileChooser fileChooser;
	private File file;
	private static FileView fileView;
	
	private FileView()
	{
		fileChooser = new JFileChooser();
	}

	public File save() 
	{
		fileChooser.setDialogTitle("Save File...");
		int userSelection = fileChooser.showSaveDialog(UIView.frame);
		if(userSelection == JFileChooser.APPROVE_OPTION)
		{
			file = fileChooser.getSelectedFile();
			return file;
		}
		return null;
	}

	public File open() 
	{
		fileChooser.setDialogTitle("Open File...");
		int userSelection = fileChooser.showOpenDialog(UIView.frame);
		if(userSelection == JFileChooser.APPROVE_OPTION)
		{
			file = fileChooser.getSelectedFile();
			return file;
		}
		return null;
	}
	
	public File getFile()
	{
		return file;
	}

	public static FileView getInstance() 
	{
		if(fileView == null)
		{
			fileView = new FileView();
		}
		return fileView;
	}
	

}
