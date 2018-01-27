package org.jointheleague.level2.leagueInvaders;

import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	private final int HEIGHT= 800;
	private final int WIDTH= 500;
	GamePanel gamePanel= new GamePanel();
	
	public LeagueInvaders() {
		frame= new JFrame();
	}
	public void setUp() {
		frame.add(gamePanel);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.pack();
		gamePanel.startGame();

	}
	public static void main(String[] args) {
		LeagueInvaders game= new LeagueInvaders();
		game.setUp();
	}
}
