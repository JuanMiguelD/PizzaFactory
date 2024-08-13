package com.balitechy.spacewar.main;

import java.awt.Graphics;
import java.util.LinkedList;

public class SBulletController implements BulletController{
	private LinkedList<SBullet> bl = new LinkedList<SBullet>();
	
	@Override
	public void addBullet(Bullet bullet){
		bl.add((SBullet) bullet);
	}
	
	@Override
	public void removeBullet(Bullet bullet){
		bl.remove(bullet);
	}

    @Override
    public void render(Graphics g) {
		for(int i=0; i < bl.size(); i++){
			bl.get(i).render(g);
		}
	}

    @Override
    public void tick() {
		for(int i=0; i < bl.size(); i++){
			if(bl.get(i).getY() < 0){
				removeBullet(bl.get(i));
			}else{
				bl.get(i).tick();
			}
		}
	}
}
