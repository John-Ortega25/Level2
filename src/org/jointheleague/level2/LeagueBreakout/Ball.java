package org.jointheleague.level2.LeagueBreakout;

import java.awt.Graphics;

public class Ball extends GameObject {

	int ballXSpeed = 10;
	int ballYSpeed = 10;
	
	public Ball(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	public void update() {
		super.update();
		
	}
	
	public void draw(Graphics graphics) {
		graphics.fillOval(100, 400, 10, 10);

	}
}
