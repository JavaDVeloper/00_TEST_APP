package com.barpiotr.MyFirstMavenApp.user;

import java.util.ArrayList;
import java.util.Iterator;

import com.barpiotr.MyFirstMavenApp.menu.ConsoleControls;

public class UserConsoleListView {
	
	ArrayList<User> userList;
	
	public UserConsoleListView() {

	}

	public void setUserList( ArrayList<User> userList) {
		this.userList = userList;
	}
	
	public void display() {
		
		System.out.println( ConsoleControls.ANSI_GREEN_BRIGHT + "... USER VIEWER ..." + ConsoleControls.ANSI_RESET);
		System.out.println("\n");
		Iterator<User> iterator = this.userList.iterator();
		while (iterator.hasNext()) {
			User aUser = (User)iterator.next();
			aUser.display();
		}
	}

}