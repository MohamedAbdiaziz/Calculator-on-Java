package Mohamed_Abdiaziz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Frame;
import java.awt.Window;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import java.awt.ComponentOrientation;
import javax.swing.DropMode;
import java.util.Locale;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
/**
 * @author Mohamed Abdiaziz
 *
 */
public class Testing1 {

	private JFrame frmCalculator;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private JButton btnNewButton_16;
	private JButton btnNewButton_17;
	
	double num1, num2, result;
	char operator;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Testing1 window = new Testing1();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Testing1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setResizable(false);
		frmCalculator.setLocale(new Locale("so", "SO"));
		frmCalculator.setExtendedState(Frame.MAXIMIZED_VERT);
		frmCalculator.setAlwaysOnTop(true);
		frmCalculator.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		frmCalculator.getContentPane().setSize(new Dimension(1362, 2146));
		frmCalculator.getContentPane().setLayout(null);
		//frmCalculator.setLocation(150,50);
		
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBackground(UIManager.getColor("Button.background"));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 58, 306, 60);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setFont(new Font("Segoe UI Variable", Font.PLAIN, 32));
		
		btnNewButton = new JButton("7");
		btnNewButton.setFont(new Font("Segoe UI Variable", Font.PLAIN, 32));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat(String.valueOf(7)));
			}
		});
		btnNewButton.setBounds(10, 147, 69, 52);
		frmCalculator.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat(String.valueOf(8)));
			}
		});
		btnNewButton_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 32));
		btnNewButton_1.setBounds(89, 147, 69, 52);
		frmCalculator.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat(String.valueOf(9)));
			}
		});
		btnNewButton_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 32));
		btnNewButton_2.setBounds(168, 147, 69, 52);
		frmCalculator.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 =num1 + Double.parseDouble(textField.getText());
				textField_1.setText(String.valueOf(num1)+"/");
				operator = '/';
				textField.setText("");
			}
		});
		btnNewButton_3.setFont(new Font("Segoe UI Variable", Font.PLAIN, 32));
		btnNewButton_3.setBounds(247, 147, 69, 52);
		frmCalculator.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat(String.valueOf(4)));
			}
		});
		btnNewButton_4.setFont(new Font("Segoe UI Variable", Font.PLAIN, 32));
		btnNewButton_4.setBounds(10, 210, 69, 52);
		frmCalculator.getContentPane().add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat(String.valueOf(5)));
			}
		});
		btnNewButton_5.setFont(new Font("Segoe UI Variable", Font.PLAIN, 32));
		btnNewButton_5.setBounds(89, 210, 69, 52);
		frmCalculator.getContentPane().add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat(String.valueOf(6)));
			}
		});
		btnNewButton_6.setFont(new Font("Segoe UI Variable", Font.PLAIN, 32));
		btnNewButton_6.setBounds(168, 210, 69, 52);
		frmCalculator.getContentPane().add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("X");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = num1 + Double.parseDouble(textField.getText());
				textField_1.setText(String.valueOf(num1)+"*");
				operator = '*';
				textField.setText("");
			}
		});
		btnNewButton_7.setFont(new Font("Segoe UI Variable", Font.PLAIN, 32));
		btnNewButton_7.setBounds(247, 210, 69, 52);
		frmCalculator.getContentPane().add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("1");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat(String.valueOf(1)));
			}
		});
		btnNewButton_8.setFont(new Font("Segoe UI Variable", Font.PLAIN, 32));
		btnNewButton_8.setBounds(10, 273, 69, 52);
		frmCalculator.getContentPane().add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("2");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat(String.valueOf(2)));
			}
		});
		btnNewButton_9.setFont(new Font("Segoe UI Variable", Font.PLAIN, 32));
		btnNewButton_9.setBounds(89, 273, 69, 52);
		frmCalculator.getContentPane().add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("3");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat(String.valueOf(3)));
			}
		});
		btnNewButton_10.setFont(new Font("Segoe UI Variable", Font.PLAIN, 32));
		btnNewButton_10.setBounds(168, 273, 69, 52);
		frmCalculator.getContentPane().add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("-");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = num1 + Double.parseDouble(textField.getText());
				textField_1.setText(String.valueOf(num1)+"-");
				operator = '-';
				textField.setText("");
			}
		});
		btnNewButton_11.setFont(new Font("Segoe UI Variable", Font.PLAIN, 32));
		btnNewButton_11.setBounds(247, 273, 69, 52);
		frmCalculator.getContentPane().add(btnNewButton_11);
		
		btnNewButton_12 = new JButton(".");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat("."));
			}
		});
		btnNewButton_12.setFont(new Font("Segoe UI Variable", Font.PLAIN, 32));
		btnNewButton_12.setBounds(10, 336, 69, 52);
		frmCalculator.getContentPane().add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("0");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat(String.valueOf(0)));
			}
		});
		btnNewButton_13.setFont(new Font("Segoe UI Variable", Font.PLAIN, 32));
		btnNewButton_13.setBounds(89, 336, 69, 52);
		frmCalculator.getContentPane().add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("=");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = Double.parseDouble(textField.getText());
				switch (operator) {
				case '+':
					result = num1 + num2;
					break;
				case '-':
					result = num1 - num2;
					break;
				case '*':
					result = num1 * num2;
					break;
				case '/':
					result = num1 / num2;
					break;
				}
				num1 = 0.0;
				num2 = 0.0;
				textField_1.setText(String.valueOf(result));
				textField.setText(String.valueOf(result));
				
			}
		});
		btnNewButton_14.setForeground(new Color(255, 255, 255));
		btnNewButton_14.setBackground(new Color(51, 153, 204));
		btnNewButton_14.setFont(new Font("Segoe UI Variable", Font.PLAIN, 32));
		btnNewButton_14.setBounds(168, 336, 69, 52);
		frmCalculator.getContentPane().add(btnNewButton_14);
		
		btnNewButton_15 = new JButton("+");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = num1 + Double.parseDouble(textField.getText());
				textField_1.setText(String.valueOf(num1)+"+");
				operator = '+';
				textField.setText("");
			}
		});
		btnNewButton_15.setFont(new Font("Segoe UI Variable", Font.PLAIN, 32));
		btnNewButton_15.setBounds(247, 336, 69, 52);
		frmCalculator.getContentPane().add(btnNewButton_15);
		
		btnNewButton_16 = new JButton("Delete");
		btnNewButton_16.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String string = textField.getText();
				textField.setText("");
				for(int i=0;i<string.length()-1;i++) {
					textField.setText(textField.getText()+string.charAt(i));
				}
			}
		});
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string = textField.getText();
				textField.setText("");
				for(int i=0;i<string.length()-1;i++) {
					textField.setText(textField.getText()+string.charAt(i));
				}
			}
		});
		btnNewButton_16.setFont(new Font("Segoe UI Variable", Font.PLAIN, 22));
		btnNewButton_16.setBounds(10, 399, 147, 48);
		frmCalculator.getContentPane().add(btnNewButton_16);
		
		btnNewButton_17 = new JButton("Clear");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				num1 = 0;
				num2 = 0;
				result = 0;
				
				
			}
		});
		btnNewButton_17.setBackground(new Color(255, 51, 51));
		btnNewButton_17.setForeground(new Color(255, 255, 255));
		btnNewButton_17.setFont(new Font("Segoe UI Variable", Font.PLAIN, 22));
		btnNewButton_17.setBounds(168, 399, 147, 48);
		frmCalculator.getContentPane().add(btnNewButton_17);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBorder(null);
		textField_1.setBackground(UIManager.getColor("Button.background"));
		textField_1.setHorizontalAlignment(SwingConstants.TRAILING);
		textField_1.setBounds(10, 27, 306, 20);
		frmCalculator.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		frmCalculator.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frmCalculator.setTitle("calculator 1");
		frmCalculator.setBounds(100, 100, 343, 497);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
