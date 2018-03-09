package com.barpiotr.MyFirstMavenApp.userMenu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.barpiotr.MyFirstMavenApp.data.IDataManager;

public class UserMenuDAO implements IUserMenuDAO {
	
	//DATA
	//...............................
	private IDataManager dataManager;
	
	//This is added to every class that needs to log with one change
	//The getLogger() part should contain the name of the class it's in
	//So you know the messages that came from objects of this class
	
	private final Logger LOG = LogManager.getLogger(UserMenuDAO.class);
	
	//CONSTRUCTORS
	//........................
	
	public UserMenuDAO(IDataManager dataManager) {
		this.dataManager = dataManager;
	}
	
	//METHODS
	//........................
	
	public ArrayList<UserMenu> getAllUsersMenu(){
		ArrayList<UserMenu> userMenuList = new ArrayList<UserMenu>();
		
		//Get JDBC connection to database
		Connection connection = null;
		
		try {
			//get a database connection
			connection = this.dataManager.getConnectionObject();
			
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30); //set timeout to 30 sec.
			
			//Run the query
			
			ResultSet resultSet = statement.executeQuery("select userID from user");
			
			//iterate through the results create User objects put in the ListArray
			
			while(resultSet.next()) {
				
				UserMenu userMenu = new UserMenu(
						resultSet.getInt("userID")
						);
				//putting the user objects into the list but not using them
				userMenuList.add(userMenu);
				
				//print the results by using the toString() on User
				LOG.debug("UserMenu object: "+userMenu);
				
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
		return userMenuList;
	
	}//EOM
	
	public UserMenu getUserMenu(int userID) {
		throw new UnsupportedOperationException();
	}
	
	public int addUserMenu(UserMenu aUserMenu) {
		throw new UnsupportedOperationException();
	}
	
	public void updateUserMenu(UserMenu aUserMenu) {
		throw new UnsupportedOperationException();
	}
	
	public void deleteUserMenu(UserMenu aUserMenu) {
		throw new UnsupportedOperationException();
	}
	
	public String printUserMenu(int userMenuID) {
		throw new UnsupportedOperationException();
	}
	
}
