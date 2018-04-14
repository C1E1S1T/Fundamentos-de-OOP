package views;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;

public class TextView extends JPanel 
{
	private static TextView textView;
	private static final long serialVersionUID = 2676630691465079044L;
	private JTextPane content;
	
	
	/**
	 * Create the panel.
	 */
	private TextView() 
	{
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		content = new JTextPane();
		add(content);

		JScrollPane scroll = new JScrollPane(content);
		add(scroll);
	}

	public static TextView getInstance()
	{
		if(textView == null)
		{
			textView = new TextView();
		}
		return textView;
	}
	
	public String getContent()
	{
		return content.getText();
	}

	public void setContent(String text) 
	{
		this.content.setText(text);
	}
	
	
	
}
