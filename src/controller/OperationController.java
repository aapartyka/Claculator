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
	private boolean noSecondNumber2;

	private String displayValue;
	private char operator;

	public OperationController(CalculatorStandardView view) {

		this.view = view;
		this.model = new CalculatorStandardModel();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == view.getBtnPlus()) {
			if (view.getTxfResult().getText().length() > 0) {
				this.operator = '+';
				this.noSecondNumber2 = false;
			}
		} else if (e.getSource() == view.getBtnMinus()) {
			if (view.getTxfResult().getText().length() > 0) {
				this.operator = '-';
				this.noSecondNumber2 = false;
			}
		} else if (e.getSource() == view.getBtnDivide()) {
			if (view.getTxfResult().getText().length() > 0) {
				this.operator = '/';
				this.noSecondNumber2 = false;
			}
		} else if (e.getSource() == view.getBtnMultiply()) {
			if (view.getTxfResult().getText().length() > 0) {
				this.operator = '*';
			}
		} else if (e.getSource() == view.getBtnPotencySqare()) {
			if (view.getTxfResult().getText().length() > 0) {
				this.operator = '²';
				this.noSecondNumber2 = true;
			}
		} else if (e.getSource() == view.getBtnSquareRoot()) {
			if (view.getTxfResult().getText().length() > 0) {
				this.operator = '√';
				this.noSecondNumber2 = true;
			}
		} else if (e.getSource() == view.getBtnPercent()) {
			if (view.getTxfResult().getText().length() > 0) {
				this.operator = '%';
				this.noSecondNumber2 = true;
			}
		} else if (e.getSource() == view.getBtnOneDivideBy()) {
			if (view.getTxfResult().getText().length() > 0) {
				this.operator = 'd';
				this.noSecondNumber2 = true;
			}
		} else if (e.getSource() == view.getBtnBackspace()) {
			//Delete the latest number which is displayed.
			if (view.getTxfResult().getText().length() > 0) {
				view.getTxfResult().setText(""
						+ view.getTxfResult().getText().substring(0, view.getTxfResult().getText().length() - 1));
			}
		} else if (e.getSource() == view.getBtnChangeSign()) {
			if (view.getTxfResult().getText().length() > 0) {
				this.operator = 'c';
				this.noSecondNumber2 = true;
			}
		} else if (e.getSource() == view.getBtnC()) {
			view.getTxfAdditionalCalculation().setText("");
			view.getTxfResult().setText("");
		} else if (e.getSource() == view.getBtnCE()) {
			if (view.getTxfResult().getText().length() > 0) {

			}
		} else if (e.getSource() == view.getBtnResult()) {
			if (view.getTxfResult().getText().length() > 0
					&& view.getTxfAdditionalCalculation().getText().length() > 0) {
				arithmeticOperation();
			}
		}
			
		if (e.getSource() != view.getBtnResult() & e.getSource() != view.getBtnBackspace() & e.getSource() != view.getBtnC()) {
			setDisplayValue();
		}
		
	}

	public void arithmeticOperation() {

		switch (operator) {
		case '+':
			// addition
			add();
			break;
		case '-':
			// Subtrahieren
			subtract();
			break;
		case '*':
			// Multipliezieren
			multiply();
			break;
		case '/':
			// Teilen
			divide();
			break;
		default:
			break;
		}
	}

	public void setDisplayValue() {

		displayValue = view.getTxfResult().getText();
		number1 = Double.parseDouble(displayValue);

		switch (operator) {
		case 'c':
			changesign();
			break;
		case '+':
		// addition
			displayValue = displayValue + "+";
			break;
		case '-':
		// subtract
			displayValue = displayValue + "-";
			break;
		case '*':
		// multiply
			displayValue = displayValue + "*";
			break;
		case '/':
		// divide
			displayValue = displayValue + "/";
			break;
		case '²':
		// potency square
			potencySqare();
			break;
		case '√':
		// squareRoot
			squareRoot();
			break;
		case '%':
		// percent
			displayValue = displayValue + "%";
			break;
		case 'd':
		// 1 divide by userinput
			displayValue = displayValue + "/";
			break;
		default:
			break;
		}
		if (noSecondNumber2 == false) {
			view.getTxfResult().setText("");
			view.getTxfAdditionalCalculation().setText(displayValue);
		}
	}

	public void add() {

		number2 = Double.parseDouble(view.getTxfResult().getText());
		result = model.add(number1, number2);
		view.getTxfResult().setText(Double.toString(result));
	}

	public void subtract() {

		number2 = Double.parseDouble(view.getTxfResult().getText());
		result = model.subtract(number1, number2);
		view.getTxfResult().setText(Double.toString(result));
	}

	public void divide() {

		number2 = Double.parseDouble(view.getTxfResult().getText());
		try {
			result = model.divide(number1, number2);
		} catch (ArithmeticException excp) {
			// TODO: Add tooltipp which Displays the exception.
		}

		view.getTxfResult().setText(Double.toString(result));
	}

	public void multiply() {

		number2 = Double.parseDouble(view.getTxfResult().getText());
		result = model.multiply(number1, number2);
		view.getTxfResult().setText(Double.toString(result));
	}
	
	public void changesign() {
		result = number1 *(-1.0);
		view.getTxfResult().setText(Double.toString(result));
	}
	
	public void potencySqare(){
		displayValue = displayValue + "²";
		result = model.potencySquare(number1);
		view.getTxfAdditionalCalculation().setText(displayValue);
		view.getTxfResult().setText(Double.toString(result));
	}	
	
	public void squareRoot() {
		displayValue = displayValue + "√";
		result = model.squareRoot(number1);
		view.getTxfAdditionalCalculation().setText(displayValue);
		view.getTxfResult().setText(Double.toString(result));
	}
}
