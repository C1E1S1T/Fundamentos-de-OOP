package views;

import java.awt.BorderLayout;
import java.awt.LayoutManager;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;

import app.View;

public class JavaFilesView extends View 
{

	private static final long serialVersionUID = 6417400532295687944L;
	private JLabel title;
	private JTextField nameFile;
	private JButton search;
	
	public JavaFilesView()
	{
		title = new JLabel();
		nameFile = new JTextField();
		search = new JButton(); 
		components.put("lbTitle", title);
		components.put("txtNameFile", nameFile);
		components.put("btSearch", search );
		designView();
	}
	
	private void designView() 
	{
		LayoutManager layout = new BorderLayout();
		setLayout(layout);
		title.setText("Buscador de archivos");
		nameFile.setText("Codigo");
		search.setText("Buscar");
		add(title,BorderLayout.NORTH);
		add(nameFile,BorderLayout.CENTER);
		add(search, BorderLayout.SOUTH);	
	}

	@Override
	public Map<String, JComponent> getMap() 
	{
		return new HashMap<>();
	}

}
