package org.jointheleague.level2.LeagueBreakout;

import java.awt.Color;
import java.awt.Graphics;

import apple.laf.JRSUIConstants.FrameOnly;

public class BlockManager {
	Block[] row = new Block[7];
	Block[] row2 = new Block[7];
	Block[] row3 = new Block[7];

	public BlockManager() {

	}

	public void rowOfBlock(int yValue, Block[] row) {

		int blockNum = 0;
		Block firstBlock = new Block(70, yValue, 40, 40);
		row[blockNum] = firstBlock;
		blockNum = blockNum + 1;
		for (; blockNum < row.length; blockNum = blockNum + 1) {
			Block previous = row[blockNum - 1];
			int newX = previous.x + previous.width + 10;
			Block block = new Block(newX, yValue, 40, 40);
			row[blockNum] = block;

		}
	}

	public void manyRowOfBlock(int numOfRows) {
		rowOfBlock(130, row);
		rowOfBlock(180, row2);
		rowOfBlock(230, row3);
	}

	public void draw(Graphics graphics) {
		for (int i = 0; i < row.length; i++) {
			row[i].draw(graphics);
			row2[i].draw(graphics);
			row3[i].draw(graphics);
		}
	}

	public void checkCollisions(Ball ball) {
		for (int i = 0; i < row.length; i++) {
			if (ball.intersects(row[i])) {
				if (row[i].isAlive == true ) {
					ball.ballXSpeed = ball.ballXSpeed * -1;
					row[i].isAlive = false;
				}
			}
		}
		
		for (int i = 0; i < row2.length; i++) {
			if (ball.intersects(row2[i])) {
				if (row2[i].isAlive == true) {
					ball.ballXSpeed = ball.ballXSpeed * -1;
					row2[i].isAlive = false;
				}
			}
		}
		for (int i = 0; i < row3.length; i++) {
			if (ball.intersects(row3[i])) {
				if (row3[i].isAlive == true) {
					ball.ballXSpeed = ball.ballXSpeed * -1;
					row3[i].isAlive = false;
				}
			}
		}

	}
	
	public boolean checkIfYouWon() {
		for (int i = 0; i <row.length; i++) {
			if (row[i].isAlive == false && row2[i].isAlive == false && row3[i].isAlive == false) {
				return true;
			}		
		} 
			return false;
	}
}
