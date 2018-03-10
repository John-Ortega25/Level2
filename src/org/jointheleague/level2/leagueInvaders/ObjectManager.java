package org.jointheleague.level2.leagueInvaders;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	Rocketship rocket2;
	int enemyTimer = 0;
	int enemySpawnTime = 10;
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

	public void manageEnemies() {
		if (System.currentTimeMillis() - enemyTimer >= enemySpawnTime) {
			addAlien(new Alien(new Random().nextInt(LeagueInvaders.WIDTH), 0, 50, 50));

			enemyTimer = (int) System.currentTimeMillis();
		}
	}

	public void purgeObjects() {

		for (int i = 0; i < projectiles.size(); i++) {
			boolean isAlive2 = projectiles.get(i).isAlive;
			if (isAlive2 == false) {
				projectiles.remove(i);
				System.out.println("Dead");
			}
		}
	}

	public void checkCollision() {
		for (Alien a : aliens) {
			if (rocket2.collisionBox.intersects(a.collisionBox)) {
				rocket2.isAlive = false;
			}
			for (Projectile p : projectiles) {
				if (a.collisionBox.intersects(p.collisionBox)) {
					a.isAlive = false;
				}
			}
		}
	}
}
