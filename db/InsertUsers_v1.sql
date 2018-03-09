BEGIN TRANSACTION;
insert into User ( userFirstName, userLastName, userEmail, userLastUpdate ) 
values  ('Andrew', 'Green', 'a.green@hotmail.com', datetime('now'));
insert into User ( userFirstName, userLastName, userEmail, userLastUpdate ) 
values  ('John', 'Smith', 'johnny78@gmail.com', datetime('now'));
insert into User ( userFirstName, userLastName, userEmail, userLastUpdate ) 
values  ('Rebecca', 'Johnson', 'becky_johnson@yahoo.com', datetime('now'));
COMMIT;
