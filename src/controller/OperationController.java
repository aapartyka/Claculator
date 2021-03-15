package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.CalculatorStandardModel;
import view.CalculatorStandardView;

public class OperationController implements ActionListener {

	private CalculatorStandardView view;
	private CalculatorStandardModel model;
	
	private double number1;
	private double number2;
	private double result;
	
	private String displayValue;
	private char operator;
	
	public OperationController(CalculatorStandardView view) {
		
		this.view = view;
		this.model = new CalculatorStandardModel();
	}	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == view.getBtnPlus()) {	
			if (view.getTxfSolution().getText().length() > 0) {
				this.operator = '+';
				setDisplayValue();
			}
		}
		else if (e.getSource() == view.getBtnMinus()) {
			if (view.getTxfSolution().getText().length() > 0) {
				this.operator = '-';
				setDisplayValue();
			}
		}
		else if (e.getSource() == view.getBtnDivide()) {
			if (view.getTxfSolution().getText().length() > 0) {
				this.operator = '/';
				setDisplayValue();
			}
		}
		else if (e.getSource() == view.getBtnMultiply()) {
			if (view.getTxfSolution().getText().length() > 0) {
				this.operator = '*';
				setDisplayValue();
			}
		}
		else if (e.getSource() == view.getBtnPotencySqare()) {
			if (view.getTxfSolution().getText().length() > 0) {
				
			}
		}
		else if (e.getSource() == view.getBtnSquareRoot()) {
			if (view.getTxfSolution().getText().length() > 0) {
				
			}
		}
		else if (e.getSource() == view.getBtnPercent()) {
			if (view.getTxfSolution().getText().length() > 0) {
				
			}
		}
		else if (e.getSource() == view.getBtnOneDivideBy()) {
			
		}
		else if (e.getSource() == view.getBtnDelete()) {
			if(view.getTxfSolution().getText().length() > 0) {
				view.getTxfSolution().setText("" + view.getTxfSolution().getText().substring(0, view.getTxfSolution().getText().length() - 1));
			}
		}
		else if (e.getSource() == view.getBtnC()){

				view.getTxfAdditionalCalculation().setText("");
				view.getTxfSolution().setText("");
			
		}
		else if (e.getSource() == view.getBtnCE()) {
			if (view.getTxfSolution().getText().length() > 0) {
				
			}
		}
		else if (e.getSource() == view.getBtnResult()) {
			if (view.getTxfSolution().getText().length() > 0 && view.getTxfAdditionalCalculation().getText().length() >0) {
				arithmeticOperation();
			}
		}
		
	}
	
	
	public void arithmeticOperation() {
				
		switch (operator) {
		case '+':
			//addition
			add();	
			break;
		case '-':
			//Subtrahieren
			subtract();
			break;
		case '*':
			//Multipliezieren
			multiply();
			break;
		case '/':
			//Teilen
			divide();
				break;
		default:
			break;
		}
	}
	
	public void setDisplayValue() {
		
		displayValue = view.getTxfSolution().getText();
		number1 = Double.parseDouble(displayValue);
		
		switch (operator) {
		case '+':
			//addition
			displayValue = displayValue + "+";
			break;
		case '-':
			//Subtrahieren
			displayValue = displayValue + "-";
			break;
		case '*':
			//Multipliezieren
			displayValue = displayValue + "*";
			break;
			//Teilen
		case '/':
			displayValue = displayValue + "/";
				
		default:
			break;
		}
		view.getTxfSolution().setText("");
		view.getTxfAdditionalCalculation().setText(displayValue);
	}
	
	public void add() {
		
		number2 = Double.parseDouble(view.getTxfSolution().getText());
		result = model.add(number1, number2);	
		view.getTxfSolution().setText(Double.toString(result));
	}
	
	public void subtract() {
		
		number2 = Double.parseDouble(view.getTxfSolution().getText());		
		result = model.subtract(number1, number2);		
		view.getTxfSolution().setText(Double.toString(result));
	}
	
	public void divide() {
		
		number2 = Double.parseDouble(view.getTxfSolution().getText());
		result = model.divide(number1, number2);
		view.getTxfSolution().setText(Double.toString(result));
	}
	
	public void multiply() {
		
		number2 = Double.parseDouble(view.getTxfSolution().getText());	
		result = model.multiply(number1, number2);	
		view.getTxfSolution().setText(Double.toString(result));
	}
}
