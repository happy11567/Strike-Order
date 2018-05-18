package com.game.src.main;

import java.awt.Graphics;
import java.util.LinkedList;

public class Controller {

	
	private LinkedList<Bullet> b = new LinkedList<Bullet>();
	private LinkedList<Bullet1> b1 = new LinkedList<Bullet1>();	
	Bullet TempBullet;
	Bullet1 TempBullet1;
	Game game;	
	
	public Controller(Game game) {
		this.game = game;
		
	}
	
	
	public void tick() {
			for(int i=0; i < b.size(); i++) {
				TempBullet = b.get(i);
				if(TempBullet.getY()<50)
					removeBullet(TempBullet);
				TempBullet.tick();
		}
			for(int i=0; i < b1.size(); i++) {
				TempBullet1 = b1.get(i);
				if(TempBullet1.getY()<50)
					removeBullet1(TempBullet1);
				TempBullet1.tick();
		}
	}
	
	
	public void render(Graphics g) {
		for(int i = 0; i < b.size(); i++) {
			TempBullet = b.get(i);
			TempBullet.render(g);
		}
		for(int i = 0; i < b1.size(); i++) {
			TempBullet1 = b1.get(i);
			TempBullet1.render(g);
		}
	}
	
	
	public void addBullet(Bullet block) {
		b.add(block);
	}
	public void removeBullet (Bullet block) {
		b.remove(block);
	}
	public void addBullet1(Bullet1 block) {
		b1.add(block);
	}
	public void removeBullet1 (Bullet1 block) {
		b1.remove(block);
	}
}
