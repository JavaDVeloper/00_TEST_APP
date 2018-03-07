package com.barpiotr.MyFirstMavenApp.music;

import java.util.Scanner;

import com.barpiotr.MyFirstMavenApp.data.DataManagerSQLite;
import com.barpiotr.MyFirstMavenApp.menu.ConsoleControls;
import com.barpiotr.MyFirstMavenApp.menu.IExecutable;

public class MusicViewMenuItem implements IExecutable {

	Scanner input = new Scanner(System.in);
	 
	public MusicViewMenuItem() {}

	public void execute() {
		//System.out.println("I ran: "+UserViewMenuItem.class.getName());
		
		//Get the User data
		MusicDAO model = new MusicDAO (DataManagerSQLite.getInstance());
		MusicConsoleListView view = new MusicConsoleListView();
		MusicController controller = new MusicController(view, model);
		controller.display();
	}
}

