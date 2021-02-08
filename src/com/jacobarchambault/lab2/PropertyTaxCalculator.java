package com.jacobarchambault.lab2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class PropertyTaxCalculator extends JFrame {
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
			propertyTaxPanel.showPropertyTax();
		}
	} // End of inner class


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new PropertyTaxCalculator();

	}

	private JPanel buttonPanel; // A panel for the buttons
	private JButton calcButton; // Calculates everything

	private PropertyTaxPanel propertyTaxPanel; // A panel for minutes


	/**
	 * Constructor
	 */
	public PropertyTaxCalculator() {
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
		// Put the buttons in their own panel.
		buttonPanel = new JPanel();
		buttonPanel.add(calcButton);
	}

}
