package org.jointheleague.level2.LeagueBreakout;

import java.awt.Graphics;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	
	public GameObject(int x, int y, int width, int height){
		
	}
	public void update(){
		
	}
	public void draw(Graphics graphics){
		graphics.fillRect(x, y, 100, 100);
	}
}
