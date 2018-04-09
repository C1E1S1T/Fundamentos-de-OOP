package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import app.View;
import controllers.Controller;

public class CongratulationView extends View 
{
	private JPanel container;
	private JLabel title;
	private JButton btnPlay;
	private JButton btnReadMessage;
	private JButton btnChangeMusic;

	public CongratulationView()
	{
		container = new JPanel();	
		title = new JLabel();
		btnPlay = new JButton();
		btnReadMessage = new JButton();
		btnChangeMusic = new JButton();
	}
	
	@Override
	public JComponent interact(Controller controller) 
	{
		designView();
		btnReadMessage.addActionListener(controller);
		return container;
	}
	
	public JComponent getContainer()
	{
		return container;
	}
	
	private void designView() 
	{
		designContainer();
		designComponents();
	}

	private void designContainer() 
	{
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{81, 257, 0};
		gbl_panel.rowHeights = new int[]{63, 50, 50, 49, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		container.setLayout(gbl_panel);
	}
	
	private void designComponents() 
	{
		title = new JLabel("Feliz Cumplea\u00F1os Fatima!");
		title.setFont(new Font("Times New Roman", Font.BOLD, 50));
		GridBagConstraints gbc_lblFelizCumpleanos = new GridBagConstraints();
		gbc_lblFelizCumpleanos.insets = new Insets(0, 0, 5, 0);
		gbc_lblFelizCumpleanos.gridx = 1;
		gbc_lblFelizCumpleanos.gridy = 0;
		container.add(title, gbc_lblFelizCumpleanos);
		
		btnPlay = new JButton("Jugar");
		btnPlay.setToolTipText("Lo siento, no disponible");
		btnPlay.setForeground(Color.WHITE);
		btnPlay.setBackground(Color.BLACK);
		GridBagConstraints gbc_btnPlay = new GridBagConstraints();
		gbc_btnPlay.anchor = GridBagConstraints.NORTH;
		gbc_btnPlay.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPlay.insets = new Insets(0, 0, 5, 0);
		gbc_btnPlay.gridx = 1;
		gbc_btnPlay.gridy = 1;
		container.add(btnPlay, gbc_btnPlay);
		
		btnReadMessage = new JButton("Ver mensaje");
		btnReadMessage.setForeground(Color.WHITE);
		btnReadMessage.setBackground(Color.BLACK);
		GridBagConstraints gbc_btnVerMensaje = new GridBagConstraints();
		gbc_btnVerMensaje.anchor = GridBagConstraints.NORTH;
		gbc_btnVerMensaje.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnVerMensaje.insets = new Insets(0, 0, 5, 0);
		gbc_btnVerMensaje.gridx = 1;
		gbc_btnVerMensaje.gridy = 2;
		container.add(btnReadMessage, gbc_btnVerMensaje);
		
		btnChangeMusic = new JButton("Cambiar musica");
		btnChangeMusic.setToolTipText("Lo siento, no disponible");
		btnChangeMusic.setForeground(Color.WHITE);
		btnChangeMusic.setBackground(Color.BLACK);
		GridBagConstraints gbc_btnCambiarMusica = new GridBagConstraints();
		gbc_btnCambiarMusica.anchor = GridBagConstraints.NORTH;
		gbc_btnCambiarMusica.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCambiarMusica.gridx = 1;
		gbc_btnCambiarMusica.gridy = 3;
		container.add(btnChangeMusic, gbc_btnCambiarMusica);	
	}

	
}
