create table buyers (id bigserial, nickName varchar(255), name varchar(255), lastname varchar(255), password varchar(255), email varchar(255), phoneNumber varchar(255), primary key (id));
insert into buyers (nickName, name, lastname, password, email, phoneNumber) values
('Buyer1','Emmet', 'Braun', '123', 'Braun@mail.ru','8-999-99-99'),
('Buyer2','Marty', 'MacFly', '123', 'MacFly@mail.ru','8-888-88-88');

create table sellers (id bigserial, nickName varchar(255), name varchar(255), lastname varchar(255), password varchar(255), email varchar(255), phoneNumber varchar(255), primary key (id));
insert into sellers (nickName, name, lastname, password, email, phoneNumber) values
('Seller1','John','Silverhand','123','Silverhand@mail.ru','8-999-99-99'),
('Seller2','Jack', 'Daniels', '123', 'Daniels@mail.ru','8-999-99-99');

create table products (id bigserial, typeOfAnimal varchar(255),breed varchar(255),nickname varchar(255), age integer,cost integer, sellers_id bigint REFERENCES sellers (id), primary key(id));
insert into products (typeOfAnimal, breed, nickname, age, cost, sellers_id) values
('Dog', 'American Boxer', 'Killer', 3, 200, 1),
('Cat', 'Child of streets', 'Tom', 1, 10, 2);

