package org.jointheleague.level2.leagueInvaders;

import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject{
	int speed;
	public Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed=5;
		// TODO Auto-generated constructor stub
	}
	public void update() {
		
	}
	public void draw(Graphics graphics) {
		graphics.setColor(Color.BLUE);
		graphics.fillRect(x, y, width, height);
	}
	
}
