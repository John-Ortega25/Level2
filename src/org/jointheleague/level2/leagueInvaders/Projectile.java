package org.jointheleague.level2.leagueInvaders;

import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject{
	
	int projectileSpeed= 10;
	
	public Projectile(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	public void update() {
		y=y-projectileSpeed;
		if (y<0 ) {
			isAlive= false;
		}
	}
	public void draw(Graphics graphics) {
		graphics.setColor(Color.RED);
		graphics.drawRect(x, y, width, height);
	}

}
