BEGIN TRANSACTION;
insert into Music ( musicTitle, musicPerformerName, musicOriginYear, playlistID ) 
values  ('Those Were the Days', Mary Hopkin, 1968, 1);
COMMIT;
