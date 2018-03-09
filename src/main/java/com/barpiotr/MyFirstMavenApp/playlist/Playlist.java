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
	private String reasonToInclude;
	private String playlistLastUpdate;
	private String userFirstName;
	private String userLastName;
	

	//CONSTRUCTORS
	//...................................
	
	
	public Playlist(int playlistID, String playlistName, String reasonToInclude, String playlistLastUpdate,
			String userFirstName, String userLastName) {
		this.playlistID = playlistID;
		this.playlistName = playlistName;
		this.reasonToInclude = reasonToInclude;
		this.playlistLastUpdate = playlistLastUpdate;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
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


	public String getReasonToInclude() {
		return reasonToInclude;
	}


	public void setReasonToInclude(String reasonToInclude) {
		this.reasonToInclude = reasonToInclude;
	}


	public String getPlaylistLastUpdate() {
		return playlistLastUpdate;
	}


	public void setPlaylistLastUpdate(String playlistLastUpdate) {
		this.playlistLastUpdate = playlistLastUpdate;
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


	//METHODS CTN...

	@Override
	public String toString() {
		return "Playlist [Pl ID: " + playlistID + ", Playlist Name: " + playlistName + ", Why included: "
				+ reasonToInclude + ", Updated: " + playlistLastUpdate + ", Supplied by: " + userFirstName
				+ " " + userLastName + "]";
	}
	
	public void display() {
		System.out.println(this.toString());
	}

}//EOC
