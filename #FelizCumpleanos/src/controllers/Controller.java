package controllers;

import java.awt.event.ActionListener;

import app.View;


public abstract class Controller implements ActionListener
{
	protected View view;
	
	public Controller(View view)
	{
		this.view = view;
	}
	
}
