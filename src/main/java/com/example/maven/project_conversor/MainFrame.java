package com.example.maven.project_conversor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame {

	private JFrame frame;
	private JTextField textField;		
	private JLabel lblResult = new JLabel("Result:");
	private JTextField textField_1;
	private	JLabel lblEnterTheValue = new JLabel("Enter the value in degrees:");
	private	JLabel lblEnterTheValue_1 = new JLabel("Enter the value in radians:");
	private JButton btnToRadians = new JButton("To radians");
	private JButton btnToDegrees = new JButton("To degrees");


	ConversorDegreesRadians cdr = new ConversorDegreesRadians();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
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
	public MainFrame() {
		initialize();
		addComponentsToFrame();
		addActionListeners();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Properties for frame
		frame = new JFrame();
		frame.setBounds(100, 100, 288, 344);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Properties for label EnterTheValue
		lblEnterTheValue.setBounds(27, 35, 214, 15);
		//Properties for label EnterTheValue_1
		lblEnterTheValue_1.setBounds(27, 130, 214, 15);
		
		//Properties for label Result
		lblResult.setBounds(27, 228, 214, 15);
		
		//Properties for textField
		textField = new JTextField();
		textField.setBounds(27, 62, 220, 19);
		textField.setColumns(10);
		
		//Properties for textField_1
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(27, 157, 220, 19);
		
		//Properties for btnToRadians
		btnToRadians.setBounds(27, 255, 117, 25);
		
		//Properties for btnToDegrees
		btnToDegrees.setBounds(149, 255, 117, 25);
		
	}
	
	public void addComponentsToFrame() {
		frame.getContentPane().add(textField_1);
		frame.getContentPane().add(btnToRadians);
		frame.getContentPane().add(btnToDegrees);
		frame.getContentPane().add(lblResult);
		frame.getContentPane().add(textField);
		frame.getContentPane().add(lblEnterTheValue_1);
		frame.getContentPane().add(lblEnterTheValue);
	}
	
	public void addActionListeners() {
		btnToRadians.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cdr.degreesToRadian(Double.parseDouble(textField.getText()));
				lblResult.setText("Result: "+cdr.degreesToRadian(Double.parseDouble(textField.getText())));
			}
		});
		btnToDegrees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cdr.radiansToDegrees(Double.parseDouble(textField_1.getText()));
				lblResult.setText("Result: "+cdr.radiansToDegrees(Double.parseDouble(textField_1.getText())));
			}
		});
	}
}
