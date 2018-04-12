package app;

import views.UIView;

public class Aplication extends MiniTennis
{
		
	public static void main (String...args)
	{
		new Aplication().start();
	}

	@Override
	protected Logic getLogic() 
	{
		return null;
	}

	@Override
	protected View getView() 
	{
		return new UIView("Mini Tennis");
	}

}
