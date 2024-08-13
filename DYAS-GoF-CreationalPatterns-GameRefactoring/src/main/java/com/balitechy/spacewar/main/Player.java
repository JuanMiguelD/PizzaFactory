package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public abstract class Player {
	
	double x;
	double y;
	
	double velX;
	double velY;
	
	public static final int WIDTH = 56;
	public static final int HEIGHT = 28;
	
	BufferedImage image;
	Game game;
	
	public Player(double x, double y, Game game){
		this.x = x;
		this.y = y;
		this.game = game;	
		image = game.getSprites().getImage(219, 304, WIDTH, HEIGHT);
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
                borrar();
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setVelX(double velX) {
		this.velX = velX;
	}

	public void setVelY(double velY) {
		this.velY = velY;
	}
	
	public abstract void shoot();

        public void tick(){
		x += velX;
		y += velY;
		
		// To avoid player go outside the arena.		
		if(x <= 0)
			x = 0;
		if(x >= (Game.WIDTH * Game.SCALE) - WIDTH)
			x = (Game.WIDTH * Game.SCALE) - WIDTH;
		if(y <= 0)
			y = 0;
		if(y >= (Game.HEIGHT * Game.SCALE) - HEIGHT)
			y = (Game.HEIGHT * Game.SCALE) - HEIGHT;
	}
	
	public abstract void render(Graphics g);

    private void borrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
