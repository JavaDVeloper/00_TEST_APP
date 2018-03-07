CREATE TABLE Playlist
(
	playlistID			integer		    not null	PRIMARY KEY AUTOINCREMENT,
	playlistName		varchar(100)	not null,
	playlistLastUpdate	text            not null,
    userID              integer		    not null,
    FOREIGN userID KEY REFERENCES User(userID)
);