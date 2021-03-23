package com.jacobarchambault.propertytaxcalculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PropertyTaxPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField propertyValue; // To get property value

	/**
	 * Constructor
	 */
	public PropertyTaxPanel() {
		// Create a text field.
		propertyValue = new JTextField(
				10);
		// Create a GridLayout manager.
		setLayout(
				new GridLayout(
						2,
						2));
		// Add the labels and text fields to this panel.
		add(
				new JLabel(
						"Enter the actual property value:"));
		add(
				propertyValue);
		buildButtonPanel();
	}

	public void showPropertyTax() {
		// Get the assessmentValue.
		double assessmentValue = Double.parseDouble(
				propertyValue.getText()) * .6;
		// Get the property tax.
		double propertyTax = assessmentValue * .0064;
		// Display them.
		JOptionPane.showMessageDialog(
				null,
				String.format(
						"Assessment Value: $%,.2f\nProperty tax: $%,.2f",
						assessmentValue,
						propertyTax));
	}
	/**
	 * The buildButtonPanel method creates a panel containing the calc property tax
	 * button.
	 */
	private void buildButtonPanel() {
		// Create a button to calculate the property tax.
		JButton calcButton = new JButton(
				"Calculate Property tax");
		// Add an action listener to the button.
		calcButton.addActionListener(
				e -> showPropertyTax());
		// Put the button in its own panel.
		add(
				calcButton, BorderLayout.CENTER);

	}

}
