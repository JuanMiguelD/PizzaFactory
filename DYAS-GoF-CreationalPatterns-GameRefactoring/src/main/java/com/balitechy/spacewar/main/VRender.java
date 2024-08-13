/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.balitechy.spacewar.main;

import static com.balitechy.spacewar.main.Game.HEIGHT;
import static com.balitechy.spacewar.main.Game.WIDTH;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;


public class VRender extends BackgroundRenderer{

    @Override
    public void render(Graphics g, Canvas c) {
        g.setColor(Color.WHITE);  // Color de fondo
        g.fillRect(0, 0, 640, 480);
        g.setColor(Color.BLACK);
        g.drawOval(20, 20, 100, 100);
    }
    
}
