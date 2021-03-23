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
	private JTextField propertyValue = new JTextField(
			10); // To get property value
	JButton calcButton = new JButton(
			"Calculate Property tax");

	/**
	 * Constructor
	 */
	public PropertyTaxPanel() {
		// Create a text field.
		// Create a GridLayout manager.
		setLayout(
				new GridLayout(
						3,
						1));
		// Add the labels and text fields to this panel.
		add(
				new JLabel(
						"Enter the actual property value:"));
		add(
				propertyValue);
		calcButton.addActionListener(
				e -> showPropertyTax());
		// Put the button in its own panel.
		add(
				calcButton,
				BorderLayout.CENTER);
	}

	public void showPropertyTax() {
		double assessmentValue = Double.parseDouble(
				propertyValue.getText()) * .6;
		JOptionPane.showMessageDialog(
				null,
				String.format(
						"Assessment Value: $%,.2f\nProperty tax: $%,.2f",
						assessmentValue,
						assessmentValue * .0064));
	}

}
