package com.barpiotr.MyFirstMavenApp.playlist;

import java.util.Scanner;

import com.barpiotr.MyFirstMavenApp.data.DataManagerSQLite;
import com.barpiotr.MyFirstMavenApp.menu.IExecutable;


public class PlaylistViewMenuItem implements IExecutable {

	Scanner input = new Scanner(System.in);
	 
	public PlaylistViewMenuItem() {}

	public void execute() {
		//System.out.println("I ran: "+UserViewMenuItem.class.getName());
		
		//Get the User data
		PlaylistDAO model = new PlaylistDAO (DataManagerSQLite.getInstance());
		PlaylistConsoleListView view = new PlaylistConsoleListView();
		PlaylistController controller = new PlaylistController(view, model);
		controller.display();
	}
}

