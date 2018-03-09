CREATE TABLE Playlist
(
	playlistID			integer		    not null	PRIMARY KEY AUTOINCREMENT,
	playlistName		varchar(100)	not null,
    reasonToInclude	text	not null,
	playlistLastUpdate	text            not null,
    userID              integer		    not null,
    FOREIGN KEY (userID) REFERENCES User(userID)
);