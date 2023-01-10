create database data;
use data;
create table job(
jobId int primary key auto_increment,
jobTitle varchar(230),
jobName varchar(200)
);
drop table job;


desc table job;
insert into job (jobTitle,jobName) values("MTS", "Heaxaview Technology"),("SDE", "Heaxaview Technology");

select * from job;
create table Supplier(
jobId int primary key auto_increment,
supplier varchar(230),
supplierName varchar(200)
);
SET SQL_SAFE_UPDATES = 0;
select * from supplier;
insert into supplier  select * from job;
update  supplier set supplier ="Application Engineer" where supplier="MTS";

select * from Supplier;

select jobId , jobTitle, jobName,
 case jobTitle
     when jobTitle='MTS' then 'Member of Technical Staff'
     when jobTitle='SDE' then 'Software Development Engineer'
     else "You are welcome"
end as JobPosition
from job;

use world;
desc city;
desc country;
desc countrylanguage;
select * from country;
select * from countrylanguage;
Select countrycode, count(language) from Countrylanguage group by countrycode;


select country.name, country.population,countrylanguage.Percentage from Country 
inner join 
countrylanguage
on 
country.code=countrylanguage.CountryCode limit 10;


select * from country where code like "A_A";