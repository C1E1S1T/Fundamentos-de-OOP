package views;

import java.io.File;

import javax.swing.JFileChooser;

public class FileView 
{
	private JFileChooser fileChooser;
	
	
	public FileView()
	{
		fileChooser = new JFileChooser();
	}

	public File save() 
	{
		fileChooser.setDialogTitle("Save File...");
		int userSelection = fileChooser.showSaveDialog(UIView.frame);
		if(userSelection == JFileChooser.APPROVE_OPTION)
		{
			return fileChooser.getSelectedFile();
		}
		return null;
	}

	public File open() 
	{
		fileChooser.setDialogTitle("Open File...");
		int userSelection = fileChooser.showOpenDialog(UIView.frame);
		if(userSelection == JFileChooser.APPROVE_OPTION)
		{
			return fileChooser.getSelectedFile();
		}
		return null;
	}

}
