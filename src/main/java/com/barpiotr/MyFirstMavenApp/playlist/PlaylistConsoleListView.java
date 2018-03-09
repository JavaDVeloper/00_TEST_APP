package com.barpiotr.MyFirstMavenApp.playlist;

/**
 * Date: 2018-03-04
 * 
 * @author: Piotr Bar
 */

import java.util.ArrayList;
import java.util.Iterator;

import com.barpiotr.MyFirstMavenApp.menu.ConsoleControls;

public class PlaylistConsoleListView {
	
	ArrayList<Playlist> playlistList;
	
	public PlaylistConsoleListView() {

	}

	public void setPlaylistList( ArrayList<Playlist> playlistList) {
		this.playlistList = playlistList;
	}
	
	public void display() {
		
		System.out.println( ConsoleControls.ANSI_YELLOW_BRIGHT + "... PLAYLIST VIEWER ..." + ConsoleControls.ANSI_RESET);
		System.out.println("\n");
		Iterator<Playlist> iterator = this.playlistList.iterator();
		while (iterator.hasNext()) {
			Playlist aPlaylist = (Playlist)iterator.next();
			aPlaylist.display();
		}
	}

}