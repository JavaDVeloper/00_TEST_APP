package com.barpiotr.MyFirstMavenApp.userMenu;

import com.barpiotr.MyFirstMavenApp.menu.ConsoleControls;

/**
 * Date: 2018-03-04
 * 
 * @author: Piotr Bar
 */

public class UserMenu {
	
	//DATA
	//.....................................
	//declare objects
	
	private int userMenuID;

	//CONSTRUCTORS
	//...................................
	
	public UserMenu(int userMenuID) {
		this.userMenuID = userMenuID;

	}


	//METHODS
	//..................................
	
	public int getUserMenuID() {
		return userMenuID;
	}

	public void setUserMenuID(int userMenuID) {
		this.userMenuID = userMenuID;
	}

	//METHODS CTN...

	@Override
	public String toString() {
		return userMenuID + ".";
	}
	
	
	public void display() {
		System.out.println(this.toString());
	}

}//EOC
