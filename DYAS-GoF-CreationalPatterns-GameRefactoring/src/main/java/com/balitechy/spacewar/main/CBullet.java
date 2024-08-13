/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;



public class CBullet extends Bullet{
    
    private int x;
    private int y;
    
    
    CBullet(double x, double y, Game game) {
        this.x = (int) x;
	this.y = (int) y;
    }
    
    public void tick() {
        y -= 5;
    }

    public void render(Graphics g) {
        g.setColor(Color.GREEN);
        g.drawOval(x, y, 4, 4);
    }

    public double getY() {
        return y;
    }

   
    
}
