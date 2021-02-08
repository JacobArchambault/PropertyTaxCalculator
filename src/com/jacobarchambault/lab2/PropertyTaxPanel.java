package com.jacobarchambault.lab2;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * The MinutesPanel class for use with the Long Distance Calls programming
 * challenge.
 */
public class PropertyTaxPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField propertyValue; // To get minutes

	/**
	 * Constructor
	 */
	public PropertyTaxPanel() {
		// Create a label prompting the user and a text field.
		propertyValue = new JTextField(10);
		// Create a GridLayout manager.
		setLayout(new GridLayout(1, 2));
		// Add the labels and text fields to this panel.
		add(new JLabel("Enter the actual property value:"));
		add(propertyValue);
	}

	/**
	 * The getCharges method uses the specified rate to calculate the charges for
	 * the number of minutes entered.
	 * 
	 * @param rate The per-minute rate.
	 * @return The charges for the number of minutes used.
	 */
	public double getCharges(double rate) {
		double charges = Double.parseDouble(propertyValue.getText()) * .6;
		return charges;
	}
}
