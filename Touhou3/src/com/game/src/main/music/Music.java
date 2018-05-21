package com.game.src.main.music;

import java.applet.*;
import java.net.URL;

public class Music {

	
	URL gas = Music.class.getResource("/nig.wav");
	AudioClip clip = Applet.newAudioClip(gas);
	
	public Music(){


				clip.play();


	}

}