package com.jacobarchambault.lab2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 * This program demonstrates a solution to the Long Distance Calls programming
 * challenge.
 */
public class Ch17Lab2 extends JFrame {
	/**
	 * CalcButtonListener is an action listener class for the calcButton component.
	 */
	private class CalcButtonListener implements ActionListener {
		/**
		 * actionPerformed method
		 * 
		 * @param e An ActionEvent object.
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			double assessmentValue; 
			// Get the applicable rate.
			// Get the total charges
			assessmentValue = propertyTaxPanel.getCharges();
			double propertyTax = assessmentValue * .0064;
			// Display the message.
			JOptionPane.showMessageDialog(null, String.format("Assessment Value: $%,.2f\nProperty tax: $%,.2f", assessmentValue, propertyTax));
		}
	} // End of inner class

	/**
	 * ExitButtonListener is an action listener class for the exitButton component.
	 */
	private class ExitButtonListener implements ActionListener {
		/**
		 * actionPerformed method
		 * 
		 * @param e An ActionEvent object.
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	} // End of inner class

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new Ch17Lab2();

	}

	private JPanel buttonPanel; // A panel for the buttons
	private JButton calcButton; // Calculates everything

	private JButton exitButton; // Exits the application

	private PropertyTaxPanel propertyTaxPanel; // A panel for minutes


	/**
	 * Constructor
	 */
	public Ch17Lab2() {
		// Display a title.
		setTitle("Property taxes");
		// Specify what happens when the close button is clicked.
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		// Create a MinutesPanel object.
		propertyTaxPanel = new PropertyTaxPanel();
		// Build the panel that contains the buttons.
		buildButtonPanel();
		// Add the panels to the content pane.
		add(propertyTaxPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		// Pack and display the window.
		pack();
		setVisible(true);
	}

	/**
	 * The buildButtonPanel method creates a panel containing buttons.
	 */
	private void buildButtonPanel() {
		// Create a button to calculate the charges.
		calcButton = new JButton("Calculate Property tax");
		// Add an action listener to the button.
		calcButton.addActionListener(new CalcButtonListener());
		// Create a button to exit the application.
		exitButton = new JButton("Exit");
		// Add an action listener to the button.
		exitButton.addActionListener(new ExitButtonListener());
		// Put the buttons in their own panel.
		buttonPanel = new JPanel();
		buttonPanel.add(calcButton);
		buttonPanel.add(exitButton);
	}

}
