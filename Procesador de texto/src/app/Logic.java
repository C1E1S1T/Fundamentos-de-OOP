package app;

import java.util.ArrayList;
import java.util.HashMap;

import controllers.OperationController;

public interface Logic 
{
	public HashMap<String, ArrayList<OperationController>> getOperationController();
}
