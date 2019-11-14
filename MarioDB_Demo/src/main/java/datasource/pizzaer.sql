DROP TABLE if exists pizzaer;

create table pizzaer (
id				integer NOT NULL AUTO_INCREMENT,
name			varchar(30),
description		varchar(80),
price			integer,
primary key		(id),
UNIQUE KEY name_UNIQUE (name));

INSERT INTO mario.pizzaer (name, description, price) VALUES ('Vesuvio', 'tomatsauce, ost, skinke, oregano', 57);
INSERT INTO mario.pizzaer (name, description, price) VALUES ('Amerikaner', 'tomatsauce, ost, oksefars, oregano', 53);
INSERT INTO mario.pizzaer (name, description, price) VALUES ('Cacciatore', 'tomatsauce, ost, pepperoni, oregano', 57);
INSERT INTO mario.pizzaer (name, description, price) VALUES ('Carbona', 'tomatsauce, ost, oksefars, oregano', 63);
INSERT INTO mario.pizzaer (name, description, price) VALUES ('Dennis', 'tomatsauce, ost, skinke, pepperoni, cocktailpoelser, oregano', 65);
INSERT INTO mario.pizzaer (name, description, price) VALUES ('Bertil', 'tomatsauce, ost, bacon, oregano', 57);
INSERT INTO mario.pizzaer (name, description, price) VALUES ('Silvia', 'tomatsauce, ost, pepperoni, roed peber, loeg, oliven, oregano', 57);
INSERT INTO mario.pizzaer (name, description, price) VALUES ('Victoria', 'tomatsauce, ost, skinke, ananas, champignon, oregano', 61);
INSERT INTO mario.pizzaer (name, description, price) VALUES ('Toronfo', 'tomatsauce, ost, skinke, bacon, kebab, chilli oregano', 61);
INSERT INTO mario.pizzaer (name, description, price) VALUES ('Capricciosa', 'tomatsauce, ost, skinke, champignon oregano', 61);
INSERT INTO mario.pizzaer (name, description, price) VALUES ('Hawaii', 'tomatsauce, ost, skinke, rejer, oregano', 61);
INSERT INTO mario.pizzaer (name, description, price) VALUES ('LeBlissola', 'tomatsauce, ost, skinke, rejer, oregano', 61);
INSERT INTO mario.pizzaer (name, description, price) VALUES ('Venezia', 'tomatsauce, ost, skinke, bacon, oregano', 61);
INSERT INTO mario.pizzaer (name, description, price) VALUES ('Mafia', 'tomatsauce, ost, skinke, pepperoni, bacon, loeg, oregano', 61);
