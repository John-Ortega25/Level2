package org.jointheleague.level2.leagueInvaders;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer timer;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;

	public GamePanel() {
		timer = new Timer(1000 / 60, this);
	}

	public void startGame() {
		timer.start();
	}

	GameObject object = new GameObject(10, 10, 100, 100);

	@Override
	public void paintComponent(Graphics graphics) {
		object.draw(graphics);
		if (currentState== MENU_STATE) {
			drawMenuState(graphics);
		}else if (currentState== GAME_STATE) {
			drawGameState(graphics);
		}else if (currentState== END_STATE) {
			drawEndState(graphics);
		}
		
		
		
	}

	public void updateMenuState() {

	}

	public void updateGameState() {

	}

	public void updateEndState() {

	}

	public void drawMenuState(Graphics graphics) {

	}

	public void drawGameState(Graphics graphics) {

	}

	public void drawEndState(Graphics graphics) {

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
		System.out.println("Hi");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Greetings");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

}
