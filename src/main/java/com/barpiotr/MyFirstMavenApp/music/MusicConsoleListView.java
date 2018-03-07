package com.barpiotr.MyFirstMavenApp.music;

import java.util.ArrayList;
import java.util.Iterator;

import com.barpiotr.MyFirstMavenApp.menu.ConsoleControls;

public class MusicConsoleListView {
	
	ArrayList<Music> musicList;
	
	public MusicConsoleListView() {

	}

	public void setMusicList( ArrayList<Music> musicList) {
		this.musicList = musicList;
	}
	
	public void display() {
		
		System.out.println( ConsoleControls.ANSI_BLUE_BRIGHT + "... MUSIC VIEWER ..." + ConsoleControls.ANSI_RESET);
		System.out.println("\n");
		Iterator<Music> iterator = this.musicList.iterator();
		while (iterator.hasNext()) {
			Music aMusic = (Music)iterator.next();
			aMusic.display();
		}
	}

}