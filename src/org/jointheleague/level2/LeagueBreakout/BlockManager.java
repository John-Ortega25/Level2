package org.jointheleague.level2.LeagueBreakout;

import java.awt.Color;
import java.awt.Graphics;

public class BlockManager {
	Block[] row = new Block[7];

	public BlockManager() {

	}

	public void blockCreator() {

		int blockNum = 0;
		Block firstBlock = new Block(90, 80, 40, 40);
		row[blockNum] = firstBlock;
		blockNum = blockNum + 1;
		for (; blockNum < row.length; blockNum = blockNum + 1) {
			Block previous = row[blockNum - 1];
			int newX = previous.x + previous.width + 10;
			Block block = new Block(newX, 80, 40, 40);
			row[blockNum] = block;

		}
	}

	public void draw(Graphics graphics) {
		for (int i = 0; i < row.length; i++) {
			row[i].draw(graphics);
		}
	}
}
