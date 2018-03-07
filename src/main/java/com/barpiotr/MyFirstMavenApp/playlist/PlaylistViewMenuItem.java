package com.barpiotr.MyFirstMavenApp.playlist;

import java.util.Scanner;

import com.barpiotr.MyFirstMavenApp.data.DataManagerSQLite;
import com.barpiotr.MyFirstMavenApp.menu.ConsoleControls;
import com.barpiotr.MyFirstMavenApp.menu.IExecutable;
import com.barpiotr.MyFirstMavenApp.user.UserConsoleListView;
import com.barpiotr.MyFirstMavenApp.user.UserController;
import com.barpiotr.MyFirstMavenApp.user.UserDAO;

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

