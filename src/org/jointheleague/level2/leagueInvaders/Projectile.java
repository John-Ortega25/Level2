package org.jointheleague.level2.leagueInvaders;


import java.awt.Graphics;

public class Projectile extends GameObject {

	int projectileSpeed = 10;

	public Projectile(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}

	public void update() {
		super.update();
		y = y - projectileSpeed;
		if (y < 0) {
			isAlive = false;
		}
	}

	public void draw(Graphics graphics) {
		graphics.drawImage(GamePanel.bulletImg, x, y, width, height, null);
	}

}
