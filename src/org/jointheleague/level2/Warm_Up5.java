package org.jointheleague.level2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Warm_Up5 implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton nameButton = new JButton();
	JButton listButton = new JButton();
	ArrayList<String> names = new ArrayList<>();

	public void setUp() {
		frame.add(panel);
		frame.setSize(100, 100);
		panel.add(nameButton);
		panel.add(listButton);
		frame.setVisible(true);
		panel.setVisible(true);
		nameButton.setText("Enter Name");
		listButton.setText("See List");
		nameButton.addActionListener(this);
		listButton.addActionListener(this);
		frame.pack();
	}

	public static void main(String[] args) {
		Warm_Up5 test = new Warm_Up5();
		test.setUp();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == nameButton) {
			String newName = JOptionPane.showInputDialog("");
			names.add(newName);
		} else if (buttonPressed == listButton) {
			for (int i = 0; i < names.size(); i++) {
				if (i < names.size() - 1) {
					System.out.print("" + names.get(i) + ", ");
				} else {
					System.out.print("" + names.get(i));
				}
			}

		}
	}
}
