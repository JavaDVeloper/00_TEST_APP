package com.barpiotr.MyFirstMavenApp.playlist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.barpiotr.MyFirstMavenApp.data.IDataManager;

public class PlaylistDAO implements IPlaylistDAO {
	
	//DATA
	//...............................
	private IDataManager dataManager;
	
	//This is added to every class that needs to log with one change
	//The getLogger() part should contain the name of the class it's in
	//So you know the messages that came from objects of this class
	
	private final Logger LOG = LogManager.getLogger(PlaylistDAO.class);
	
	//CONSTRUCTORS
	//........................
	
	public PlaylistDAO(IDataManager dataManager) {
		this.dataManager = dataManager;
	}
	
	//METHODS
	//........................
	
	public ArrayList<Playlist> getAllPlaylists(){
		ArrayList<Playlist> playlistList = new ArrayList<Playlist>();
		
		//Get JDBC connection to database
		Connection connection = null;
		
		try {
			//get a database connection
			connection = this.dataManager.getConnectionObject();
			
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30); //set timeout to 30 sec.
			
			//Run the query
			
			ResultSet resultSet = statement.executeQuery("select * from playlist");
			
			Statement statement2 = connection.createStatement();
			statement2.setQueryTimeout(30); //set timeout to 30 sec.
			
			ResultSet resultSet2 = statement2.executeQuery("select userName FROM User u INNER JOIN Playlist p ON u.userID = p.userID");
			
			//iterate through the results create playlist objects put in the ListArray
			
			while(resultSet.next()) {
				
				Playlist playlist = new Playlist(
						resultSet.getInt("playlistID"),
						resultSet.getString("playlistName"),
						resultSet.getString("playlistLastUpdate"),
						//resultSet.getInt("userID")
						resultSet2.getString("userName")
						);

				//putting the playlist objects into the list but not using them
				playlistList.add(playlist);
				
				//print the results by using the toString() on User
				LOG.debug("Playlist object: "+playlist);
			}
		}
		catch(SQLException e)
		{
			//if the error message is "out of memory"
			//it probably means no database file is found
			LOG.error(e.getMessage());
		}
		finally
		{
			try
			{
				if(connection != null) {
					this.dataManager.disconnect();
				}
			}
			catch(SQLException e) {
				//connection close failed
				LOG.error(e.getMessage());
			}
		}
		return playlistList;
	
	}//EOM
	
	public Playlist getPlaylist(int playlistID) {
		throw new UnsupportedOperationException();
	}
	
	public int addPlaylist(Playlist aPlaylist) {
		throw new UnsupportedOperationException();
	}
	
	public void updatePlaylist(Playlist aPlaylist) {
		throw new UnsupportedOperationException();
	}
	
	public void deletePlaylist(Playlist aPlaylist) {
		throw new UnsupportedOperationException();
	}
	
	public String printPlaylist(int playlistID) {
		throw new UnsupportedOperationException();
	}
}
