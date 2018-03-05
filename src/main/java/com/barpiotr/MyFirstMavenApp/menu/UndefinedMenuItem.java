package com.barpiotr.MyFirstMavenApp.menu;

import java.util.Scanner;

public class UndefinedMenuItem implements IExecutable	{
	Scanner input = new Scanner(System.in);
	
	//CONSTRUCTOR
	public UndefinedMenuItem() {}
	
	public void execute() {
		System.out.println("The class "+UndefinedMenuItem.class.getName()+" is a placeholder menu item.");
		System.out.println("\nPress enter return to the main menu");
		this.input.nextLine();
	}
}
