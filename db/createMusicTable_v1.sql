CREATE TABLE Music
(
	musicID integer not null	PRIMARY KEY AUTOINCREMENT,
	musicTitle varchar(100)	not null,
	musicPerformerName	text            not null,
    musicOriginYear 	integer         not null,
    linkToPlay varchar(100)	not null,
    reasonToInclude text not null,
    userID          integer		    not null,
    FOREIGN KEY (userID) REFERENCES User(userID)
);