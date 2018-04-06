package controllers;

import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

import models.FileComparator;
import views.View;

public class FileController extends Controller
{

	public FileController(View view) 
	{
		super(view);
	}

	@Override
	public void actionPerformed(ActionEvent event) 
	{
		JFileChooser fileSelector = new JFileChooser();
		fileSelector.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Texto", "txt");
		fileSelector.setFileFilter(filtro);
		fileSelector.showOpenDialog(view);
		File file = fileSelector.getSelectedFile();
		if ((file == null) || (file.getName().equals(""))) 
		{
		 JOptionPane.showMessageDialog(view, "Nombre de archivo inválido", "Archivo inválido", JOptionPane.ERROR_MESSAGE);
		}
		FileComparator fileComparator = new FileComparator(file);
		
		JLabel path = (JLabel) view.getComponent("lbPath");
		path.setText(file.getPath());
		JTextArea content = (JTextArea) view.getComponent("txtContent");
		content.setText( fileComparator.read()  );
		
	}

}
