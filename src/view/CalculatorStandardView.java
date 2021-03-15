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

import controller.MenuController;
import controller.MemoryController;
import controller.NumericButtonController;
import controller.OperationController;

public class CalculatorStandardView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//View knows the differnt controllers
	private MenuController menuController;
	private NumericButtonController numericBtnController;
	private OperationController operationController;
	private MemoryController memoryController;
	
	//Declaration of the Menubar, Menu and Menuitems.
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mniProgrammer;
	private JMenuItem mniAcademic;
	private JMenuItem mniExit;
	
	//Declaration of the font
	Font fontBtnNumber = new Font("Cambria Math", Font.BOLD, 19);
	Font fontBtnOperator = new Font("Monospaced",Font.BOLD, 18);
	Font fontMemory = new Font ("Cambria Math", Font.BOLD, 12);
	Font fontMenubar = new Font("Monospaced",Font.PLAIN, 12);
	
	/*Declaration of the Components
	* Declaration of the Buttons
	*/
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
	private JButton btnOneDivideBy;
	private JButton btnC;
	private JButton btnCE;
	private JButton btnBackspace;
	private JButton btnMinus;
	private JButton btnPlus;
	private JButton btnDot;
	private JButton btnDivide;
	private JButton btnMultiply;
	private JButton btnSquareRoot;
	private JButton btnPotencyQuadrat;
	private JButton btnMemoryMinus;
	private JButton btnMemoryPlus;
	private JButton btnMemoryS;
	private JButton btnMemoryR;
	private JButton btnMemoryC;
	private JButton btnMemory;
	private JButton btnResult;
	//Declaration of the JTextField
	private JTextField txfAdditionalDisplay;
	private JTextField txfResult;
	
	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorStandardView window = new CalculatorStandardView();
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
	public CalculatorStandardView() {
		super("Rechner");
		initializeComponents();
		this.menuController = new MenuController(this);
		this.numericBtnController = new NumericButtonController(this);
		this.memoryController = new MemoryController(this);
		this.operationController = new OperationController(this);
		addActionListeners();
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

		this.btnOneDivideBy = new JButton("1/x");
		btnOneDivideBy.setForeground(UIManager.getColor("Button.highlight"));
		btnOneDivideBy.setBackground(Color.DARK_GRAY);
		btnOneDivideBy.setFont(new Font("Monospaced", Font.PLAIN, 18));
		btnOneDivideBy.setBounds(4, 197, 78, 48);
		frame.getContentPane().add(btnOneDivideBy);

		this.btnCE = new JButton("CE");
		btnCE.setForeground(UIManager.getColor("Button.highlight"));
		btnCE.setBackground(Color.DARK_GRAY);
		btnCE.setFont(new Font("Monospaced", Font.PLAIN, 18));
		btnCE.setBounds(84, 147, 78, 48);
		frame.getContentPane().add(btnCE);

		this.btnPotencyQuadrat = new JButton("x²");
		btnPotencyQuadrat.setForeground(UIManager.getColor("Button.highlight"));
		btnPotencyQuadrat.setBackground(Color.DARK_GRAY);
		btnPotencyQuadrat.setFont(new Font("Monospaced", Font.PLAIN, 18));
		btnPotencyQuadrat.setBounds(84, 197, 78, 48);
		frame.getContentPane().add(btnPotencyQuadrat);

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

		this.btnSquareRoot = new JButton("√");
		btnSquareRoot.setForeground(UIManager.getColor("Button.highlight"));
		btnSquareRoot.setBackground(Color.DARK_GRAY);
		btnSquareRoot.setFont(new Font("Monospaced", Font.PLAIN, 18));
		btnSquareRoot.setBounds(164, 197, 78, 48);
		frame.getContentPane().add(btnSquareRoot);

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

		this.btnDot = new JButton(",");
		btnDot.setForeground(UIManager.getColor("Button.highlight"));
		btnDot.setBackground(Color.DARK_GRAY);
		btnDot.setFont(new Font("Monospaced", Font.BOLD, 19));
		btnDot.setBounds(164, 397, 78, 48);
		frame.getContentPane().add(btnDot);

		this.btnBackspace = new JButton("<-");
		btnBackspace.setForeground(UIManager.getColor("Button.highlight"));
		btnBackspace.setBackground(Color.DARK_GRAY);
		btnBackspace.setFont(new Font("Monospaced", Font.PLAIN, 18));
		btnBackspace.setBounds(244, 147, 78, 48);
		frame.getContentPane().add(btnBackspace);

		this.btnDivide = new JButton("/");
		btnDivide.setForeground(UIManager.getColor("Button.highlight"));
		btnDivide.setBackground(Color.DARK_GRAY);
		btnDivide.setFont(new Font("Monospaced", Font.PLAIN, 18));
		btnDivide.setBounds(244, 197, 78, 48);
		frame.getContentPane().add(btnDivide);

		this.btnMultiply = new JButton("x");
		btnMultiply.setForeground(UIManager.getColor("Button.highlight"));
		btnMultiply.setBackground(Color.DARK_GRAY);
		btnMultiply.setFont(new Font("Monospaced", Font.PLAIN, 18));
		btnMultiply.setBounds(244, 247, 78, 48);
		frame.getContentPane().add(btnMultiply);

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

		this.btnResult = new JButton("=");
		btnResult.setForeground(UIManager.getColor("Button.highlight"));
		btnResult.setBackground(Color.DARK_GRAY);
		btnResult.setFont(new Font("Monospaced", Font.PLAIN, 18));
		btnResult.setBounds(244, 397, 78, 48);
		frame.getContentPane().add(btnResult);

		this.btnMemoryC = new JButton("MC");
		btnMemoryC.setBorder(null);
		btnMemoryC.setForeground(UIManager.getColor("Button.highlight"));
		btnMemoryC.setBackground(Color.DARK_GRAY);
		btnMemoryC.setFont(new Font("Monospaced", Font.PLAIN, 12));
		btnMemoryC.setBounds(4, 107, 51, 34);
		frame.getContentPane().add(btnMemoryC);

		this.btnMemoryR = new JButton("MR");
		btnMemoryR.setBorder(null);
		btnMemoryR.setForeground(UIManager.getColor("Button.highlight"));
		btnMemoryR.setBackground(Color.DARK_GRAY);
		btnMemoryR.setFont(new Font("Monospaced", Font.PLAIN, 12));
		btnMemoryR.setBounds(57, 107, 51, 34);
		frame.getContentPane().add(btnMemoryR);

		this.btnMemoryPlus = new JButton("M+");
		btnMemoryPlus.setBorder(null);
		btnMemoryPlus.setForeground(UIManager.getColor("Button.highlight"));
		btnMemoryPlus.setBackground(Color.DARK_GRAY);
		btnMemoryPlus.setFont(new Font("Monospaced", Font.PLAIN, 12));
		btnMemoryPlus.setBounds(110, 107, 52, 34);
		frame.getContentPane().add(btnMemoryPlus);

		this.btnMemoryMinus = new JButton("M-");
		btnMemoryMinus.setBorder(null);
		btnMemoryMinus.setFont(new Font("Monospaced", Font.PLAIN, 12));
		btnMemoryMinus.setForeground(UIManager.getColor("Button.highlight"));
		btnMemoryMinus.setBackground(Color.DARK_GRAY);

		btnMemoryMinus.setBounds(164, 107, 52, 34);
		frame.getContentPane().add(btnMemoryMinus);

		this.btnMemoryS = new JButton("MS");
		btnMemoryS.setBorder(null);
		btnMemoryS.setFont(new Font("Monospaced", Font.PLAIN, 12));
		btnMemoryS.setForeground(UIManager.getColor("Button.highlight"));
		btnMemoryS.setBackground(Color.DARK_GRAY);
		btnMemoryS.setBounds(218, 107, 52, 34);
		frame.getContentPane().add(btnMemoryS);

		this.btnMemory = new JButton("M-");
		btnMemory.setBorder(null);
		btnMemory.setForeground(Color.WHITE);
		btnMemory.setFont(new Font("Monospaced", Font.PLAIN, 12));
		btnMemory.setBackground(Color.DARK_GRAY);
		btnMemory.setBounds(272, 107, 50, 34);
		frame.getContentPane().add(btnMemory);

		this.txfAdditionalDisplay = new JTextField();
		txfAdditionalDisplay.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txfAdditionalDisplay.setBorder(null);
		txfAdditionalDisplay.setForeground(Color.WHITE);
		txfAdditionalDisplay.setBackground(Color.DARK_GRAY);
		txfAdditionalDisplay.setHorizontalAlignment(JTextField.RIGHT);
		txfAdditionalDisplay.setBounds(4, 9, 292, 34);
		frame.getContentPane().add(txfAdditionalDisplay);
		txfAdditionalDisplay.setColumns(10);

		this.txfResult = new JTextField();
		txfResult.setBorder(null);
		txfResult.setFont(new Font("Monospaced", Font.BOLD, 47));
		txfResult.setForeground(Color.WHITE);
		txfResult.setBackground(Color.DARK_GRAY);
		txfResult.setText("");
		txfResult.setHorizontalAlignment(JTextField.RIGHT);
		txfResult.setBounds(4, 33, 306, 63);
		frame.getContentPane().add(txfResult);
		txfResult.setColumns(10);

		this.menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setBackground(Color.DARK_GRAY);
		frame.setJMenuBar(menuBar);

		this.mnNewMenu = new JMenu("Standardansicht");
		mnNewMenu.setForeground(UIManager.getColor("Button.highlight"));
		mnNewMenu.setFont(fontMenubar);
		menuBar.add(mnNewMenu);

		this.mniProgrammer = new JMenuItem("Programmierer");
		this.mniProgrammer.setFont(fontMenubar);
		mnNewMenu.add(mniProgrammer);

		this.mniAcademic = new JMenuItem("Wissenschaftlich");
		mnNewMenu.add(mniAcademic);
		this.mniAcademic.setFont(fontMenubar);
		
		this.mniExit = new JMenuItem ("Beenden");
		mnNewMenu.add(mniExit);	
		this.mniExit.setFont(fontMenubar);
	}
	


	/**
	 * Add the ActionListener for all components of the frame.
	 */
	private void addActionListeners(){
		//Add the ActionListener for the MenuItems
		mniProgrammer.addActionListener(menuController);
		mniAcademic.addActionListener(menuController);
		mniExit.addActionListener(menuController);
		//Add the ActionListener for the numeric Buttons
		btn0.addActionListener(numericBtnController);
		btn1.addActionListener(numericBtnController);
		btn2.addActionListener(numericBtnController);
		btn3.addActionListener(numericBtnController);
		btn4.addActionListener(numericBtnController);
		btn5.addActionListener(numericBtnController);
		btn6.addActionListener(numericBtnController);
		btn7.addActionListener(numericBtnController);
		btn8.addActionListener(numericBtnController);
		btn9.addActionListener(numericBtnController);
		//add the ActionListener for all operators
		btnPlus.addActionListener(operationController);
		btnMinus.addActionListener(operationController);
		btnDivide.addActionListener(operationController);
		btnMultiply.addActionListener(operationController);
		btnOneDivideBy.addActionListener(operationController);
		btnPotencyQuadrat.addActionListener(operationController);
		btnPercent.addActionListener(operationController);
		btnChangeSign.addActionListener(operationController);
		btnBackspace.addActionListener(operationController);
		btnC.addActionListener(operationController);
		btnCE.addActionListener(operationController);
		btnDot.addActionListener(operationController);
		btnResult.addActionListener(operationController);
		//add the Action Listener for the memory Buttons
		btnMemory.addActionListener(memoryController);
		btnMemoryC.addActionListener(memoryController);
		btnMemoryS.addActionListener(memoryController);
		btnMemoryR.addActionListener(memoryController);
		btnMemoryMinus.addActionListener(memoryController);
		btnMemoryPlus.addActionListener(memoryController);
	}
	//Getter & Setter
	public JTextField getTxfAdditionalCalculation() {
		return txfAdditionalDisplay;
	}

	public void setTxfAdditionalCalculation(JTextField txfAdditionalCalculation) {
		this.txfAdditionalDisplay = txfAdditionalCalculation;
	}

	public JTextField getTxfSolution() {
		return txfResult;
	}

	public void setTxfSolution(JTextField txfSolution) {
		this.txfResult = txfSolution;
	}
	
	public JMenuItem getmniProgrammer() {
		return mniProgrammer;
	}
	
	public JMenuItem getmniAcademic() {		
		return mniAcademic;
	}
	
	public JMenuItem getmniBeenden() {
		return mniExit;
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

	public JButton getBtnOneDivideBy() {
		return btnOneDivideBy;
	}

	public JButton getBtnC() {
		return btnC;
	}

	public JButton getBtnCE() {
		return btnCE;
	}

	public JButton getBtnDelete() {
		return btnBackspace;
	}

	public JButton getBtnMinus() {
		return btnMinus;
	}

	public JButton getBtnPlus() {
		return btnPlus;
	}

	public JButton getBtnDot() {
		return btnDot;
	}

	public JButton getBtnDivide() {
		return btnDivide;
	}

	public JButton getBtnMultiply() {
		return btnMultiply;
	}

	public JButton getBtnSquareRoot() {
		return btnSquareRoot;
	}

	public JButton getBtnPotencySqare() {
		return btnPotencyQuadrat;
	}

	public JButton getMemoryMinus() {
		return btnMemoryMinus;
	}

	public JButton getBtnMemoryPlus() {
		return btnMemoryPlus;
	}

	public JButton getBtnMemoryS() {
		return btnMemoryS;
	}

	public JButton getBtnMemoryR() {
		return btnMemoryR;
	}

	public JButton getBtnMemoryc() {
		return btnMemoryC;
	}

	public JButton getBtnMemory() {
		return btnMemory;
	}

	public JButton getBtnResult() {
		return btnResult;
	}
}