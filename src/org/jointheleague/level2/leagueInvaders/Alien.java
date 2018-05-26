package org.jointheleague.level2.leagueInvaders;


import java.awt.Graphics;

public class Alien extends GameObject {

	public Alien(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	public void update() {
		super.update();
		y=y+5;
	}
	public void draw(Graphics graphics) {
		graphics.drawImage(GamePanel.alienImg, x, y, width, height, null);
	}

}
