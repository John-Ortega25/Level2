package org.jointheleague.level2.LeagueBreakout;

import java.awt.Color;
import java.awt.Graphics;

public class Block extends GameObject {
	public Block(int x, int y, int width, int height){
		super(x, y, width, height);
	}
	public void update(){
		super.update();
	}
	
	
	public void draw(Graphics graphics){
		graphics.setColor(Color.RED);
		graphics.fillRect(x, y, width, height);
		
	}
}
