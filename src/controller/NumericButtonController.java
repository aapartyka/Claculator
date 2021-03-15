package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import view.CalculatorStandardView;

public class NumericButtonController implements ActionListener, KeyListener {

	// knows the View and the Controller for arithmetic Operations.
	private CalculatorStandardView view;

	public NumericButtonController(CalculatorStandardView view) {

		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == view.getBtn0()) {
			view.getTxfResult().setText(view.getTxfResult().getText() + "0");
		} else if (e.getSource() == view.getBtn1()) {
			view.getTxfResult().setText(view.getTxfResult().getText() + "1");
		} else if (e.getSource() == view.getBtn2()) {
			view.getTxfResult().setText(view.getTxfResult().getText() + "2");
		} else if (e.getSource() == view.getBtn3()) {
			view.getTxfResult().setText(view.getTxfResult().getText() + "3");
		} else if (e.getSource() == view.getBtn4()) {
			view.getTxfResult().setText(view.getTxfResult().getText() + "4");
		} else if (e.getSource() == view.getBtn5()) {
			view.getTxfResult().setText(view.getTxfResult().getText() + "5");
		} else if (e.getSource() == view.getBtn6()) {
			view.getTxfResult().setText(view.getTxfResult().getText() + "6");
		} else if (e.getSource() == view.getBtn7()) {
			view.getTxfResult().setText(view.getTxfResult().getText() + "7");
		} else if (e.getSource() == view.getBtn8()) {
			view.getTxfResult().setText(view.getTxfResult().getText() + "8");
		} else if (e.getSource() == view.getBtn9()) {
			view.getTxfResult().setText(view.getTxfResult().getText() + "9");
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
