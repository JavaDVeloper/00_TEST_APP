CREATE TABLE Playlist
(
	playlistID			integer		    not null	PRIMARY KEY AUTOINCREMENT,
	playlistName		varchar(100)	not null,
	playlistLastUpdate	text            not null,
    userID              integer		    not null    FOREIGN KEY REFERENCES User(userID)
);

SELECT userName FROM User u INNER JOIN Playlist p ON u.userID = p.userID;