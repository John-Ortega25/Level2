package org.jointheleague.level2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	ArrayList<String> namesOfGuest = new ArrayList<>();

	public void createUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
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

	public String buildDisplayString(ArrayList<String> list) {
		String display=" ";
		for (int i = 0; i < namesOfGuest.size(); i++) {
			int j= i+1;
		display = display+"Guest "+ j+": " +	namesOfGuest.get(i)+"\n";
		}
		
		
		return display;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == button1) {
			String newName = JOptionPane.showInputDialog("Enter guest name please");
			namesOfGuest.add(newName);

		}
		if (buttonPressed == button2) {
			JOptionPane.showMessageDialog(null, buildDisplayString(namesOfGuest));
		}
	}

	public static void main(String[] args) {
		GuestBook list = new GuestBook();
		list.createUI();

		// Create a GUI with two buttons named Add name and View names
		// When Add name button is clicked add a dialog to enter name
		// Add that name to the array list
		// When the view name button is clicked display a message dialog of the names
		// formatted like: Guest 1: Isis etc
	}
}
