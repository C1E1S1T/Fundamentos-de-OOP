package app;

import java.util.ArrayList;
import java.util.HashMap;

import controllers.OperationController;

public interface View 
{
	public void interact(HashMap<String, ArrayList<OperationController>> controllers);
}
