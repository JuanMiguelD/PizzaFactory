/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;


public class VBullet extends Bullet{
    
       private int x;
       private int y;
    
    
    VBullet(double x, double y, Game game) {
        this.x = (int) x;
	this.y = (int) y;
    }

    
    public void tick() {
        
        y -= 5;
    }

    public void render(Graphics g) {
        g.fillOval(x,y,5,5);
    }

    public double getY() {
        return y;
    }

   
    
}

