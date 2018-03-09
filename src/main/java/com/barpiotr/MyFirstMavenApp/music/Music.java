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
	private String linkToPlay;
	private String reasonToInclude;
	private String playlistName;
	
	//CONSTRUCTORS
	//...................................

	public Music(int musicID, String musicTitle, String musicPerformerName, String musicOriginYear, String linkToPlay,
			String reasonToInclude, String playlistName) {
		this.musicID = musicID;
		this.musicTitle = musicTitle;
		this.musicPerformerName = musicPerformerName;
		this.musicOriginYear = musicOriginYear;
		this.linkToPlay = linkToPlay;
		this.reasonToInclude = reasonToInclude;
		this.playlistName = playlistName;
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

	public String getLinkToPlay() {
		return linkToPlay;
	}

	public void setLinkToPlay(String linkToPlay) {
		this.linkToPlay = linkToPlay;
	}

	public String getReasonToInclude() {
		return reasonToInclude;
	}

	public void setReasonToInclude(String reasonToInclude) {
		this.reasonToInclude = reasonToInclude;
	}

	public String getPlaylistName() {
		return playlistName;
	}

	public void setPlaylistName(String playlistName) {
		this.playlistName = playlistName;
	}
	
	
	//METHODS CTN...

	@Override
	public String toString() {
		return String.format(
				"Music [Song No: %s, Song Title %s, Performed by: %s, Published in %s, Go to listen to: %s, Why included %s, Part of playlist: %s]",
				musicID, musicTitle, musicPerformerName, musicOriginYear, linkToPlay, reasonToInclude, playlistName);
	}
	

	public void display() {
		System.out.println(this.toString());
	}


}//EOC
