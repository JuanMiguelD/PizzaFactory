package com.balitechy.spacewar.main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public abstract class Bullet {
	
        private double x;
        private double y;
	public static final int WIDTH = 11;
	public static final int HEIGHT = 21;
	public abstract void tick();
	public abstract void render(Graphics g);
	public double getY()
        {  
        return y;
        };
	
}
