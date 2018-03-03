package org.jointheleague.level2.leagueInvaders;

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
	Font titleFont3;
	Font finalFont;
	Font finalFont2;
	Font finalFont3;
	
	Rocketship rocket = new Rocketship(250, 700, 50, 50);
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;

	ObjectManager manager= new ObjectManager(rocket);
	
	public GamePanel() {
		timer = new Timer(1000 / 60, this);
		titleFont = new Font("Arial", Font.BOLD, 48);
		titleFont2 = new Font("Arial", Font.BOLD, 24);
		titleFont3 = new Font("Arial", Font.BOLD, 24);
		finalFont = new Font("Arial", Font.PLAIN, 52);
		finalFont2 = new Font("Arial", Font.BOLD, 24);
		finalFont3 = new Font("Arial", Font.PLAIN, 24);

	}

	public void startGame() {
		timer.start();
	}

	GameObject object = new GameObject(10, 10, 100, 100);

	@Override
	public void paintComponent(Graphics graphics) {
		object.draw(graphics);
		if (currentState == MENU_STATE) {
			drawMenuState(graphics);
		} else if (currentState == GAME_STATE) {
			drawGameState(graphics);
		} else if (currentState == END_STATE) {
			drawEndState(graphics);
		}

	}

	public void updateMenuState() {

	}

	public void updateGameState() {
		manager.update();

	}

	public void updateEndState() {

	}

	public void drawMenuState(Graphics graphics) {
		graphics.setColor(Color.BLUE);
		graphics.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		graphics.setFont(titleFont);
		graphics.setColor(Color.YELLOW);
		graphics.drawString("LEAGUE INVADERS", 20, 200);
		graphics.setFont(titleFont2);
		graphics.setColor(Color.YELLOW);
		graphics.drawString("Press ENTER to start", 100, 350);
		graphics.setFont(titleFont3);
		graphics.setColor(Color.YELLOW);
		graphics.drawString("Press SPACE for instructions", 50, 500);
	}

	public void drawGameState(Graphics graphics) {
		graphics.setColor(Color.BLACK);
		graphics.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		manager.draw(graphics);
	}

	public void drawEndState(Graphics graphics) {
		graphics.setColor(Color.RED);
		graphics.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		graphics.setFont(finalFont);
		graphics.setColor(Color.BLACK);
		graphics.drawString("Game Over", 125, 200);
		graphics.setFont(finalFont2);
		graphics.setColor(Color.BLACK);
		graphics.drawString("You killed 0 enemies", 130, 350);
		graphics.setFont(titleFont3);
		graphics.setColor(Color.BLACK);
		graphics.drawString("Press ENTER to restart", 120, 500);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (currentState == MENU_STATE) {

			updateMenuState();
		} else if (currentState == GAME_STATE) {

			updateGameState();
		} else if (currentState == END_STATE) {

			updateEndState();
		}
		// TODO Auto-generated method stub
		repaint();
		object.update();
		repaint();
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

			}

			else if (currentState == END_STATE) {
				currentState = MENU_STATE;
			}

			if (currentState > END_STATE) {
				currentState = MENU_STATE;

			}
		}
		rocket.update();
		if (e.getKeyCode() == 37) {
			rocket.moveLeft();
		}
		if (e.getKeyCode() == 38) {
			rocket.moveDown();
		}
		if (e.getKeyCode() == 39) {
			rocket.moveRight();
		}
		if (e.getKeyCode() == 40) {
			rocket.moveUp();
		}
		
		if (e.getKeyCode()==32) {
			
			manager.addProjectile( new Projectile(rocket.x, rocket.y, 10, 10));
		}
	}
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
		rocket.stop();
	}

}
