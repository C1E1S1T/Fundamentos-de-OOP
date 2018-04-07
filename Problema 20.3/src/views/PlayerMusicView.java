package views;

import java.awt.BorderLayout;
import java.awt.LayoutManager;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;

import app.View;

public final class PlayerMusicView extends View 
{
	private static final long serialVersionUID = -4706124774804990416L;
	private JLabel title;
	private JTextField nameSound;
	private JButton play;
	
	public PlayerMusicView()
	{
		title = new JLabel();
		nameSound = new JTextField();
		play = new JButton(); 
		components.put("lbTitle", title);
		components.put("txtNameSound", nameSound);
		components.put("btPlay", play );
		designView();
	}
		
	private void designView() 
	{
		LayoutManager layout = new BorderLayout();
		setLayout(layout);
		title.setText("Reproductor de musica");
		nameSound.setText("Ruta de la musica");
		play.setText("Reproducir");
		add(title,BorderLayout.NORTH);
		add(nameSound,BorderLayout.CENTER);
		add(play, BorderLayout.SOUTH);
	}

	@Override
	public Map<String, JComponent> getMap() 
	{
		return new HashMap<>();
	}

}
