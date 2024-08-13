package com.balitechy.spacewar.main;

import java.awt.Graphics;
import java.util.LinkedList;

public abstract class BulletController {
	public abstract void tick();
	
	public abstract void render(Graphics g);

	abstract void addBullet(Bullet bullet);
}
