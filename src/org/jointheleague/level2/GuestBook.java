package org.jointheleague.level2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JButton button1= new JButton();
	JButton button2= new JButton();
	public void createUI() {
		JFrame frame= new JFrame();
		JPanel panel= new JPanel();
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		button1.setText("Add name");
		button2.setText("View name");
		frame.setVisible(true);
		button1.addActionListener(this);
		button2.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed= (JButton) e.getSource();
		if (buttonPressed== button1) {
			String newName= JOptionPane.showInputDialog("Enter new name please");
		}
	}
	public static void main(String[] args) {
		//Create a GUI with two buttons named Add name and View names
		//When Add name button is clicked add a dialog to enter name 
		//Add that name to the array list
		//WHen the view name button is clicked display a message dialog of the names formatted like: Guest#1: Isis etc
	}
}
