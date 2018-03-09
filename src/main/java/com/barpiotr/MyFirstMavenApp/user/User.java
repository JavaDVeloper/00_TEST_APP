package com.barpiotr.MyFirstMavenApp.user;

import com.barpiotr.MyFirstMavenApp.menu.ConsoleControls;

/**
 * Date: 2018-03-04
 * 
 * @author: Piotr Bar
 */

public class User {
	
	//DATA
	//.....................................
	//declare objects
	
	private int userID;
	private String userFirstName;
	private String userLastName;
	private String userEmail;
	private String userLastUpdate;

	//CONSTRUCTORS
	//...................................
	
	public User(int userID, String userFirstName, String userLastName, String userEmail, String userLastUpdate) {
		this.userID = userID;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmail = userEmail;
		this.userLastUpdate = userLastUpdate;
	}


	//METHODS
	//..................................
	
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserLastUpdate() {
		return userLastUpdate;
	}

	public void setUserLastUpdate(String userLastUpdate) {
		this.userLastUpdate = userLastUpdate;
	}

	//METHODS CTN...

	@Override
	public String toString() {
		return "User [User ID: " + userID + ", User Name: " + userFirstName + " " + userLastName
				+ ", Email: " + userEmail + ", Updated: " + userLastUpdate + "]";
	}
	
	
	public void display() {
		System.out.println(this.toString());
	}

}//EOC
