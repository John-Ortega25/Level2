package org.jointheleague.level2.LeagueBreakout;

import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueBreakout {
	JFrame frame;
	public static final int HEIGHT = 500;
	public static final int WIDTH = 500;
	GamePanel gamePanel = new GamePanel();

	public LeagueBreakout() {
		frame = new JFrame();
	}

	public void setUp() {
		frame.add(gamePanel);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.addKeyListener(gamePanel);
		frame.pack();
		gamePanel.startGame();

	}

	public static void main(String[] args) {
		LeagueBreakout game = new LeagueBreakout();
		game.setUp();
	}
}
