package com.game.src.main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class BulletSR {
	private double x;
	private double y;
	private Textures tex;

	private double xVel;
	private double yVel;


	
	BufferedImage image;
	
	public BulletSR(double x, double y, Textures tex, Player p) {
		this.x = x;
		this.y = y;

		this.tex=tex;
		xVel=(x-p.getX())*5/(Math.pow(Math.pow(x-p.getX(),2)+Math.pow(y-p.getY(),2),0.5));
		yVel=(y-p.getY())*(5/(Math.pow(Math.pow(x-p.getX(),2)+Math.pow(y-p.getY(),2),0.5)));
	



	}
	
	
	
	public void tick() {


			x-=xVel;

			y-=yVel;

		
	}
	
	public void render(Graphics g) {
		g.drawImage(tex.bulletSR, (int)x, (int)y, null);
	}
	public double getY() {
		return y;
	}
	public double getX() {
		return x;
	}
}
