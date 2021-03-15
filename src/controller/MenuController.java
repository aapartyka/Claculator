package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import view.CalculatorStandardView;

public class MenuController extends WindowAdapter implements ActionListener {

	private CalculatorStandardView view;

	public MenuController(CalculatorStandardView view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == view.getMniClose()) {
			close();
		} else if (e.getSource() == view.getMniAcademic()) {
			// To Do: Add academic GUI
			System.out.println("Öffne Akademische-Ansicht");
		} else if (e.getSource() == view.getMniProgrammer()) {
			// To Do: Add programmer GUI
			System.out.println("Öffne Programier-Ansicht");
		}
	}

	public void close() {
		System.exit(0);
	}
}
