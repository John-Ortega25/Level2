package org.jointheleague.level2.leagueInvaders;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	private final int HEIGHT= 800;
	private final int WIDTH= 500;
	
	public LeagueInvaders() {
		frame= new JFrame();
	}
	public void setUp() {
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



	}
	public static void main(String[] args) {
		LeagueInvaders game= new LeagueInvaders();
		game.setUp();
	}
}
