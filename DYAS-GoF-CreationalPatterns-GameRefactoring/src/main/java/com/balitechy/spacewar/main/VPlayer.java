/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;


public class VPlayer extends Player{
    
    public VPlayer(double x, double y, Game game) {
        super(x, y, game);
    }

    @Override
    public void shoot() 
    {
            Bullet b = new VBullet((int)x , (int) y-50,game);       
            game.getBullets().addBullet(b);
    }

  
    @Override
    public void render(Graphics g) 
    {           
                int [] vx1 = {(int) x, (int) x+50, (int) x-50};
                int [] vy1 = {(int) y-50, (int) y, (int) y};
                g.drawPolygon(vx1, vy1, 3);
    
                g.setColor(Color.black);

	}
    
}
