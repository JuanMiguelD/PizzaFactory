package com.balitechy.spacewar.main;

import java.awt.Graphics;
import java.util.LinkedList;

public class VBulletController extends BulletController{
	private LinkedList<VBullet> bl = new LinkedList<VBullet>();
	//Profe se que es codigo repetido pero no pude
	public void addBullet(Bullet bullet){
		bl.add((VBullet) bullet);
	}
	
	public void removeBullet(VBullet bullet){
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
