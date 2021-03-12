package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import controller.CalculatorController;

public class CalculatorView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	//View kennt den Controller
	private CalculatorController controller;
	
	
	//Deklaration der Menüleiste, des Menüs und der Menü Punkte
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mniProgrammer;
	private JMenuItem mniAcademic;
	private JMenuItem mniBeenden;
	
	//Deklaration der Schriftart
	Font fontBtnNumber = new Font("Cambria Math", Font.BOLD, 19);
	Font fontBtnOperator = new Font("Monospaced",Font.BOLD, 18);
	Font fontMemory = new Font ("Cambria Math", Font.BOLD, 12);
	
	//Deklaration der Komponnenten
	
	//Delaration der Buttons
	private JButton btn0;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnChangeSign;
	private JButton btnPercent;
	private JButton btnOneDividadeBy;
	private JButton btnC;
	private JButton btnCE;
	private JButton btnDelete;
	private JButton btnMinus;
	private JButton btnPlus;
	private JButton btnKomma;
	private JButton btnDivision;
	private JButton btnMultiplicate;
	private JButton btnQuadratwurzel;
	private JButton btnSqare;
	private JButton btnMminus;
	private JButton btnMplus;
	private JButton btnMS;
	private JButton btnMR;
	private JButton btnMc;
	private JButton btnMSpeicher;
	private JButton btnSolution;
	
	private JFrame frame;
	private JTextField txfAdditionalCalculation;
	private JTextField txfSolution;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorView window = new CalculatorView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorView() {
		super("Rechner");
		initializeComponents();
		initaliseEvents();
		this.controller = new CalculatorController(this);
		
		
		mniProgrammer.addActionListener(controller);
		mniAcademic.addActionListener(controller);
		mniBeenden.addActionListener(controller);
		
		btn0.addActionListener(controller);
		btn1.addActionListener(controller);
		btn2.addActionListener(controller);
		btn3.addActionListener(controller);
		btn4.addActionListener(controller);
		btn5.addActionListener(controller);
		btn6.addActionListener(controller);
		btn7.addActionListener(controller);
		btn8.addActionListener(controller);
		btn9.addActionListener(controller);
		btnPlus.addActionListener(controller);
		
		btnDelete.addActionListener(controller);
		btnSolution.addActionListener(controller);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initializeComponents() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setForeground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 342, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		this.btn1 = new JButton("1");
		btn1.setForeground(UIManager.getColor("Button.highlight"));
		btn1.setBackground(Color.DARK_GRAY);
		btn1.setFont(new Font("Monospaced", Font.BOLD, 19));
		btn1.setBounds(4, 347, 78, 48);
		frame.getContentPane().add(btn1);

		this.btnChangeSign = new JButton("+/-");
		btnChangeSign.setForeground(UIManager.getColor("Button.highlight"));
		btnChangeSign.setBackground(Color.DARK_GRAY);
		btnChangeSign.setFont(new Font("Monospaced", Font.BOLD, 19));
		btnChangeSign.setBounds(4, 397, 78, 48);
		frame.getContentPane().add(btnChangeSign);

		this.btn7 = new JButton("7");
		btn7.setForeground(UIManager.getColor("Button.highlight"));
		btn7.setBackground(Color.DARK_GRAY);
		btn7.setFont(new Font("Monospaced", Font.BOLD, 19));
		btn7.setBounds(4, 247, 78, 48);
		frame.getContentPane().add(btn7);

		this.btn4 = new JButton("4");
		btn4.setForeground(UIManager.getColor("Button.highlight"));
		btn4.setBackground(Color.DARK_GRAY);
		btn4.setFont(new Font("Monospaced", Font.BOLD, 19));
		btn4.setBounds(4, 297, 78, 48);
		frame.getContentPane().add(btn4);

		this.btnPercent = new JButton("%");
		btnPercent.setForeground(UIManager.getColor("Button.highlight"));
		btnPercent.setBackground(Color.DARK_GRAY);
		btnPercent.setFont(new Font("Cambria Math", Font.PLAIN, 18));
		btnPercent.setBounds(4, 147, 78, 48);
		frame.getContentPane().add(btnPercent);

		this.btnOneDividadeBy = new JButton("1/x");
		btnOneDividadeBy.setForeground(UIManager.getColor("Button.highlight"));
		btnOneDividadeBy.setBackground(Color.DARK_GRAY);
		btnOneDividadeBy.setFont(new Font("Monospaced", Font.PLAIN, 18));
		btnOneDividadeBy.setBounds(4, 197, 78, 48);
		frame.getContentPane().add(btnOneDividadeBy);

		this.btnCE = new JButton("CE");
		btnCE.setForeground(UIManager.getColor("Button.highlight"));
		btnCE.setBackground(Color.DARK_GRAY);
		btnCE.setFont(new Font("Monospaced", Font.PLAIN, 18));
		btnCE.setBounds(84, 147, 78, 48);
		frame.getContentPane().add(btnCE);

		this.btnSqare = new JButton("x^2");
		btnSqare.setForeground(UIManager.getColor("Button.highlight"));
		btnSqare.setBackground(Color.DARK_GRAY);
		btnSqare.setFont(new Font("Monospaced", Font.PLAIN, 18));
		btnSqare.setBounds(84, 197, 78, 48);
		frame.getContentPane().add(btnSqare);

		this.btn8 = new JButton("8");
		btn8.setForeground(UIManager.getColor("Button.highlight"));
		btn8.setBackground(Color.DARK_GRAY);
		btn8.setFont(new Font("Monospaced", Font.BOLD, 19));
		btn8.setBounds(84, 247, 78, 48);
		frame.getContentPane().add(btn8);

		this.btn5 = new JButton("5");
		btn5.setForeground(UIManager.getColor("Button.highlight"));
		btn5.setBackground(Color.DARK_GRAY);
		btn5.setFont(new Font("Monospaced", Font.BOLD, 19));
		btn5.setBounds(84, 297, 78, 48);
		frame.getContentPane().add(btn5);

		this.btn2 = new JButton("2");
		btn2.setForeground(UIManager.getColor("Button.highlight"));
		btn2.setBackground(Color.DARK_GRAY);
		btn2.setFont(new Font("Monospaced", Font.BOLD, 19));
		btn2.setBounds(84, 347, 78, 48);
		frame.getContentPane().add(btn2);

		this.btn0 = new JButton("0");
		btn0.setForeground(UIManager.getColor("Button.highlight"));
		btn0.setBackground(Color.DARK_GRAY);
		btn0.setFont(new Font("Monospaced", Font.BOLD, 19));
		btn0.setBounds(84, 397, 78, 48);
		frame.getContentPane().add(btn0);

		this.btnC = new JButton("C");
		btnC.setForeground(UIManager.getColor("Button.highlight"));
		btnC.setBackground(Color.DARK_GRAY);
		btnC.setFont(new Font("Monospaced", Font.PLAIN, 18));
		btnC.setBounds(164, 147, 78, 48);
		frame.getContentPane().add(btnC);

		this.btnQuadratwurzel = new JButton("2Wx");
		btnQuadratwurzel.setForeground(UIManager.getColor("Button.highlight"));
		btnQuadratwurzel.setBackground(Color.DARK_GRAY);
		btnQuadratwurzel.setFont(new Font("Monospaced", Font.PLAIN, 18));
		btnQuadratwurzel.setBounds(164, 197, 78, 48);
		frame.getContentPane().add(btnQuadratwurzel);

		this.btn9 = new JButton("9");
		btn9.setForeground(UIManager.getColor("Button.highlight"));
		btn9.setBackground(Color.DARK_GRAY);
		btn9.setFont(new Font("Monospaced", Font.BOLD, 19));
		btn9.setBounds(164, 247, 78, 48);
		frame.getContentPane().add(btn9);

		this.btn6 = new JButton("6");
		btn6.setForeground(UIManager.getColor("Button.highlight"));
		btn6.setBackground(Color.DARK_GRAY);
		btn6.setFont(new Font("Monospaced", Font.BOLD, 19));
		btn6.setBounds(164, 297, 78, 48);
		frame.getContentPane().add(btn6);

		this.btn3 = new JButton("3");
		btn3.setForeground(UIManager.getColor("Button.highlight"));
		btn3.setBackground(Color.DARK_GRAY);
		btn3.setFont(new Font("Monospaced", Font.BOLD, 19));
		btn3.setBounds(164, 347, 78, 48);
		frame.getContentPane().add(btn3);

		this.btnKomma = new JButton(",");
		btnKomma.setForeground(UIManager.getColor("Button.highlight"));
		btnKomma.setBackground(Color.DARK_GRAY);
		btnKomma.setFont(new Font("Monospaced", Font.BOLD, 19));
		btnKomma.setBounds(164, 397, 78, 48);
		frame.getContentPane().add(btnKomma);

		this.btnDelete = new JButton("<-");
		btnDelete.setForeground(UIManager.getColor("Button.highlight"));
		btnDelete.setBackground(Color.DARK_GRAY);
		btnDelete.setFont(new Font("Monospaced", Font.PLAIN, 18));
		btnDelete.setBounds(244, 147, 78, 48);
		frame.getContentPane().add(btnDelete);

		this.btnDivision = new JButton("/");
		btnDivision.setForeground(UIManager.getColor("Button.highlight"));
		btnDivision.setBackground(Color.DARK_GRAY);
		btnDivision.setFont(new Font("Monospaced", Font.PLAIN, 18));
		btnDivision.setBounds(244, 197, 78, 48);
		frame.getContentPane().add(btnDivision);

		this.btnMultiplicate = new JButton("x");
		btnMultiplicate.setForeground(UIManager.getColor("Button.highlight"));
		btnMultiplicate.setBackground(Color.DARK_GRAY);
		btnMultiplicate.setFont(new Font("Monospaced", Font.PLAIN, 18));
		btnMultiplicate.setBounds(244, 247, 78, 48);
		frame.getContentPane().add(btnMultiplicate);

		this.btnMinus = new JButton("-");
		btnMinus.setForeground(UIManager.getColor("Button.highlight"));
		btnMinus.setBackground(Color.DARK_GRAY);
		btnMinus.setFont(new Font("Monospaced", Font.PLAIN, 18));
		btnMinus.setBounds(244, 297, 78, 48);
		frame.getContentPane().add(btnMinus);

		this.btnPlus = new JButton("+");
		btnPlus.setForeground(UIManager.getColor("Button.highlight"));
		btnPlus.setBackground(Color.DARK_GRAY);
		btnPlus.setFont(new Font("Monospaced", Font.PLAIN, 18));
		btnPlus.setBounds(244, 347, 78, 48);
		frame.getContentPane().add(btnPlus);

		this.btnSolution = new JButton("=");
		btnSolution.setForeground(UIManager.getColor("Button.highlight"));
		btnSolution.setBackground(Color.DARK_GRAY);
		btnSolution.setFont(new Font("Monospaced", Font.PLAIN, 18));
		btnSolution.setBounds(244, 397, 78, 48);
		frame.getContentPane().add(btnSolution);

		this.btnMc = new JButton("MC");
		btnMc.setBorder(null);
		btnMc.setForeground(UIManager.getColor("Button.highlight"));
		btnMc.setBackground(Color.DARK_GRAY);
		btnMc.setFont(new Font("Monospaced", Font.PLAIN, 12));
		btnMc.setBounds(4, 107, 51, 34);
		frame.getContentPane().add(btnMc);

		this.btnMR = new JButton("MR");
		btnMR.setBorder(null);
		btnMR.setForeground(UIManager.getColor("Button.highlight"));
		btnMR.setBackground(Color.DARK_GRAY);
		btnMR.setFont(new Font("Monospaced", Font.PLAIN, 12));
		btnMR.setBounds(57, 107, 51, 34);
		frame.getContentPane().add(btnMR);

		this.btnMplus = new JButton("M+");
		btnMplus.setBorder(null);
		btnMplus.setForeground(UIManager.getColor("Button.highlight"));
		btnMplus.setBackground(Color.DARK_GRAY);
		btnMplus.setFont(new Font("Monospaced", Font.PLAIN, 12));
		btnMplus.setBounds(110, 107, 52, 34);
		frame.getContentPane().add(btnMplus);

		this.btnMminus = new JButton("M-");
		btnMminus.setBorder(null);
		btnMminus.setFont(new Font("Monospaced", Font.PLAIN, 12));
		btnMminus.setForeground(UIManager.getColor("Button.highlight"));
		btnMminus.setBackground(Color.DARK_GRAY);

		btnMminus.setBounds(164, 107, 52, 34);
		frame.getContentPane().add(btnMminus);

		this.btnMS = new JButton("MS");
		btnMS.setBorder(null);
		btnMS.setFont(new Font("Monospaced", Font.PLAIN, 12));
		btnMS.setForeground(UIManager.getColor("Button.highlight"));
		btnMS.setBackground(Color.DARK_GRAY);
		btnMS.setBounds(218, 107, 52, 34);
		frame.getContentPane().add(btnMS);

		this.btnMSpeicher = new JButton("M-");
		btnMSpeicher.setBorder(null);
		btnMSpeicher.setForeground(Color.WHITE);
		btnMSpeicher.setFont(new Font("Monospaced", Font.PLAIN, 12));
		btnMSpeicher.setBackground(Color.DARK_GRAY);
		btnMSpeicher.setBounds(272, 107, 50, 34);
		frame.getContentPane().add(btnMSpeicher);

		this.txfAdditionalCalculation = new JTextField();
		txfAdditionalCalculation.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txfAdditionalCalculation.setBorder(null);
		txfAdditionalCalculation.setForeground(Color.WHITE);
		txfAdditionalCalculation.setBackground(Color.DARK_GRAY);
		txfAdditionalCalculation.setHorizontalAlignment(JTextField.RIGHT);
		txfAdditionalCalculation.setBounds(4, 9, 292, 34);
		frame.getContentPane().add(txfAdditionalCalculation);
		txfAdditionalCalculation.setColumns(10);

		this.txfSolution = new JTextField();
		txfSolution.setBorder(null);
		txfSolution.setFont(new Font("Monospaced", Font.BOLD, 47));
		txfSolution.setForeground(Color.WHITE);
		txfSolution.setBackground(Color.DARK_GRAY);
		txfSolution.setText("");
		txfSolution.setHorizontalAlignment(JTextField.RIGHT);
		txfSolution.setBounds(4, 33, 306, 63);
		frame.getContentPane().add(txfSolution);
		txfSolution.setColumns(10);

		this.menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setBackground(Color.DARK_GRAY);
		frame.setJMenuBar(menuBar);

		this.mnNewMenu = new JMenu("Standardansicht");
		mnNewMenu.setForeground(UIManager.getColor("Button.highlight"));
		mnNewMenu.setFont(new Font("Monospaced", Font.PLAIN, 12));
		menuBar.add(mnNewMenu);

		this.mniProgrammer = new JMenuItem("Programmierer");
		mnNewMenu.add(mniProgrammer);

		this.mniAcademic = new JMenuItem("Wissenschaftlich");
		mnNewMenu.add(mniAcademic);
		
		this.mniBeenden = new JMenuItem ("Beenden");
		mnNewMenu.add(mniBeenden);	
	}
	
	private void setFont() {}
	
	private void setColour() {}
	
	private void setBounds() {}
	
	/**
	 * Initialize the events of the frame.
	 */
	private void initaliseEvents(){
		
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txfSolution.setText(txfSolution.getText() + "0");
			}
		});

		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txfSolution.setText(txfSolution.getText() + "1");
			}
		});

		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txfSolution.setText(txfSolution.getText() + "2");
			}
		});

		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txfSolution.setText(txfSolution.getText() + "3");
			}
		});

		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txfSolution.setText(txfSolution.getText() + "4");
			}
		});

		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txfSolution.setText(txfSolution.getText() + "5");
			}
		});

		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txfSolution.setText(txfSolution.getText() + "6");
			}
		});

		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txfSolution.setText(txfSolution.getText() + "7");
			}
		});

		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txfSolution.setText(txfSolution.getText() + "8");
			}
		});

		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txfSolution.setText(txfSolution.getText() + "9");
			}
		});

		btnChangeSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Wenn das vorzeichen Negativ ist Positv machen und umgekehrt
				if (true) {
					
				}
			}
		});

		btnKomma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Komma einfügen
				
			}
		});

		btnSolution.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Ergebnis Berechnen
			}
		});

		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//addieren
				txfAdditionalCalculation.setText(txfSolution.getText() + "+");
			}
		});

		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Subtrahieren
			}
		});

		btnMultiplicate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Multiplizieren
			}
		});

		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//teilen
			}
		});

		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//%
			}
		});

		btnOneDividadeBy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 1 geteilt durch die Benutzereingabe
				double DisplayValue;
				DisplayValue = Double.parseDouble(txfSolution.getText());	
				DisplayValue = 1 / DisplayValue;
				txfSolution.setText(Double.toString(DisplayValue));
			}
		});

		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnSqare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Wurzelfuktion
			}
		});

		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txfSolution.setText("");
				
			}
		});

		btnQuadratwurzel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Quadratwurzel
			}
		});
	}
	//Getter & Setter
	
	public JTextField getTxfAdditionalCalculation() {
		return txfAdditionalCalculation;
	}

	public void setTxfAdditionalCalculation(JTextField txfAdditionalCalculation) {
		this.txfAdditionalCalculation = txfAdditionalCalculation;
	}

	public JTextField getTxfSolution() {
		return txfSolution;
	}

	public void setTxfSolution(JTextField txfSolution) {
		this.txfSolution = txfSolution;
	}
	
	public JMenuItem getmniProgrammer() {
		return mniProgrammer;
	}
	
	public JMenuItem getmniAcademic() {		
		return mniAcademic;
	}
	
	public JMenuItem getmniBeenden() {
		return mniBeenden;
	}

	public JButton getBtn0() {
		return btn0;
	}

	public JButton getBtn1() {
		return btn1;
	}

	public JButton getBtn2() {
		return btn2;
	}

	public JButton getBtn3() {
		return btn3;
	}

	public JButton getBtn4() {
		return btn4;
	}

	public JButton getBtn5() {
		return btn5;
	}

	public JButton getBtn6() {
		return btn6;
	}

	public JButton getBtn7() {
		return btn7;
	}

	public JButton getBtn8() {
		return btn8;
	}

	public JButton getBtn9() {
		return btn9;
	}

	public JButton getBtnChangeSign() {
		return btnChangeSign;
	}

	public JButton getBtnPercent() {
		return btnPercent;
	}

	public JButton getBtnOneDividadeBy() {
		return btnOneDividadeBy;
	}

	public JButton getBtnC() {
		return btnC;
	}

	public JButton getBtnCE() {
		return btnCE;
	}

	public JButton getBtnDelete() {
		return btnDelete;
	}

	public JButton getBtnMinus() {
		return btnMinus;
	}

	public JButton getBtnPlus() {
		return btnPlus;
	}

	public JButton getBtnKomma() {
		return btnKomma;
	}

	public JButton getBtnDivision() {
		return btnDivision;
	}

	public JButton getBtnMultiplicate() {
		return btnMultiplicate;
	}

	public JButton getBtnQuadratwurzel() {
		return btnQuadratwurzel;
	}

	public JButton getBtnSqare() {
		return btnSqare;
	}

	public JButton getBtnMminus() {
		return btnMminus;
	}

	public JButton getBtnMplus() {
		return btnMplus;
	}

	public JButton getBtnMS() {
		return btnMS;
	}

	public JButton getBtnMR() {
		return btnMR;
	}

	public JButton getBtnMc() {
		return btnMc;
	}

	public JButton getBtnMSpeicher() {
		return btnMSpeicher;
	}

	public JButton getBtnSolution() {
		return btnSolution;
	}
}
