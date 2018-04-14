package app;

import java.util.ArrayList;
import java.util.HashMap;

import controllers.LocalLogic;
import controllers.OperationController;
import views.UIView;

public abstract class TextProcessor 
{
	
	public void start()
	{	
		Logic logic = new LocalLogic();
		View frame = new UIView();
		HashMap<String, ArrayList<OperationController>> controllers = logic.getOperationController();
		frame.interact(controllers);
	}
	
	
	
}
