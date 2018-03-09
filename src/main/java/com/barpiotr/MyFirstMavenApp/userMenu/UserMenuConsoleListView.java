package com.barpiotr.MyFirstMavenApp.userMenu;

import java.util.ArrayList;
import java.util.Iterator;

import com.barpiotr.MyFirstMavenApp.menu.ConsoleControls;

public class UserMenuConsoleListView {
	
	ArrayList<UserMenu> userMenuList;
	
	public UserMenuConsoleListView() {

	}

	public void setUserMenuList( ArrayList<UserMenu> userMenuList) {
		this.userMenuList = userMenuList;
	}
	
	public void display() {
		
		System.out.println( ConsoleControls.ANSI_GREEN_BRIGHT + "... USER VIEWER ..." + ConsoleControls.ANSI_RESET);
		System.out.println("\n");
		Iterator<UserMenu> iterator = this.userMenuList.iterator();
		while (iterator.hasNext()) {
			UserMenu aUserMenu = (UserMenu)iterator.next();
			aUserMenu.display();
		}
	}

}