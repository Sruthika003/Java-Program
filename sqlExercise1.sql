create database Exercise;
show databases;
use Exercise;
create table Countries(CountryId int ,  countryName varchar(255), regionId int);
alter table Countries  modify countryId int unique;
insert into Countries values
(1, 'India', 91),
(2,'London', 020),
(3, 'Australia', 61),
(4, 'singapore', 65);
select * from countries;
alter table countries add column CountryMonsoon varchar(25);
select * from countries;
alter table countries drop column CountryMonsoon;
desc countries;
select * from countries;

EXPLAIN SELECT * FROM Countries;
