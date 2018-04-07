package org.jointheleague.level2.leagueInvaders;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	Rocketship rocket2;
	long enemyTimer = 0;
	int enemySpawnTime = 1000;
	int score = 0;
	ArrayList<Projectile> projectiles = new ArrayList<>();
	ArrayList<Alien> aliens = new ArrayList<>();

	public ObjectManager(Rocketship rocket) {
		rocket2 = rocket;
	}

	public void update() {
		rocket2.update();
		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).update();

		}
		for (int i = 0; i < aliens.size(); i++) {
			aliens.get(i).update();

		}
	}

	public void draw(Graphics graphics) {

		rocket2.draw(graphics);
		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).draw(graphics);

		}
		for (int i = 0; i < aliens.size(); i++) {
			aliens.get(i).draw(graphics);

		}
	}

	public void addProjectile(Projectile projectile) {
		projectiles.add(projectile);
	}

	public void addAlien(Alien alien) {
		aliens.add(alien);
	}

	public void removeAlien(int remove) {
		aliens.remove(remove);
	}
	public int getScore() {
		return score;
	}

	public void manageEnemies() {
		if (System.currentTimeMillis() - enemyTimer >= enemySpawnTime) {
			addAlien(new Alien(new Random().nextInt(LeagueInvaders.WIDTH), 0, 50, 50));
			enemyTimer = System.currentTimeMillis();
		}
	}

	public void purgeObjects() {

		for (int i = 0; i < projectiles.size(); i++) {
			boolean isAlive2 = projectiles.get(i).isAlive;
			if (isAlive2 == false) {
				projectiles.remove(i);	
			}
		}
		for (int i = 0; i < aliens.size(); i++) {
			boolean isAlive3 = aliens.get(i).isAlive;
			if ( isAlive3== false) {
				removeAlien(i);
				score = score +1;
			}
			
		}
	}

	public void checkCollision() {
		int index = 0;
	
		for (Alien a : aliens) {
			if (rocket2.collisionBox.intersects(a.collisionBox)) {
				rocket2.isAlive = false;
				a.isAlive = false;
			}
			for (Projectile p : projectiles) {
				if (a.collisionBox.intersects(p.collisionBox)) {
					a.isAlive = false;
					p.isAlive = false;
				}
			}
			index++;
		}
	}
}
