package com.game.src.main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Bullet{
	private double x;
	private double y;
	
	private Textures tex;
	
	BufferedImage image;
	
	public Bullet(double x, double y, Textures tex) {
		this.x = x;
		this.y = y;
		this.tex = tex;
	}
	
	
	public void tick() {
		y-=10;
	}
	
	public void render(Graphics g) {
		g.drawImage(tex.bullet, (int)x, (int)y, null);
	}
	public double getY() {
		return y;
	}
	public double getX() {
		return x;
	}
}
