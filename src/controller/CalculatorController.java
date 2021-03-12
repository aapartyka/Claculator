package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;

import model.CalculatorStandardModel;
import view.CalculatorView;

public class CalculatorController extends WindowAdapter implements ActionListener, KeyListener {

	private CalculatorView view;
	private CalculatorStandardModel model;
	
	public CalculatorController(CalculatorView view) {
		this.view = view;
		this.model = new CalculatorStandardModel();
	}
	
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == view.getmniBeenden()) {
			beenden();
		}	
		else if (e.getSource() == view.getmniAcademic()) {
			// To Do: Akademische GUI hinzufügen
			System.out.println("Öffne Akademische-Ansicht");
		}
		else if (e.getSource() == view.getmniProgrammer()) {
			//To Do:Programmierer GUI hinzufügen
			System.out.println("Öffne Programier-Ansicht");
		}
		else if (e.getSource() == view.getBtnPlus()) {
			Calculate('+');
		}
		else if (e.getSource() == view.getBtnMinus()) {
			
		}
		else if (e.getSource() == view.getBtnDivision()) {
			
		}
		else if (e.getSource() == view.getBtnMultiplicate()) {
			
		}
		else if (e.getSource() == view.getBtnSqare()) {
			
		}
		else if (e.getSource() == view.getBtnQuadratwurzel()) {
			
		}
		else if (e.getSource() == view.getBtnPercent()) {
			
		}
		else if (e.getSource() == view.getBtnC()) {
			
		}
		else if (e.getSource() == view.getBtnCE()) {
			
		}
		else if (e.getSource() == view.getBtnSolution()) {
			Calculate('+');
			System.out.println("Test");
		}
		else if (e.getSource() == view.getBtnDelete()) {
			view.getTxfSolution().setText("" + view.getTxfSolution().getText().substring(0, view.getTxfSolution().getText().length() - 1));
		}
	}
		
	public void beenden() {
			System.exit(0);
		}
	
	public void Calculate(char operator) {
		
		
		if (operator == '+') {
			
			double result = 0;
			
			String summand1Str = view.getTxfSolution().getText();
			String summand2Str = view.getTxfSolution().getText();
			
			// Wrapper
			double summand1 = 0;
			double summand2 = 0;
			
			try {
				
				 summand1 = Double.parseDouble(summand1Str);
				 summand2 = Double.parseDouble(summand2Str);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			result = model.addition(summand1, summand2);
			
			
			view.getTxfSolution().setText(String.format("%.1f", result));
		}
	}

}
