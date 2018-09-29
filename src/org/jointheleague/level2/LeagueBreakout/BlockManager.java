package org.jointheleague.level2.LeagueBreakout;

import java.awt.Graphics;

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

	public void intersectTopOrBottomOrSides(Ball ball, Block block) {
		int middleWidthBall = ball.x + ball.width / 2;
		int middleHeightBall = ball.y + ball.height / 2;

		if (middleWidthBall >= block.x && middleWidthBall <= block.x + block.width) {
			ball.ballYSpeed = ball.ballYSpeed * -1;
		} else if (middleHeightBall >= block.y && ball.y <= block.y + block.height) {
			ball.ballXSpeed = ball.ballXSpeed * -1;
		} else {
			ball.ballXSpeed = ball.ballXSpeed * -1;
			ball.ballYSpeed = ball.ballYSpeed * -1;
		}
	}

	public void checkCollisions(Ball ball) {
		for (int i = 0; i < row.length; i++) {
			if (ball.intersects(row[i])) {
				if (row[i].isAlive == true) {
					intersectTopOrBottomOrSides(ball, row[i]);
					row[i].wasHit();
				}
			}
		}

		for (int i = 0; i < row2.length; i++) {
			if (ball.intersects(row2[i])) {
				if (row2[i].isAlive == true) {
					intersectTopOrBottomOrSides(ball, row2[i]);
					row2[i].wasHit();
				}
			}
		}
		for (int i = 0; i < row3.length; i++) {
			if (ball.intersects(row3[i])) {
				if (row3[i].isAlive == true) {
					intersectTopOrBottomOrSides(ball, row3[i]);
					row3[i].wasHit();
				}
			}
		}
	}

	public boolean checkIfYouWon() {
		for (int i = 0; i < row.length; i++) {
			if (row[i].isAlive == true || row2[i].isAlive == true || row3[i].isAlive == true) {
				return false;
			}
		}
		return true;
	}
}
