BEGIN TRANSACTION;
insert into Playlist ( playlistName, playlistLastUpdate, userID ) 
values  ('Childhood memories', datetime('now'),1);
COMMIT;
