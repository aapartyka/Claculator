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
			if (view.getTxfResult().getText().length() > 0) {
				this.operator = '+';
				setDisplayValue();
			}
		} else if (e.getSource() == view.getBtnMinus()) {
			if (view.getTxfResult().getText().length() > 0) {
				this.operator = '-';
				setDisplayValue();
			}
		} else if (e.getSource() == view.getBtnDivide()) {
			if (view.getTxfResult().getText().length() > 0) {
				this.operator = '/';
				setDisplayValue();
			}
		} else if (e.getSource() == view.getBtnMultiply()) {
			if (view.getTxfResult().getText().length() > 0) {
				this.operator = '*';
				setDisplayValue();
			}
		} else if (e.getSource() == view.getBtnPotencySqare()) {
			if (view.getTxfResult().getText().length() > 0) {

			}
		} else if (e.getSource() == view.getBtnSquareRoot()) {
			if (view.getTxfResult().getText().length() > 0) {

			}
		} else if (e.getSource() == view.getBtnPercent()) {
			if (view.getTxfResult().getText().length() > 0) {

			}
		} else if (e.getSource() == view.getBtnOneDivideBy()) {

		} else if (e.getSource() == view.getBtnBackspace()) {
			if (view.getTxfResult().getText().length() > 0) {
				view.getTxfResult().setText(""
						+ view.getTxfResult().getText().substring(0, view.getTxfResult().getText().length() - 1));
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
		case '+':
			// addition
			displayValue = displayValue + "+";
			break;
		case '-':
			// Subtrahieren
			displayValue = displayValue + "-";
			break;
		case '*':
			// Multipliezieren
			displayValue = displayValue + "*";
			break;
		// Teilen
		case '/':
			displayValue = displayValue + "/";

		default:
			break;
		}
		view.getTxfResult().setText("");
		view.getTxfAdditionalCalculation().setText(displayValue);
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
		result = model.divide(number1, number2);
		view.getTxfResult().setText(Double.toString(result));
	}

	public void multiply() {

		number2 = Double.parseDouble(view.getTxfResult().getText());
		result = model.multiply(number1, number2);
		view.getTxfResult().setText(Double.toString(result));
	}
}
