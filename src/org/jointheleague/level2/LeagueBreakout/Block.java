package org.jointheleague.level2.LeagueBreakout;

import java.awt.Color;
import java.awt.Graphics;

public class Block extends GameObject {
	private int numTimesHit = 0;
	private Color firstTimeHit = Color.GREEN;
	private Color secondTimeHit = Color.BLUE;
	private Color blockColor = Color.RED;

	public Block(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	public void update() {
		super.update();
	}

	public void draw(Graphics graphics) {
		if (isAlive == true) {
			graphics.setColor(blockColor);
			graphics.fillRect(x, y, width, height);
		}
	}

	public void wasHit() {
		numTimesHit = numTimesHit + 1;
		if (numTimesHit == 1) {
			blockColor = firstTimeHit;
		}

		else if (numTimesHit == 2) {
			blockColor = secondTimeHit;
		}

		else if (numTimesHit == 3) {
			isAlive = false;
		}
	}
}
