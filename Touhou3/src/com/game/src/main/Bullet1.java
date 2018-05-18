package com.game.src.main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Bullet1 {
	private double x;
	private double y;
	
	BufferedImage image;
	
	public Bullet1(double x, double y, Game game) {
		this.x = x;
		this.y = y;
		
		SpriteSheet ss = new SpriteSheet(game.getSpriteSheet());
		
		image = ss.getImage(1, 2, 64, 64);
	}
	
	
	public void tick() {
		y-=3.5;
		x-=1;
	}
	
	public void render(Graphics g) {
		g.drawImage(image, (int)x, (int)y, null);
	}
	public double getY() {
		return y;
	}
}

