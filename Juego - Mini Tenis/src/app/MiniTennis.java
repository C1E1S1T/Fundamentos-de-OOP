package app;

public abstract class MiniTennis 
{
	private View view;
	private Logic logic;
	
	public MiniTennis()
	{
		this.view = this.getView();
		this.logic = this.getLogic();
	}
	
	
	protected abstract Logic getLogic();
	protected abstract View getView();

	public void start()
	{
		view.interact();
	}

}
