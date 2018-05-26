package org.jointheleague.level2.leagueInvaders;


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
		graphics.drawImage(GamePanel.rocketImg, x, y, width, height, null);
		
	}
	public void moveRight(){
		xSpeed=8;
	}
	public void moveLeft(){
		xSpeed=-8;
	}
	public void moveUp(){
		ySpeed=8;
	}
	public void moveDown(){
		ySpeed=-8;
	}
	public void stop(){
		xSpeed=0;
		ySpeed=0;
	}
	
	
}
