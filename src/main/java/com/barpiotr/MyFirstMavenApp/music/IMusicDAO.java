package com.barpiotr.MyFirstMavenApp.music;

import java.util.ArrayList;

public interface IMusicDAO {
	
	public ArrayList<Music> getAllMusics();
	public Music getMusic(int musicID);
	public int addMusic(Music aMusic);
	public void updateMusic(Music aMusic);
	public void deleteMusic(Music aMusic);
	public String printMusic(int musicID);

}
