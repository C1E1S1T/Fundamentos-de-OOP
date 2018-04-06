package views;

import javax.swing.JComponent;

import controllers.Controller;

public interface View 
{
	public JComponent interact(Controller controller);
}
