package org.jointheleague.level2.LeagueBreakout;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends GameObject {
	int xSpeed = 3;

	public Paddle(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	public void update() {
		super.update();
		x = x + xSpeed;
	}

	public void moveRight() {
		xSpeed = 5;
	}

	public void moveLeft() {
		xSpeed = -5;
	}

	public void stop() {
		xSpeed = 0;
	}

	public void draw(Graphics graphics) {
		graphics.setColor(Color.BLACK);
		graphics.drawImage(GamePanel.paddleImage, x, y, width, height, null);

	}
}
