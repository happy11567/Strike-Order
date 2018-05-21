package com.game.src.main.music;

import java.applet.*;
import java.net.URL;

public class SaberDead {

	
	URL gas = Music.class.getResource("/ArtoriaDefeat1.wav");
	AudioClip clip = Applet.newAudioClip(gas);
	
	public SaberDead(){


				clip.play();


	}

}