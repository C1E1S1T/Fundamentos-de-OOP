package views;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import app.View;
import controllers.Controller;

public class FileView extends View
{

	private JPanel filePanel;
	private JButton search;
	private JLabel path;
	private JTextArea content;
	private Map<String,JComponent> components;
	
	public FileView()
	{
		filePanel = new JPanel();	
		components = new HashMap<>();
	}

	@Override
	public JComponent interact(Controller controller) 
	{
		designView();
		search.addActionListener(controller);
		return filePanel;
	}
	
	private void designView() 
	{
		  LayoutManager  layout =  new GridBagLayout(); 
		  filePanel.setLayout(layout);
		  GridBagConstraints grid = new GridBagConstraints();
		  grid.fill = GridBagConstraints.HORIZONTAL;
		  grid.weightx = 0.5;
		  grid.gridx = 0;
		  grid.gridy = 0;
		  search = new JButton("Buscar archivo");
		  components.put("btnSearch", search);
		  filePanel.add(search,grid);
		  grid.fill = GridBagConstraints.HORIZONTAL;
		  grid.weightx = 1;
		  grid.gridx = 1;
		  grid.gridy = 0;
		  path = new JLabel("No hay archivo");
		  components.put("lbPath", path);
		  filePanel.add(path,grid);
		  grid.fill = GridBagConstraints.HORIZONTAL;
		  grid.ipady = 350;
		  grid.weightx = 0.0;
		  grid.gridwidth = 3;
		  grid.gridx = 0;
		  grid.gridy = 1;
		  content = new JTextArea();
		  content.setEditable(false);
		  components.put("txtContent", content);
		  filePanel.add(content,grid);
	}

	@Override
	public JComponent getComponent(String nameComponent) 
	{
		return components.get(nameComponent);
	}

	@Override
	public JComponent getContainer() 
	{
		return filePanel;
	}
	
	

}
