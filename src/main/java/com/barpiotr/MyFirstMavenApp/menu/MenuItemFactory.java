package com.barpiotr.MyFirstMavenApp.menu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.barpiotr.MyFirstMavenApp.App;
import com.barpiotr.MyFirstMavenApp.music.MusicViewMenuItem;
import com.barpiotr.MyFirstMavenApp.playlist.PlaylistViewMenuItem;
import com.barpiotr.MyFirstMavenApp.user.UserViewMenuItem;

/*
*	This	class	could	be	used	instead	of	the	generic	Factory	class
*/

public class MenuItemFactory {

	private static Logger LOG;

	public MenuItemFactory() {
		LOG = LogManager.getLogger(MenuItemFactory.class);
	}

	public IExecutable getMenuItem(final String className) {
		if ("com.barpiotr.MyFirstMavenApp.playlist.PlaylistViewMenuItem".equals(className)) {
			return (IExecutable) new PlaylistViewMenuItem();
		}
		if ("com.barpiotr.MyFirstMavenApp.music.MusicViewMenuItem".equals(className)) {
			return (IExecutable) new MusicViewMenuItem();
		}
		if ("com.barpiotr.MyFirstMavenApp.user.UserViewMenuItem".equals(className)) {
			return (IExecutable) new UserViewMenuItem();
		}
		// for each menu item take a copy of an if line above change the class it is
		// looking for
		// and the class to use
		// this catches deliberetly undefined menu items and errors
		if ("com.barpiotr.MyFirstMavenAppa.playlist.UndefinedMenuItem".equals(className)) {
			return (IExecutable) new UndefinedMenuItem();
		} else {
			LOG.error("Undefined class	requested" + className);
			return (IExecutable) new UndefinedMenuItem();
		}
	}
}