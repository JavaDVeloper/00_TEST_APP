BEGIN TRANSACTION;
insert into Playlist ( playlistName, reasonToInclude, playlistLastUpdate, userID ) 
values  ('Bob Dylan - the Poet!', 'To show that songs can be also the Poetry', datetime('now'), 1);
insert into Playlist ( playlistName, reasonToInclude, playlistLastUpdate, userID ) 
values  ('HITs Gealic version', 'To popularize Irish language amoung youths', datetime('now'), 2);
insert into Playlist ( playlistName, reasonToInclude, playlistLastUpdate, userID ) 
values  ('Looking at the past', 'To show how people miss their youth', datetime('now'), 3);
COMMIT;
