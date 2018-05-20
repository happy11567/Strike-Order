package com.game.src.main.bullets;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import com.game.src.main.GameObject;
import com.game.src.main.Player;
import com.game.src.main.classes.EntityC;
import com.game.src.main.graphics.Textures;

public class BulletSR extends GameObject implements EntityC {

	private Textures tex;

	private double xVel;
	private double yVel;

	
	BufferedImage image;
	
	public BulletSR(double x, double y, Textures tex, Player p) {
		super(x,y);

		this.tex=tex;
		xVel=(x-p.getX())*5/(Math.pow(Math.pow(x-p.getX(),2)+Math.pow(y-p.getY(),2),0.5));
		yVel=(y-p.getY())*(5/(Math.pow(Math.pow(x-p.getX(),2)+Math.pow(y-p.getY(),2),0.5)));
	



	}
	
	
	
	public void tick() {


			x-=xVel;

			y-=yVel;

		
	}
	
	public Rectangle getBounds() {
		return new Rectangle((int)x,(int)y,64,64);
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
