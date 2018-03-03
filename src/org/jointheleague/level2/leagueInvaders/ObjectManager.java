package org.jointheleague.level2.leagueInvaders;

import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {
	Rocketship rocket2;
	ArrayList<Projectile> projectiles= new ArrayList<>();
	
	public ObjectManager(Rocketship rocket) {
		rocket2 = rocket;
	}

	public void update() {
		rocket2.update();
		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).update();
			
		}
	}
	public void draw(Graphics graphics) {
		
		rocket2.draw(graphics);
		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).draw(graphics);
		}
	}
	public void addProjectile(Projectile projectile) {
		projectiles.add(projectile);
	}
}
