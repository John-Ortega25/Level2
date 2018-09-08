package org.jointheleague.level2.LeagueBreakout;
import java.awt.Color;
import java.awt.Graphics;

public class Ball extends GameObject {
	int ballXSpeed = 5;
	int ballYSpeed = 5;

	public Ball(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	public void update() {
		x = x + ballXSpeed;
		y = y + ballYSpeed;
		super.update();
	}

	public void changeXDirection() {
		if (LeagueBreakout.WIDTH == x || 0 == x) {
			ballXSpeed = ballXSpeed * -1;
		}
	}

	public void changeYDirection() {
		if (LeagueBreakout.HEIGHT == y || 0 == y) {
			ballYSpeed = ballYSpeed * -1;
		}
	}

	public void draw(Graphics graphics) {
		graphics.setColor(Color.BLACK);
		graphics.fillOval(x, y, width, height);
		graphics.setColor(Color.BLACK);
	}
}
