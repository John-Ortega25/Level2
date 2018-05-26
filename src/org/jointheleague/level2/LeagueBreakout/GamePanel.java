package org.jointheleague.level2.LeagueBreakout;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Paddle paddle = new Paddle(200, 490, 100, 10);
	Block blocks = new Block(50, 80, 40, 40);

	public GamePanel() {
		timer = new Timer(1000 / 60, this);
		titleFont = new Font("Arial", Font.BOLD, 48);
		titleFont2 = new Font("Arial", Font.BOLD, 24);
		finalFont = new Font("Arial", Font.PLAIN, 52);
		finalFont2 = new Font("Arial", Font.BOLD, 24);
		finalFont3 = new Font("Arial", Font.PLAIN, 24);
	}

	

	public void paintComponent(Graphics graphics) {
		paddle.draw(graphics);
		blocks.draw(graphics);
		if (currentState == MENU_STATE) {
			drawMenuState(graphics);
		} else if (currentState == GAME_STATE) {
			drawGameState(graphics);
		} else if (currentState == END_STATE) {
			drawEndState(graphics);
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

	public void drawEndState(Graphics graphics) {
		graphics.setColor(Color.RED);
		graphics.fillRect(0, 0, LeagueBreakout.WIDTH, LeagueBreakout.HEIGHT);
		graphics.setFont(finalFont);
		graphics.setColor(Color.BLACK);
		graphics.drawString("Game Over", 125, 100);
		graphics.setFont(finalFont2);
		graphics.setColor(Color.BLACK);
		graphics.drawString("You destroyed 0 blocks!", 130, 200);
		graphics.setFont(finalFont3);
		graphics.setColor(Color.BLACK);
		graphics.drawString("Press ENTER to restart", 120, 300);
	}

	public void startGame() {
		timer.start();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == 10) {
			if (currentState == MENU_STATE) {
				currentState = GAME_STATE;

			}

			else if (currentState == GAME_STATE) {
				currentState = END_STATE;

			} else if (currentState == END_STATE) {
				currentState = MENU_STATE;

			}

			if (currentState > END_STATE) {
				currentState = MENU_STATE;

			}
		}
		paddle.update();
		if(e.getKeyCode()== 39){
			//moveRight
			paddle.moveRight();
		}
		else if(e.getKeyCode()==37){
			//moveLeft
			paddle.moveLeft();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		paddle.stop();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		repaint();
		paddle.update();
	}

}
