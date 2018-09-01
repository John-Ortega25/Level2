package org.jointheleague.level2.LeagueBreakout;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {

	Timer timer;
	Font titleFont;
	Font titleFont2;
	Font finalFont;
	Font finalFont2;
	Font finalFont3;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATEWON = 2;
	final int END_STATELOST = 3;
	int currentState = MENU_STATE;
	ObjectManager manager = new ObjectManager();
	public static BufferedImage paddleImage;

	public GamePanel() {
		timer = new Timer(1000 / 60, this);
		titleFont = new Font("Arial", Font.BOLD, 48);
		titleFont2 = new Font("Arial", Font.BOLD, 24);
		finalFont = new Font("Arial", Font.PLAIN, 52);
		finalFont2 = new Font("Arial", Font.BOLD, 24);
		finalFont3 = new Font("Arial", Font.PLAIN, 24);
		manager.rowOfBlock();

		try {

			paddleImage = ImageIO.read(this.getClass().getResourceAsStream("Paddle.jpg"));

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void restartGame() {
		manager = new ObjectManager();
		manager.rowOfBlock();
		currentState = MENU_STATE;
	}

	public void paintComponent(Graphics graphics) {
		manager.draw(graphics);
		if (currentState == MENU_STATE) {
			drawMenuState(graphics);
		} else if (currentState == GAME_STATE) {
			drawGameState(graphics);
		} else if (currentState == END_STATEWON) {
			drawEndStateWon(graphics);
		} else if (currentState == END_STATELOST) {
			drawEndStateLost(graphics);
		}
	}

	public void drawMenuState(Graphics graphics) {
		graphics.setColor(Color.BLACK);
		graphics.fillRect(0, 0, LeagueBreakout.WIDTH, LeagueBreakout.HEIGHT);
		graphics.setFont(titleFont);
		graphics.setColor(Color.RED);
		graphics.drawString("League Breakout", 20, 200);
		graphics.setFont(titleFont2);
		graphics.setColor(Color.RED);
		graphics.drawString("Press ENTER to start", 100, 300);
	}

	public void drawGameState(Graphics graphics) {
		graphics.setColor(Color.WHITE);
	}

	public void drawEndStateWon(Graphics graphics) {
		graphics.setColor(Color.BLUE);
		graphics.fillRect(0, 0, LeagueBreakout.WIDTH, LeagueBreakout.HEIGHT);
		graphics.setFont(finalFont);
		graphics.setColor(Color.BLACK);
		graphics.drawString("CONGRATS", 125, 100);
		graphics.setFont(finalFont2);
		graphics.setColor(Color.BLACK);
		graphics.drawString("You destroyed all blocks!", 130, 200);
		graphics.setFont(finalFont3);
		graphics.setColor(Color.BLACK);
		graphics.drawString("Press ENTER to restart", 120, 300);
	}

	public void drawEndStateLost(Graphics graphics) {
		graphics.setColor(Color.RED);
		graphics.fillRect(0, 0, LeagueBreakout.WIDTH, LeagueBreakout.HEIGHT);
		graphics.setFont(finalFont);
		graphics.setColor(Color.BLACK);
		graphics.drawString("Try better next time", 35, 100);
		graphics.setFont(finalFont3);
		graphics.setColor(Color.BLACK);
		graphics.drawString("Press ENTER to restart!", 120, 300);
	}

	public void startGame() {
		timer.start();
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == 10) {
			if (currentState == MENU_STATE) {
				currentState = GAME_STATE;
			} else if (currentState == GAME_STATE) {
				currentState = END_STATELOST;

			} else if (currentState == END_STATEWON) {
				restartGame();
			}

			if (currentState == END_STATELOST) {
				restartGame();
			}
		}
		manager.handlePaddleKeys(e);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		manager.stopPaddle();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (currentState == GAME_STATE) {
			manager.update();
			manager.checkPaddleCollision();
			if (manager.ball.y >= 500) {
				currentState = END_STATELOST;
				repaint();
			}
			if (manager.checkWonGame() == true) {
				currentState = END_STATEWON;
				repaint();
			}
		}
		repaint();
	}
}
