package com.game.src.main;

import java.awt.image.BufferedImage;

public class Textures {

	public BufferedImage player, bullet, enemy, bulletSR;
	
	private SpriteSheet ss;
	
	public Textures(Game game) {
		ss = new SpriteSheet(game.getSpriteSheet());
	
		getTextures();
	}
	
	public void getTextures() {
		player = ss.getImage(1, 1, 64, 64);
		bullet = ss.getImage(2, 1, 64, 64);
		enemy = ss.getImage(1, 3, 64, 64);
		bulletSR = ss.getImage(2, 3, 64, 64);
		
	}
	
	
	
	
	
	
	
	
	
}
