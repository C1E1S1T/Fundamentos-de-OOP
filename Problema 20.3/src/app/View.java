package app;

import java.util.Map;

import javax.swing.JComponent;
import javax.swing.JPanel;

public abstract class View extends JPanel
{
	protected Map<String,JComponent> components;
	
	private static final long serialVersionUID = 7165287378153026073L;
	public abstract Map<String,JComponent> getMap();
	
	public View()
	{
		components = getMap();
	}
	
	public JComponent getComponent(String nameCompontent)
	{
		return components.get(nameCompontent);
	}
	
}
