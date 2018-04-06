package views;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controllers.CalculatorController;

public class CalculatorView 
{
	private JPanel panel;
	private JButton btnCalculate;
	private ArrayList<JTextField> results;
	private JTextField numberA;
	private JTextField numberB;
	
	public CalculatorView()
	{
		panel = new JPanel();
	}
	
	public JPanel interact(CalculatorController  controller)
	{
		designPanel();
	    btnCalculate.addActionListener(controller);
		return panel;
	}
	
	private void designPanel()
	{
	    panel.setLayout( new BoxLayout(panel,BoxLayout.Y_AXIS) );
	    numberA = createTextField("Numero 1:");
	    panel.add(numberA);
	    numberB = createTextField("Numero 2:");
	    panel.add(numberB);
	    btnCalculate = new JButton("Calcular");
	    panel.add(btnCalculate);
	    designResult();
	}

	private void designResult() 
	{
		String[] textResult = {"Suma","Resta","Multiplicacion","Division"};
		results = new ArrayList<>(4);
		Integer i=0;
		for(String result : textResult)
		{
			results.add(new JTextField(result+"="));
			panel.add( results.get(i) );
			i++;
		}
	}

	private JTextField createTextField(String placeHolder)
	{
		JTextField textField = new JTextField(placeHolder.length());
		TextPrompt placeholder = new TextPrompt(placeHolder, textField);
	    placeholder.changeAlpha(0.75f);
	    placeholder.changeStyle(Font.ITALIC);
		return textField;
	}

	public List<JTextField> getResults() 
	{
		return results;
	}
	
	public JTextField getNumberA() 
	{
		return numberA;
	}

	public JTextField getNumberB() 
	{
		return numberB;
	}

}
