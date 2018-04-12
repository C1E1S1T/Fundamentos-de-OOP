package controllers;

import java.awt.event.ActionEvent;

import app.View;
import views.GameView;

public class PlayController extends Controller {

	public PlayController(View view) 
	{
		super(view);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		GameView gameView = new GameView();
		gameView.interact();
	}

}
