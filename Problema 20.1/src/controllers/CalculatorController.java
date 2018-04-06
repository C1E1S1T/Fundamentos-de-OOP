package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import models.Calculator;
import views.CalculatorView;

public class CalculatorController implements ActionListener
{
	
	private CalculatorView calculatorView;

	public CalculatorController(CalculatorView calculatorView) 
	{
		this.calculatorView = calculatorView;
	}

	@Override
	public void actionPerformed(ActionEvent event) 
	{
		Double numberA = Double.parseDouble(calculatorView.getNumberA().getText());
		Double numberB = Double.parseDouble(calculatorView.getNumberB().getText());
		Calculator calculator = new Calculator(numberA,numberB);
		calculator.add(); 
		calculator.subtract();
		calculator.multiply();
		calculator.divide();
		List<Double> results = calculator.getResults();
		for(int i=0; i<results.size(); i++)
		{
			setText(results.get(i),i);
		}
	}

	private void setText(Double result,int index) 
	{
		calculatorView.getResults().get(index).setText(calculatorView.getResults().get(index).getText()+result.toString());
	}

}
