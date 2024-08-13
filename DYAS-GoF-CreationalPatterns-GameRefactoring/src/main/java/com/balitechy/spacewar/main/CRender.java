/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.balitechy.spacewar.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;


public class CRender implements BackgroundRenderer{

    @Override
    public void render(Graphics g, Canvas c) {
        g.setColor(Color.BLACK);  // Color de fondo
        g.fillRect(0, 0, 640, 480);
        g.setColor(Color.yellow);
        g.fillOval(20, 20, 100, 100);

    }
    
}
