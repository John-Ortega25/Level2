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
	//final int MENU
	public GamePanel() {
		timer = new Timer(1000 / 60, this);
		titleFont = new Font("Arial", Font.BOLD, 48);
		titleFont2 = new Font("Arial", Font.BOLD, 24);
		finalFont = new Font("Arial", Font.PLAIN, 52);
		finalFont2 = new Font("Arial", Font.BOLD, 24);
		finalFont3 = new Font("Arial", Font.PLAIN, 24);
	}

	GameObject object = new GameObject(10, 10, 100, 100);

	public void paintComponent(Graphics graphics) {
		object.draw(graphics);
	}

	public void drawMenuState(Graphics graphics) {
		graphics.setColor(Color.BLACK);
		graphics.fillRect(0, 0, LeagueBreakout.WIDTH, LeagueBreakout.HEIGHT);
		graphics.setFont(titleFont);
		graphics.setColor(Color.RED);
		graphics.drawString("League Breakout", 20, 200);
		graphics.setFont(titleFont2);
		graphics.setColor(Color.RED);
		graphics.drawString("Press ENTER to start", 100, 350);
	}

	public void drawGameState(Graphics graphics) {
		graphics.setColor(Color.WHITE);
	}

	public void drawEndState(Graphics graphics) {
		graphics.setColor(Color.RED);
		graphics.fillRect(0, 0, LeagueBreakout.WIDTH, LeagueBreakout.HEIGHT);
		graphics.setFont(finalFont);
		graphics.setColor(Color.BLACK);
		graphics.drawString("Game Over", 125, 200);
		graphics.setFont(finalFont2);
		graphics.setColor(Color.BLACK);
		graphics.drawString("You killed 0 enemies", 130, 350);
		graphics.setFont(finalFont3);
		graphics.setColor(Color.BLACK);
		graphics.drawString("Press ENTER to restart", 120, 500);
	}

	public void startGame() {
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == 10) {

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		object.update();
	}

}
