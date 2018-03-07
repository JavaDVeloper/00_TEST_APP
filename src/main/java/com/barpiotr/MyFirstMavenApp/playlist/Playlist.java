package com.barpiotr.MyFirstMavenApp.playlist;

/**
 * Date: 2018-03-04
 * 
 * @author: Piotr Bar
 */

public class Playlist {
	
	//DATA
	//.....................................
	//declare objects
	
	private int playlistID;
	private String playlistName;
	private String playlistLastUpdate;
	//private int userID;
	private String userName;

	//CONSTRUCTORS
	//...................................
	
	public Playlist(int playlistID, String playlistName, String playlistLastUpdate, /*int userID */String userName) {
		this.playlistID = playlistID;
		this.playlistName = playlistName;
		this.playlistLastUpdate = playlistLastUpdate;
		//this.userID = userID;
		this.userName = userName;
	}

	//METHODS
	//..................................
	
	public int getPlaylistID() {
		return playlistID;
	}

	public void setPlaylistID(int playlistID) {
		this.playlistID = playlistID;
	}

	public String getPlaylistName() {
		return playlistName;
	}

	public void setPlaylistName(String playlistName) {
		this.playlistName = playlistName;
	}

	/*public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	*/
	public String getUserName() {
		return userName;
	}

	public void setUserID(String userName) {
		this.userName = userName;
	}
	 
	public String getPlaylistLastUpdate() {
		return playlistLastUpdate;
	}

	public void setPlaylistLastUpdate(String playlistLastUpdate) {
		this.playlistLastUpdate = playlistLastUpdate;
	}

	//METHODS CTN...

	@Override
	public String toString() {
		return "Playlist [playlistID=" + playlistID + ", playlistName=" + playlistName + ", playlistOwnerName=" + /*userID */userName+ ", playlistLastUpdate="
				+ playlistLastUpdate + "]";
	}
	
	public void display() {
		System.out.println(this.toString());
	}

}//EOC
