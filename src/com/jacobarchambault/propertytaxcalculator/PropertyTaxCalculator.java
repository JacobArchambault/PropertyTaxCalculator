package com.jacobarchambault.propertytaxcalculator;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class PropertyTaxCalculator extends JFrame {
	private static final long serialVersionUID = 1L;

	private PropertyTaxPanel propertyTaxPanel; // A panel for displaying assessmentValue and tax

	/**
	 * Constructor
	 */
	public PropertyTaxCalculator(
			String title) {
		super(
				title);
		// Specify what happens when the close button is clicked.
		setDefaultCloseOperation(
				WindowConstants.EXIT_ON_CLOSE);
		// Create a PropertyTaxPanel object.
		propertyTaxPanel = new PropertyTaxPanel();
		// Add the panels to the content pane.
		add(
				propertyTaxPanel,
				BorderLayout.CENTER);
		// Pack and display the window.
		pack();
		setVisible(
				true);
	}
}
