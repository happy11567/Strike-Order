package com.game.src.main;

import java.awt.Graphics;

public class Enemy {
	private double x;
	private double y;
	private Textures tex;
	private Player p;
	private double xVel;
	private double yVel;
	private int counter;
	public Enemy(double x, double y, Textures tex, Player p) {
		this.x = x;
		this.y = y;
		this.tex = tex;
		this.p =p;
	} 
	
	
	public void tick() {
		xVel=(x-p.getX())*0.5/(Math.pow(Math.pow(x-p.getX(),2)+Math.pow(y-p.getY(),2),0.5));
		yVel=-1;
	
		x-=xVel;

		y-=yVel;
		
		if (Math.abs(p.getX()-x)<=5 && Math.abs(p.getY()-y)<=5)
			p.setHp(p.getHp()-1);

				
	}
	
	public void render(Graphics g) {
		g.drawImage(tex.enemy, (int)x,(int)y, null);
	}
	
	public double getY() {
		return y;
	}
	public double getX() {
		return x;
	}
	public int getCounter(){
		return counter;
	}
	public void setCounter(int counter){
		this.counter = counter;
	}
}
