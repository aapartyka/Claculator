package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CalculatorStandardView;

public class MemoryController implements ActionListener{

	private CalculatorStandardView view;
	
	public MemoryController(CalculatorStandardView view) {
		
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == view.getBtnMemoryc()) {
			
		}
		else if (e.getSource() == view.getMemoryMinus()) {
			
		}
		else if (e.getSource() == view.getBtnMemoryPlus()) {
			
		}
		else if (e.getSource() == view.getBtnMemoryR()) {
			
		}
		else if (e.getSource() == view.getBtnMemoryS()) {
			
		}
		else if (e.getSource() == view.getBtnMemory()) {
			
		}
		
	}
	
	
	
	
}
