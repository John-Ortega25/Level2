package org.jointheleague.level2.LeagueBreakout;

import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	boolean isAlive;
	private Rectangle collisionBox;

	public GameObject(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		isAlive = true;
		collisionBox = new Rectangle(x, y, width, height);
	}

	public void update() {
		collisionBox.setBounds(x, y, width, height);

	}

	public void draw(Graphics graphics) {
		graphics.fillRect(x, y, 100, 100);
	}

	public boolean intersects(GameObject object) {
		if (collisionBox.intersects(object.collisionBox)) {
			return true;
		} else {
			return false;
		}
	}
}
