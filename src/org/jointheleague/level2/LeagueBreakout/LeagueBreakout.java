package org.jointheleague.level2.LeagueBreakout;

import java.awt.Component;

import javax.swing.JFrame;

public class LeagueBreakout {
	JFrame frame;
	static final int HEIGHT = 500;
	static final int WIDTH = 500;
	GamePanel gamePanel = new GamePanel();

	public LeagueBreakout() {
		frame = new JFrame();
	}

	public void setUp() {
		frame.add(gamePanel);
		frame.setVisible(true);
		// add more components
		// add another component
	}
	public static void main(String[] args) {
		LeagueBreakout game= new LeagueBreakout();
		game.setUp();
	}
}
