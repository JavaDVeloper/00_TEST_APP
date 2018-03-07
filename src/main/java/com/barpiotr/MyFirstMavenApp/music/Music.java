package com.barpiotr.MyFirstMavenApp.music;

/**
 * Date: 2018-03-04
 * 
 * @author: Piotr Bar
 */

public class Music {
	
	//DATA
	//.....................................
	//declare objects
	
	private int musicID;
	private String musicTitle;
	private String musicPerformerName;
	private String musicOriginYear;
	private String playlistName;
	private String userName;

	//CONSTRUCTORS
	//...................................
	
	public Music(int musicID, String musicTitle, String musicPerformerName, String musicOriginYear, String playlistName,
			String userName) {
		this.musicID = musicID;
		this.musicTitle = musicTitle;
		this.musicPerformerName = musicPerformerName;
		this.musicOriginYear = musicOriginYear;
		this.playlistName = playlistName;
		this.userName = userName;
	}


	//METHODS
	//..................................
	
	public int getMusicID() {
		return musicID;
	}

	public void setMusicID(int musicID) {
		this.musicID = musicID;
	}

	public String getMusicTitle() {
		return musicTitle;
	}

	public void setMusicTitle(String musicTitle) {
		this.musicTitle = musicTitle;
	}

	public String getMusicPerformerName() {
		return musicPerformerName;
	}

	public void setMusicPerformerName(String musicPerformerName) {
		this.musicPerformerName = musicPerformerName;
	}

	public String getMusicOriginYear() {
		return musicOriginYear;
	}

	public void setMusicOriginYear(String musicOriginYear) {
		this.musicOriginYear = musicOriginYear;
	}

	public String getPlaylistName() {
		return playlistName;
	}

	public void setPlaylistName(String playlistName) {
		this.playlistName = playlistName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	

	//METHODS CTN...

	@Override
	public String toString() {
		return "Music [Song no=" + musicID + ", Song title=" + musicTitle + ", Sung by=" + /*userID */musicPerformerName+ ", Orignally performed in="
				+ musicOriginYear + ", Belongs to playlist=" + playlistName +", Proposed by=" + userName +"]";
	}

	public void display() {
		System.out.println(this.toString());
	}

}//EOC
