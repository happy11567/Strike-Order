package com.game.src.main;

import java.awt.Graphics;
import java.awt.Rectangle;

import com.game.src.main.Game.STATE;
import com.game.src.main.classes.EntityB;
import com.game.src.main.classes.EntityC;
import com.game.src.main.graphics.Textures;

public class Player extends GameObject{



	private double velX = 0;
	private double velY = 0;
	
	private int hp;
	private Game game;
	private Controller c;
	private Textures tex;
	private double speedMod;
	
	public Player(double x, double y, Textures tex, Game game) {

		super(x,y);
		this.tex = tex;
		this.game=game;
		hp=3;
		speedMod=1;
	}
	
	public void tick() {
		
		checkPlayerCollision();
		
		x+=velX*speedMod;
		y+=velY*speedMod;
		
		if(hp<=0) {
			game.setState(STATE.DEATH);
		}
		if (x<=0)
			x = 0;
		if (x>= 2*500-64)
			x = 2*500-64;
		if (y<=0)
			y = 0;
		if (y>= 2*375-64)
			y = 2*375-64;

		
	}
	
	public Rectangle getBounds() {
		return new Rectangle((int)x,(int)y,64,64);
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
	public void setSpeedMod() {
		speedMod=0.5;
	}
	public void reSetSpeedMod() {
		speedMod=1;
	}
	private void checkPlayerCollision() {
	
		for(int i=0; i<game.eb.size(); i++) {
			EntityB tempEnt = game.eb.get(i);
			if (Math.abs(tempEnt.getX()-x)<=5 && Math.abs(tempEnt.getY()-y)<=5) {
				
				hp--;
				c.removeAll();
			}
		}	
		for(int i=0; i<game.ec.size(); i++) {
			EntityC tempEnt = game.ec.get(i);
			if (Math.abs(tempEnt.getX()-x)<=5 && Math.abs(tempEnt.getY()-y)<=5) {
				
				hp--;
				c.removeAll();
			}
		}	
	}
	public void givePlayerController(Controller c) {
		this.c = c;
	}
	
}
