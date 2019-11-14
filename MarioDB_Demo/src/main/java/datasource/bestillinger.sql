DROP TABLE if exists pizzabestillinger;

create table pizzabestillinger (
id				integer NOT NULL AUTO_INCREMENT,
name			varchar(30),
description		varchar(80),
price			int,
primary key		(id)
)