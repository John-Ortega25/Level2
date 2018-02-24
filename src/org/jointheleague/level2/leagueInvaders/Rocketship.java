package org.jointheleague.level2.leagueInvaders;

import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject{
	int speed;
	int ySpeed;
	public Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed=5;
		ySpeed=5;
		// TODO Auto-generated constructor stub
	}
	public void update() {
		x=x+speed;
		y=y+ySpeed;
		
	}
	public void draw(Graphics graphics) {
		graphics.setColor(Color.BLUE);
		graphics.fillRect(x, y, width, height);
	}
	public void moveRight(){
		speed=5;
	}
	public void moveLeft(){
		speed=-5;
	}
	public void moveUp(){
		ySpeed=5;
	}
	public void moveDown(){
		ySpeed=-5;
	}
	public void stop(){
		speed=0;
		ySpeed=0;
	}
	
	
}
