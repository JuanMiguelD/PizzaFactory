/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.balitechy.spacewar.main;

import static com.balitechy.spacewar.main.Player.HEIGHT;
import static com.balitechy.spacewar.main.Player.WIDTH;
import java.awt.Color;
import java.awt.Graphics;


public class SPlayer extends Player{
    
    public SPlayer(double x, double y, Game game) {
        super(x, y, game);
    }

    public void shoot() 
        {
            Bullet b = new SBullet(x+(WIDTH/2)-5, y-18,game);       
            game.getBullets().addBullet(b);
	}
    
	
	public void render(Graphics g)
	{
		g.setColor(Color.white);
		g.drawImage(image, (int) x, (int) y, null);
	}
    
}
