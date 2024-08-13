/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.balitechy.spacewar.main;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SRender extends BackgroundRenderer{

    @Override
    public void render(Graphics g, Canvas c){
		BufferedImage background = null;
		SpritesImageLoader bg;
		bg = new SpritesImageLoader("/bg.png");
        try {
            bg.loadImage();
        } catch (IOException ex) {
            Logger.getLogger(SRender.class.getName()).log(Level.SEVERE, null, ex);
        }
		background = bg.getImage(0, 0, 640, 480);
		g.drawImage(background, 0, 0, c.getWidth(), c.getHeight(), c);
		
	}
    
}
