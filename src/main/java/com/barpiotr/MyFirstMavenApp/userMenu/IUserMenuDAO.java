package com.barpiotr.MyFirstMavenApp.userMenu;

import java.util.ArrayList;

public interface IUserMenuDAO {
	
	public ArrayList<UserMenu> getAllUsersMenu();
	public UserMenu getUserMenu(int userMenuID);
	public int addUserMenu(UserMenu aUserMenu);
	public void updateUserMenu(UserMenu aUserMenu);
	public void deleteUserMenu(UserMenu aUserMenu);
	public String printUserMenu(int userMenuID);

}
