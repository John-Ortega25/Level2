package org.jointheleague.level2.LeagueBreakout;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.Random;

public class ObjectManager {
	Random num = new Random();
	int ballStartingPosition = num.nextInt(100)+50;
	Paddle paddle = new Paddle(200, 490, 90, 5);
	BlockManager manyBlocks = new BlockManager();
	Ball ball = new Ball(20, ballStartingPosition, 20, 20);

	public void rowOfBlock() {
		manyBlocks.manyRowOfBlock(3);
	}

	public void draw(Graphics graphics) {
		ball.draw(graphics);
		paddle.draw(graphics);
		manyBlocks.draw(graphics);
	}

	public void update() {
		ball.update();
		paddle.update();
		ball.changeYDirection();
		ball.changeXDirection();
		manyBlocks.checkCollisions(ball);
	}

	public void handlePaddleKeys(KeyEvent e) {
		if (e.getKeyCode() == 39) {
			paddle.moveRight();
		} else if (e.getKeyCode() == 37) {
			paddle.moveLeft();
		}
	}

	public void stopPaddle() {
		paddle.stop();
	}

	public void checkPaddleCollision() {

		if (ball.intersects(paddle)) {
			ball.ballYSpeed = ball.ballYSpeed * -1;
			ball.y = 460;
		}
	}

	public boolean checkWonGame() {
		return manyBlocks.checkIfYouWon();
	}
}
