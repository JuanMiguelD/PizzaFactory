package com.balitechy.spacewar.main;

import java.awt.Graphics;
import java.util.LinkedList;

public interface BulletController {
	public  void tick();
	
	public  void render(Graphics g);

	public void addBullet(Bullet bullet);

	public void removeBullet(Bullet bullet);
}
