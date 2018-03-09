package com.barpiotr.MyFirstMavenApp.userMenu;

import java.util.Scanner;

public class UserMenuController {
	
	private UserMenuConsoleListView view;
	private UserMenuDAO model;
	Scanner input = new Scanner(System.in);
	
	public UserMenuController(UserMenuConsoleListView view, UserMenuDAO model) {
		this.view = view;
		this.model = model;
	}
	
	public void display() {
		view.setUserMenuList(model.getAllUsersMenu());
		view.display();
		System.out.println("\nPress enter return to the main menu");
		this.input.nextLine();
	}

}
