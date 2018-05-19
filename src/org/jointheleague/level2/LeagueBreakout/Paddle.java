package org.jointheleague.level2.LeagueBreakout;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends GameObject {
	int xSpeed;
	

	public Paddle(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	public void update() {
		super.update();
		x = x + xSpeed;
	}
	
	public void draw(Graphics graphics) {
		graphics.setColor(Color.BLACK);
		graphics.fillRect(x, y, width, height);
	}
}
