package controllers;

import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import app.UIAplication;
import app.View;

public class ChangeMusicController extends Controller 
{

	public ChangeMusicController(View view) 
	{
		super(view);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JFileChooser fileChooser = new JFileChooser(new File("resources"));
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("Musica", "mp3");
		fileChooser.setFileFilter(fileFilter);
		fileChooser.showOpenDialog(view.getContainer());
		File file2 = fileChooser.getSelectedFile();
		if ((file2 == null) || (file2.getName().equals(""))) 
		{
		 JOptionPane.showMessageDialog(view.getContainer(), "Archivo inválido", "Archivo inválido", JOptionPane.ERROR_MESSAGE);
		}
		else
		{
			UIAplication.playBackgroundMusic(file2.getPath());
		}
	}

}
