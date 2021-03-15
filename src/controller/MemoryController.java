package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CalculatorStandardView;

public class MemoryController implements ActionListener {

	private CalculatorStandardView view;

	public MemoryController(CalculatorStandardView view) {

		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == view.getBtnMemoryc()) {
			// TODO set Display 0.0
		} else if (e.getSource() == view.getMemoryMinus()) {
			// TODO 
		} else if (e.getSource() == view.getBtnMemoryPlus()) {
			// TODO
		} else if (e.getSource() == view.getBtnMemoryR()) {
			// TODO
		} else if (e.getSource() == view.getBtnMemoryS()) {
			// TODO
		} else if (e.getSource() == view.getBtnMemory()) {
			// TODO
		}

	}

}
