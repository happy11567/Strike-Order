package com.game.src.main.music;

import java.applet.*;
import java.net.URL;

public class SaberAttackSound {

	
	URL gas = Music.class.getResource("/SaberAttack1.wav");
	AudioClip clip = Applet.newAudioClip(gas);
	
	public SaberAttackSound(){


				clip.play();


	}

}