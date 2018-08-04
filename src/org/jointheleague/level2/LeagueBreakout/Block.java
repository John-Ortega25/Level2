package org.jointheleague.level2.LeagueBreakout;

import java.awt.Color;
import java.awt.Graphics;

public class Block extends GameObject {
	int numTimesHit = 0;
	Color firstTimeHit = Color.GREEN;
	Color secondTimeHit = Color.BLUE;
	Color blockColor = Color.RED;
	
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
		if (numTimesHit == 1) {
			blockColor = firstTimeHit;
			numTimesHit = numTimesHit + 1;
		}
		
		if(numTimesHit == 2) {
			firstTimeHit = secondTimeHit;
			numTimesHit = numTimesHit + 1;
		}
		
		if (numTimesHit == 3) {
			isAlive = false;
		}
	}
}
