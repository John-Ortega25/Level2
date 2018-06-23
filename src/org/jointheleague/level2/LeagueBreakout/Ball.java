package org.jointheleague.level2.LeagueBreakout;

import java.awt.Graphics;

public class Ball extends GameObject {

	int ballXSpeed = 5;
	int ballYSpeed = 5;
	
	
	public Ball(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	public void update() {
		super.update();
		x = x + ballXSpeed;
		y = y + 	ballYSpeed;	
		
	}
	
	public void changeXDirection(){
		if(x == 500) {
			ballXSpeed = ballXSpeed * -1;
		}
	}
	
	public void changeYDirection() {
		if(y == 500) {
			ballYSpeed = ballYSpeed * -1;
		}
	}
	
	public void draw(Graphics graphics) {
		graphics.fillOval(x, y, width, height);
		System.out.println("printing ball at" + x );
	} 
}
