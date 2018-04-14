package views;

import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.util.ArrayList;

import javax.swing.JMenu;
import javax.swing.SwingConstants;

import controllers.OperationController;

public class MenuView extends JPanel 
{
	private static final long serialVersionUID = -1132848775061633807L;
	private static MenuView menu;
	private JMenuItem mntmGuardarComo;
	private JMenuItem mntmAbrir;
	
	/**
	 * Create the panel.
	 */
	private MenuView() 
	{
		JMenuBar menuBar = new JMenuBar();
		add(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmAbrir = new JMenuItem("Abrir");
		mnArchivo.add(mntmAbrir);
		
		mntmGuardarComo = new JMenuItem("Guardar como");
		mnArchivo.add(mntmGuardarComo);	
	}

	public static MenuView getInstance()
	{
		if(menu == null)
		{
			menu = new MenuView();
		}
		return menu;
	}

	public void interact(ArrayList<OperationController>controllers)
	{
		mntmGuardarComo.addActionListener(controllers.get(0));
		mntmAbrir.addActionListener(controllers.get(1));
			
	}
	
	
}
