package com.game.src.main;

import java.awt.Graphics;

public class Player {

	private double x;
	private double y;

	private double velX = 0;
	private double velY = 0;
	
	private int hp;
	private Game game;
	
	private Textures tex;
	
	
	public Player(double x, double y, Textures tex, Game game) {
		this.x = x;
		this.y = y;
		this.tex = tex;
		this.game=game;
		hp=3;
	}
	
	public void tick() {
		x+=velX;
		y+=velY;
		
		if (x<=0)
			x = 0;
		if (x>= 2*500-64)
			x = 2*500-64;
		if (y<=0)
			y = 0;
		if (y>= 2*375-64)
			y = 2*375-64;
		if (hp==0)
			game.stop();
		
	}
	public void render(Graphics g) {
		g.drawImage(tex.player, (int)x, (int)y, null);
		g.drawString(Integer.toString(hp), (int)x, (int)y);
	}
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void setX(double x) {
		this.x=x;
	}
	public void setY(double y) {
		this.y=y;
	}
	public double getVelX() {
		return velX;
	}
	public double getVelY() {
		return velY;
	}
	public void setVelX(double velX) {
		this.velX=velX;
	}
	public void setVelY(double velY) {
		this.velY=velY;
	}
	public void setHp(int hp) {
		this.hp=hp;
	}
	public int getHp() {
		return hp;
	}
	
	
}
