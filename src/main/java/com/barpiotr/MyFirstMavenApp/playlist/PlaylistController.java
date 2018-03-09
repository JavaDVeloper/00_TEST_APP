package com.barpiotr.MyFirstMavenApp.playlist;

/**
 * Date: 2018-03-04
 * 
 * @author: Piotr Bar
 */

import java.util.Scanner;

public class PlaylistController {
	
	private PlaylistConsoleListView view;
	private PlaylistDAO model;
	Scanner input = new Scanner(System.in);
	
	public PlaylistController(PlaylistConsoleListView view, PlaylistDAO model) {
		this.view = view;
		this.model = model;
	}
	
	public void display() {
		view.setPlaylistList(model.getAllPlaylists());
		view.display();
		System.out.println("\nPress enter return to the main menu");
		this.input.nextLine();
	}

}
