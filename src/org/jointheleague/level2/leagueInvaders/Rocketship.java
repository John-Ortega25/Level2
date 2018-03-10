package org.jointheleague.level2.leagueInvaders;

import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject{
	int xSpeed;
	int ySpeed;
	public Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	public void update() {
		super.update();
		x=x+xSpeed;
		y=y+ySpeed;
		
	}
	public void draw(Graphics graphics) {
		graphics.setColor(Color.BLUE);
		graphics.fillRect(x, y, width, height);
	}
	public void moveRight(){
		xSpeed=5;
	}
	public void moveLeft(){
		xSpeed=-5;
	}
	public void moveUp(){
		ySpeed=5;
	}
	public void moveDown(){
		ySpeed=-5;
	}
	public void stop(){
		xSpeed=0;
		ySpeed=0;
	}
	
	
}
