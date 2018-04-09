package app;

import java.awt.Component;
import java.util.HashMap;
import java.util.Map;

import controllers.Controller;

public abstract class View
{
	protected Map<String, Component> components;
	
	public View()
	{
		components = new HashMap<>();
	}
	
	public abstract Component interact(Controller controller);
	public Component getComponent(String nameCompontent)
	{
		return components.get(nameCompontent); 
	}
	public abstract Component getContainer();
}
