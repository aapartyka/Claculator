package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import view.CalculatorStandardView;

public class NumericButtonController implements ActionListener, KeyListener {

	private CalculatorStandardView view;
	private OperationController opController;
	
	public NumericButtonController(CalculatorStandardView view) {
		
		this.view = view;
		this.opController = new OperationController(view);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == view.getBtn0()) {
			view.getTxfSolution().setText(view.getTxfSolution().getText() + "0");
		}
		else if (e.getSource() == view.getBtn1()) {
			view.getTxfSolution().setText(view.getTxfSolution().getText() + "1");
		}
		else if (e.getSource() == view.getBtn2()) {
			view.getTxfSolution().setText(view.getTxfSolution().getText() + "2");
		}
		else if (e.getSource() == view.getBtn3()) {
			view.getTxfSolution().setText(view.getTxfSolution().getText() + "3");
		}
		else if (e.getSource() == view.getBtn4()) {
			view.getTxfSolution().setText(view.getTxfSolution().getText() + "4");
		}
		else if (e.getSource() == view.getBtn5()) {
			view.getTxfSolution().setText(view.getTxfSolution().getText() + "5");
		}
		else if (e.getSource() == view.getBtn6()) {
			view.getTxfSolution().setText(view.getTxfSolution().getText() + "6");
		}
		else if (e.getSource() == view.getBtn7()) {
			view.getTxfSolution().setText(view.getTxfSolution().getText() + "7");
		}
		else if (e.getSource() == view.getBtn8()) {
			view.getTxfSolution().setText(view.getTxfSolution().getText() + "8");
		}
		else if (e.getSource() == view.getBtn9()) {
			view.getTxfSolution().setText(view.getTxfSolution().getText() + "9");
		}		
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
}
