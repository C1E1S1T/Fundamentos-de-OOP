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

public class WelcomeView extends View 
{
	private static final long serialVersionUID = 7632729615609614823L;

	private JLabel label;
	private JTextField txt;
	private JButton button;
	
	public WelcomeView()
	{
		label = new JLabel();
		txt = new JTextField();
		button = new JButton(); 
		components.put("label", label);
		components.put("txt", txt);
		components.put("button", button);
		designView();
	}
	
	private void designView()
	{
		LayoutManager layout = new BorderLayout();
		setLayout(layout);
		label.setText("Bievenido usuario");
		txt.setText("Ingrese su nombre");
		button.setText("Saludar");
		add(label,BorderLayout.NORTH);
		add(txt,BorderLayout.CENTER);
		add(button, BorderLayout.SOUTH);
	}
	
	
	@Override
	public Map<String, JComponent> getMap() 
	{
		return new HashMap<>();
	}


	
}
