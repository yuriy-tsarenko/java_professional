/*Задание 2
Создать базу данных с именем “my_db”.*/
create database task_1;
/*Задание 3
В созданной базе данных (из задания 2) создать 3 таблицы:
1-я содержит имена и номера телефонов сотрудников некой компании,
2-я содержит ведомости об их зарплате, и должностях,
3-я содержит информацию о семейном положении, дате рождения и месте проживания.*/
use task_1;
CREATE TABLE Persons (
   PersonID int,
   _Name varchar(255),
   _Number varchar(255)
);
CREATE TABLE PersonsData (
   PersonID int,
   Salary varchar(255),
   Position varchar(255)
);
CREATE TABLE PrivateData (
   PersonID int,
   _Status varchar(255),
   Birthday varchar(255),
   Address varchar(255)
);
insert into Persons(PersonID, _Name, _Number)
values (1,'John1', '09993241'),
(2,'John2', '09993242'),
(3,'John3', '09993243'),
(4,'John4', '09993244'),
(5,'John5', '09993245'),
(6,'John6', '09993246'),
(7,'John7', '09993247'),
(8,'John8', '09993248'),
(9,'John9', '09993248'),
(10,'John10', '09993250');
insert into PersonsData(PersonID, Salary, Position)
values (1,'1000000000', 'SEO'),
(2,'1000', 'Enginner1'),
(3,'10000', 'Enginner2'),
(4,'5768', 'Enginner3'),
(5,'435345', 'Enginner4'),
(6,'34534534', 'Enginner5'),
(7,'34534', 'Enginner6'),
(8,'6666', 'Enginner7'),
(9,'4', 'Enginner8'),
(10,'33232323', 'Enginner9');
insert into PrivateData(PersonID, _Status, Birthday, Address)
values (1,'+', '29.02.70','Street'),
(2,'+', '29.02.70','Street'),
(3,'-', '29.02.70','Street'),
(4,'-', '29.02.70','Street'),
(5,'-', '29.02.70','Street'),
(6,'-', '29.02.70','Street'),
(7,'-', '29.02.70','Street'),
(8,'+', '29.02.70','Street'),
(9,'+', '29.02.70','Street'),
(10,'+', '29.02.70','Street');
/*Задание 4
Из задания 3 таблицы 2 получить id сотрудников, зарплата которых больше 10000.*/
select *
from PersonsData
where Salary>10000;
/*Задание 5
Из задания 3 сотрудник по id 1 был не женат, изменить данные в третьей таблице о семейном положении.*/
update PrivateData
set _Status='-'
where PersonID =1;
/*RIGHT JOIN by ID*/
SELECT Persons.PersonID, Persons._Name, Persons._Number, PersonsData.Salary, PersonsData.Position, PrivateData._Status, PrivateData.Birthday, PrivateData.Address
FROM Persons
RIGHT JOIN PersonsData
ON Persons.PersonID = PersonsData.PersonID
RIGHT JOIN PrivateData
ON Persons.PersonID = PrivateData.PersonID;

