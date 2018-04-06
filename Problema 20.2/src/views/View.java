package views;

import javax.swing.JComponent;
import controllers.Controller;

public abstract class View extends JComponent
{
	private static final long serialVersionUID = -8233246662812010829L;
	public abstract JComponent interact(Controller controller);
	public abstract JComponent getComponent(String nameCompontent);
}
