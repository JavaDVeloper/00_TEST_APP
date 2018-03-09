CREATE TABLE User
(
	userID			integer		    not null	PRIMARY KEY AUTOINCREMENT,
	userFirstName	varchar(100)	not null,
    userLastName	varchar(100)	not null,
	userEmail		varchar(100)	not null,
	userLastUpdate	text not null
);
