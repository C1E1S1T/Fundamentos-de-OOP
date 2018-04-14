package controllers;

import java.util.ArrayList;
import java.util.HashMap;

import app.Logic;

public class LocalLogic implements Logic 
{

	@Override
	public HashMap<String, ArrayList<OperationController>> getOperationController() 
	{
		ArrayList<OperationController>  menuControllers = new ArrayList<>();
		HashMap<String, ArrayList<OperationController>> packageController = new HashMap<>();
		menuControllers.add(new FileSaveAsController());
		menuControllers.add(new FileOpenController());
		menuControllers.add(new FileSaveController());
		packageController.put("MenuControllers", menuControllers);
		return packageController;
	}
	
}
