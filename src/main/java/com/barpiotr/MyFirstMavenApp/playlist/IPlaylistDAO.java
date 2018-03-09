package com.barpiotr.MyFirstMavenApp.playlist;

/**
 * Date: 2018-03-04
 * 
 * @author: Piotr Bar
 */

import java.util.ArrayList;

public interface IPlaylistDAO {
	
	public ArrayList<Playlist> getAllPlaylists();
	public Playlist getPlaylist(int playlistID);
	public int addPlaylist(Playlist aPlaylist);
	public void updatePlaylist(Playlist aPlaylist);
	public void deletePlaylist(Playlist aPlaylist);
	public String printPlaylist(int playlistID);

}
