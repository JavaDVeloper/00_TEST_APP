package com.barpiotr.MyFirstMavenApp.music;

import java.util.Scanner;

public class MusicController {
	
	private MusicConsoleListView view;
	private MusicDAO model;
	Scanner input = new Scanner(System.in);
	
	public MusicController(MusicConsoleListView view, MusicDAO model) {
		this.view = view;
		this.model = model;
	}
	
	public void display() {
		view.setMusicList(model.getAllMusics());
		view.display();
		System.out.println("\nPress enter return to the main menu");
		this.input.nextLine();
	}

}
