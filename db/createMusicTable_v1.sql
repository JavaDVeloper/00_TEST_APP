CREATE TABLE Music
(
	musicID integer not null	PRIMARY KEY AUTOINCREMENT,
	musicTitle varchar(100)	not null,
	musicPerformerName	text            not null,
    musicOriginYear 	integer         not null,
    playlistID          integer		    not null,
    FOREIGN KEY (playlistID) REFERENCES Playlist(playlistID)
);