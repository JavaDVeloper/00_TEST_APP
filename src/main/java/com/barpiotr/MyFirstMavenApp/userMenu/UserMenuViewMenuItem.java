package com.barpiotr.MyFirstMavenApp.userMenu;

import com.barpiotr.MyFirstMavenApp.data.DataManagerSQLite;
import com.barpiotr.MyFirstMavenApp.menu.IExecutable;

public class UserMenuViewMenuItem implements IExecutable {
	
	public UserMenuViewMenuItem() {}
	
	public void execute() {
		//System.out.println("I ran: "+UserViewMenuItem.class.getName());
		
		//Get the User data
		UserMenuDAO model = new UserMenuDAO (DataManagerSQLite.getInstance());
		UserMenuConsoleListView view = new UserMenuConsoleListView();
		UserMenuController controller = new UserMenuController(view, model);
		controller.display();
	}
}