package com.game.src.main;

import java.awt.Graphics;
import java.util.LinkedList;

public class Controller {

	
	private LinkedList<Bullet> b = new LinkedList<Bullet>();
	private LinkedList <Enemy> e = new 	LinkedList<Enemy>();
	private LinkedList<BulletSR> bSR = new LinkedList<BulletSR>();
	Player p;
	BulletSR TempBulletSR;
	Bullet TempBullet;
	Game game;	
	Textures tex;
	Enemy TempEnemy;
	
	public Controller(Game game, Textures tex, Player p) {
		this.game = game;
		this.tex = tex;
		this.p=p;
		for(int x = 0; x<(Game.WIDTH*Game.SCALE); x+=64) {
			addEnemy(new Enemy(x,0, tex, p));
		}
	}
	
	
	public void tick() {
			for(int i=0; i < b.size(); i++) {
				TempBullet = b.get(i);
				if(TempBullet.getY()<0)
					removeBullet(TempBullet);
				TempBullet.tick();
		}
			for(int i=0; i < bSR.size(); i++) {
				TempBulletSR = bSR.get(i);
				if(TempBulletSR.getY()>2*Game.HEIGHT)
					removeBulletSR(TempBulletSR);
				TempBulletSR.tick();
		}
			for(int i=0; i < e.size(); i++) {
				
				TempEnemy = e.get(i);
				for(int j=0; j < b.size(); j++) {
					TempBullet = b.get(j);
					
					if(Math.abs(TempEnemy.getX()-TempBullet.getX())<=10 && Math.abs(TempEnemy.getY()-TempBullet.getY())<=10) {
						removeBullet(TempBullet);
						removeEnemy(TempEnemy);
					}
				}
				
				TempEnemy.setCounter(TempEnemy.getCounter()+1);
				if(TempEnemy.getCounter()==50) {
					addBulletSR(new BulletSR(TempEnemy.getX()-3,TempEnemy.getY()-45,tex, p));
					TempEnemy.setCounter(0);
				}
				TempEnemy.tick();	
			}
	}
	
	
	public void render(Graphics g) {
		for(int i = 0; i < b.size(); i++) {
			TempBullet = b.get(i);
			TempBullet.render(g);
		}
		for(int i = 0; i < e.size(); i++) {
			TempEnemy = e.get(i);
			TempEnemy.render(g);
		}
		for(int i = 0; i < bSR.size(); i++) {
			TempBulletSR = bSR.get(i);
			TempBulletSR.render(g);
		}
	}
	
	
	public void addBullet(Bullet block) {
		b.add(block);
	}
	public void removeBullet (Bullet block) {
		b.remove(block);
	}
	public void addBulletSR(BulletSR block) {
		bSR.add(block);
	}
	public void removeBulletSR (BulletSR block) {
		bSR.remove(block);
	}
	public void addEnemy(Enemy block) {
		e.add(block);
	}
	public void removeEnemy (Enemy block) {
		e.remove(block);
	}
}
