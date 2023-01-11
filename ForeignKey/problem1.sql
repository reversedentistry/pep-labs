CREATE TABLE post (id SERIAL PRIMARY KEY, post varchar(255), user_fk int REFERENCES "User"(id)); 

-- CREATE TABLE post (id SERIAL PRIMARY KEY, post varchar(255), user_fk int, FOREIGN KEY (user_fk) REFERENCES "User"(id)); 
-- CREATE TABLE "User" (id SERIAL PRIMARY KEY, firstname varchar(100), lastname varchar(100)); 
