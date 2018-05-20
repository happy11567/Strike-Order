package com.game.src.main.graphics;

import java.awt.image.BufferedImage;

import com.game.src.main.Game;

public class Textures {

	public BufferedImage player, bullet, gilgamesh, bulletSR, humunculus ;
	
	private SpriteSheet ss;
	
	public Textures(Game game) {
		ss = new SpriteSheet(game.getSpriteSheet());
	
		getTextures();
	}
	
	public void getTextures() {
		player = ss.getImage(1, 1, 64, 64);
		bullet = ss.getImage(2, 1, 64, 64);
		gilgamesh = ss.getImage(1, 3, 64, 64);
		bulletSR = ss.getImage(2, 3, 64, 64);
		humunculus = ss.getImage(2,2,64,64);
		
	}
	
	
	
	
	
	
	
	
	
}
