package org.jointheleague.level2.LeagueBreakout;

import java.awt.Color;
import java.awt.Graphics;

public class BlockManager {

	public BlockManager() {

	}

	public void blockCreator() {
		Block[] row = new Block[4];
		int blockNum = 0;
		Block firstBlock = new Block(90, 80, 40, 40);
		row[blockNum] = firstBlock;
		blockNum = blockNum + 1;
		for (int i = 0; i < row.length; i++) {
			Block previous = row[blockNum - 1];
			int newX = previous.x + previous.width;
			Block block = new Block(newX, 80, 40, 40);
			row[blockNum] = block;
			blockNum = blockNum + 1;
		}
	}
	
	public void draw(Graphics graphics) {
		
	}
}
