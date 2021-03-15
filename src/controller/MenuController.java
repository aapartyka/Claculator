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
		if (e.getSource() == view.getmniBeenden()) {
			beenden();
		}	
		else if (e.getSource() == view.getmniAcademic()) {
			// To Do: Add academic GUI
			System.out.println("Öffne Akademische-Ansicht");
		}
		else if (e.getSource() == view.getmniProgrammer()) {
			//To Do: Add programmer GUI 
			System.out.println("Öffne Programier-Ansicht");
		}
	}
		
	public void beenden() {
			System.exit(0);
		}
}
