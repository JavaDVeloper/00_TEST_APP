BEGIN TRANSACTION;
insert into Music ( musicTitle, musicPerformerName, musicOriginYear, linkToPlay, reasonToInclude, userID ) 
values  ('Wild Horses', 'Rolling Stones', 1971, 'https://www.youtube.com/watch?v=ZNaqBBjrIZw', 'Shows how everybody misses their youth', 3);
insert into Music ( musicTitle, musicPerformerName, musicOriginYear, linkToPlay, reasonToInclude, userID ) 
values  ('Auld Lang Syne', 'George Bannatyne', 1568, 'https://www.youtube.com/watch?v=acxnmaVTlZA', 'To show people have always been looking at their past and wandered how it could have been different', 3);
COMMIT;
