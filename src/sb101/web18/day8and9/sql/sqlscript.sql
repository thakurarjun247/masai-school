mysql> create database masai;
Query OK, 1 row affected (0.00 sec)

mysql> clear;
mysql> use masai;
Database changed
mysql> create table teachers(teacherid int, teachername varchar(10));
Query OK, 0 rows affected (0.00 sec)

mysql> create table courses(courseid int, coursename varchar(10), teacherid int);
Query OK, 0 rows affected (0.00 sec)

mysql>
mysql>
mysql>
mysql> select * from teachers; select * from courses;
Empty set (0.01 sec)

Empty set (0.00 sec)

mysql>
mysql>
mysql>
mysql> insert into teachers values(1, "t1");
Query OK, 1 row affected (0.00 sec)

mysql> insert into teachers values(2, "t2");
Query OK, 1 row affected (0.00 sec)

mysql> insert into teachers values(3, "t3");
Query OK, 1 row affected (0.00 sec)

mysql> insert into courses values(1, "c1", 1);
Query OK, 1 row affected (0.00 sec)

mysql> insert into courses values(2, "c2", 2);
Query OK, 1 row affected (0.00 sec)

mysql> insert into courses values(3, "c3", 4);
Query OK, 1 row affected (0.00 sec)

mysql> select * from teachers; select * from courses;
+-----------+-------------+
| teacherid | teachername |
+-----------+-------------+
|         1 | t1          |
|         2 | t2          |
|         3 | t3          |
+-----------+-------------+
3 rows in set (0.00 sec)

+----------+------------+-----------+
| courseid | coursename | teacherid |
+----------+------------+-----------+
|        1 | c1         |         1 |
|        2 | c2         |         2 |
|        3 | c3         |         4 |
+----------+------------+-----------+
3 rows in set (0.00 sec)

mysql>
mysql>
mysql>
mysql> select coursename, teachername from courses, teachers where courses.teacherid=teachers.teacherid;
+------------+-------------+
| coursename | teachername |
+------------+-------------+
| c1         | t1          |
| c2         | t2          |
+------------+-------------+
2 rows in set (0.00 sec)

mysql> select coursename, teachername from courses INNER JOIN teachers ON courses.teacherid=teachers.teacherid;
+------------+-------------+
| coursename | teachername |
+------------+-------------+
| c1         | t1          |
| c2         | t2          |
+------------+-------------+
2 rows in set (0.00 sec)

mysql> select coursename, teachername from courses LEFT JOIN teachers ON courses.teacherid=teachers.teacherid;
+------------+-------------+
| coursename | teachername |
+------------+-------------+
| c1         | t1          |
| c2         | t2          |
| c3         | NULL        |
+------------+-------------+
3 rows in set (0.00 sec)

mysql> select * from teachers; select * from courses;
+-----------+-------------+
| teacherid | teachername |
+-----------+-------------+
|         1 | t1          |
|         2 | t2          |
|         3 | t3          |
+-----------+-------------+
3 rows in set (0.00 sec)

+----------+------------+-----------+
| courseid | coursename | teacherid |
+----------+------------+-----------+
|        1 | c1         |         1 |
|        2 | c2         |         2 |
|        3 | c3         |         4 |
+----------+------------+-----------+
3 rows in set (0.00 sec)

mysql> select coursename, teachername from courses RIGHT JOIN teachers ON courses.teacherid=teachers.teacherid;
+------------+-------------+
| coursename | teachername |
+------------+-------------+
| c1         | t1          |
| c2         | t2          |
| NULL       | t3          |
+------------+-------------+
3 rows in set (0.00 sec)

mysql> (LEFT JOIN QUERY) union (right join query);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'LEFT JOIN QUERY) union (right join query)' at line 1
mysql> (select coursename, teachername from courses LEFT JOIN teachers ON courses.teacherid=teachers.teacherid) UNION (select coursename, teachername from courses RIGHT JOIN teachers ON courses.teacherid=teachers.teacherid);
+------------+-------------+
| coursename | teachername |
+------------+-------------+
| c1         | t1          |
| c2         | t2          |
| c3         | NULL        |
| NULL       | t3          |
+------------+-------------+
4 rows in set (0.00 sec)

mysql> select * from courses RIGHT JOIN teachers ON courses.teacherid=teachers.teacherid;
+----------+------------+-----------+-----------+-------------+
| courseid | coursename | teacherid | teacherid | teachername |
+----------+------------+-----------+-----------+-------------+
|        1 | c1         |         1 |         1 | t1          |
|        2 | c2         |         2 |         2 | t2          |
|     NULL | NULL       |      NULL |         3 | t3          |
+----------+------------+-----------+-----------+-------------+
3 rows in set (0.00 sec)

mysql> create table source (id int, name varchar(5));
Query OK, 0 rows affected (0.01 sec)

mysql> create table destination (id int, name varchar(5));
Query OK, 0 rows affected (0.01 sec)

mysql> insert into source values(1, "one"), (2, "two");
Query OK, 2 rows affected (0.00 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> select * from source;
+------+------+
| id   | name |
+------+------+
|    1 | one  |
|    2 | two  |
+------+------+
2 rows in set (0.00 sec)

mysql> select * from destination;
Empty set (0.00 sec)

mysql> insert into destination values(select * from source);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'select * from source)' at line 1
mysql> insert into destination (select * from source);
Query OK, 2 rows affected (0.00 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> select * from destination;
+------+------+
| id   | name |
+------+------+
|    1 | one  |
|    2 | two  |
+------+------+
2 rows in set (0.00 sec)

mysql> create table offices(officecode int, country varchar(10));
Query OK, 0 rows affected (0.00 sec)

mysql> insert into offices values (1, "India");
Query OK, 1 row affected (0.00 sec)

mysql> create table newoffices(officecode int, country varchar(10));
Query OK, 0 rows affected (0.01 sec)

mysql> insert into newoffices values (2, "UK");
Query OK, 1 row affected (0.00 sec)

mysql> insert into newoffices values (3, "USA");
Query OK, 1 row affected (0.00 sec)

mysql> select * from offices; select * from newoffices;
+------------+---------+
| officecode | country |
+------------+---------+
|          1 | India   |
+------------+---------+
1 row in set (0.00 sec)

+------------+---------+
| officecode | country |
+------------+---------+
|          2 | UK      |
|          3 | USA     |
+------------+---------+
2 rows in set (0.00 sec)

mysql> insert into newoffices (select * from offices);
Query OK, 1 row affected (0.00 sec)
Records: 1  Duplicates: 0  Warnings: 0

mysql> select * from offices; select * from newoffices;
+------------+---------+
| officecode | country |
+------------+---------+
|          1 | India   |
+------------+---------+
1 row in set (0.00 sec)

+------------+---------+
| officecode | country |
+------------+---------+
|          2 | UK      |
|          3 | USA     |
|          1 | India   |
+------------+---------+
3 rows in set (0.00 sec)

mysql> create table employee(firstname varchar(5), lastname varchar(5), officecode int);
Query OK, 0 rows affected (0.01 sec)

mysql> insert into employee values("f1", "l1", 1);
Query OK, 1 row affected (0.00 sec)

mysql> insert into employee values("f2", "l2", 2);
Query OK, 1 row affected (0.01 sec)

mysql> insert into employee values("f3", "l3", 2);
Query OK, 1 row affected (0.00 sec)

mysql> select firstname from employee;
+-----------+
| firstname |
+-----------+
| f1        |
| f2        |
| f3        |
+-----------+
3 rows in set (0.00 sec)

mysql> select * from employee;
+-----------+----------+------------+
| firstname | lastname | officecode |
+-----------+----------+------------+
| f1        | l1       |          1 |
| f2        | l2       |          2 |
| f3        | l3       |          2 |
+-----------+----------+------------+
3 rows in set (0.00 sec)

mysql> select * from newoffices;
+------------+---------+
| officecode | country |
+------------+---------+
|          2 | UK      |
|          3 | USA     |
|          1 | India   |
+------------+---------+
3 rows in set (0.00 sec)

mysql> select firstname from employee where officecode in (2);
+-----------+
| firstname |
+-----------+
| f2        |
| f3        |
+-----------+
2 rows in set (0.00 sec)

mysql> select firstname from employee where officecode in (select officecode from newoffices where country = "UK");
+-----------+
| firstname |
+-----------+
| f2        |
| f3        |
+-----------+
2 rows in set (0.00 sec)

mysql> select firstname from employee INNER JOIN newoffices on employee.officecode = newoffices.officecode where newoffices.country = "UK";
+-----------+
| firstname |
+-----------+
| f2        |
| f3        |
+-----------+
2 rows in set (0.01 sec)

mysql> select firstname from employee where officecode in (select officecode from newoffices where country = ("UK" OR "India"));
+-----------+
| firstname |
+-----------+
| f1        |
| f2        |
| f3        |
+-----------+
3 rows in set, 4 warnings (0.00 sec)

mysql> select * from newoffices;
+------------+---------+
| officecode | country |
+------------+---------+
|          2 | UK      |
|          3 | USA     |
|          1 | India   |
+------------+---------+
3 rows in set (0.00 sec)

mysql> select country from newoffices where officecode= (2 OR 3);
+---------+
| country |
+---------+
| India   |
+---------+
1 row in set (0.00 sec)

mysql> select country from newoffices where officecode 2;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '2' at line 1
mysql> select country from newoffices where officecode = 2;
+---------+
| country |
+---------+
| UK      |
+---------+
1 row in set (0.00 sec)

mysql> select country from newoffices where officecode = 3;
+---------+
| country |
+---------+
| USA     |
+---------+
1 row in set (0.00 sec)

mysql> select country from newoffices where officecode in (2,3);
+---------+
| country |
+---------+
| UK      |
| USA     |
+---------+
2 rows in set (0.00 sec)

mysql> select * from newoffices where officecode in (2,3);
+------------+---------+
| officecode | country |
+------------+---------+
|          2 | UK      |
|          3 | USA     |
+------------+---------+
2 rows in set (0.00 sec)

mysql> select * from newoffices where officecode in (2,3,1);
+------------+---------+
| officecode | country |
+------------+---------+
|          2 | UK      |
|          3 | USA     |
|          1 | India   |
+------------+---------+
3 rows in set (0.00 sec)

//Indexing

mysql> create table person(id int, firstname varchar(20), lastname varchar(20), age int, primary key (id));
Query OK, 0 rows affected (0.01 sec)

mysql> insert into person values (null, "Agnieszka", "Stepniak", 29);
ERROR 1048 (23000): Column 'id' cannot be null
mysql> insert into person values (1, "Agnieszka", "Stepniak", 29);
Query OK, 1 row affected (0.00 sec)

mysql> insert into person values (1, "Yuvan", "Thakur", 5);
ERROR 1062 (23000): Duplicate entry '1' for key 'person.PRIMARY'
mysql> insert into person values (2, "Yuvan", "Thakur", 5);
Query OK, 1 row affected (0.00 sec)

mysql> select * from person;
+----+-----------+----------+------+
| id | firstname | lastname | age  |
+----+-----------+----------+------+
|  1 | Agnieszka | Stepniak |   29 |
|  2 | Yuvan     | Thakur   |    5 |
+----+-----------+----------+------+
2 rows in set (0.00 sec)

mysql> select * from person where id =1;
+----+-----------+----------+------+
| id | firstname | lastname | age  |
+----+-----------+----------+------+
|  1 | Agnieszka | Stepniak |   29 |
+----+-----------+----------+------+
1 row in set (0.00 sec)

mysql> select * from person where age =5;
+----+-----------+----------+------+
| id | firstname | lastname | age  |
+----+-----------+----------+------+
|  2 | Yuvan     | Thakur   |    5 |
+----+-----------+----------+------+
1 row in set (0.00 sec)

mysql> CREATE INDEX idx_lastname ON person(lastname);
Query OK, 0 rows affected (0.01 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select * from person where last name is "Stepniak";
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'name is "Stepniak"' at line 1
mysql> select * from person where lastname is "Stepniak";
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '"Stepniak"' at line 1
mysql> select * from person where lastname = "Stepniak";
+----+-----------+----------+------+
| id | firstname | lastname | age  |
+----+-----------+----------+------+
|  1 | Agnieszka | Stepniak |   29 |
+----+-----------+----------+------+
1 row in set (0.00 sec)

mysql> DROP INDEX idx_lastname on person;
Query OK, 0 rows affected (0.00 sec)
Records: 0  Duplicates: 0  Warnings: 0

//Primary key => non null values, unique values
//DELETE(dml) =>delete from <tablename> : deletes specified (if using where clause) or all the rows from a table;
//Truncate(ddl) => truncate TABLE <tablename> =>deletes all the rows. But doesn't delete the table schema, index, PK, FK.
//DROP(ddl) =>DROP TABLE <tablename>:  remove the table.



mysql> create table parent (id int, primary key (id));
Query OK, 0 rows affected (0.01 sec)

mysql> create table child(id int, parent_id int, foreign key (parent_id) references parent(id) );
Query OK, 0 rows affected (0.00 sec)

mysql> insert into parent values (1);
Query OK, 1 row affected (0.00 sec)

mysql> insert into child values(1, null);
Query OK, 1 row affected (0.00 sec)

mysql> select * from parent; select * from child;
+----+
| id |
+----+
|  1 |
+----+
1 row in set (0.00 sec)

+------+-----------+
| id   | parent_id |
+------+-----------+
|    1 |      NULL |
+------+-----------+
1 row in set (0.00 sec)

mysql> insert into child values(1, 1);
Query OK, 1 row affected (0.14 sec)

mysql> select * from parent; select * from child;
+----+
| id |
+----+
|  1 |
+----+
1 row in set (0.00 sec)

+------+-----------+
| id   | parent_id |
+------+-----------+
|    1 |      NULL |
|    1 |         1 |
+------+-----------+
2 rows in set (0.00 sec)

mysql> insert into child values(10, 20);
ERROR 1452 (23000): Cannot add or update a child row: a foreign key constraint fails (`masai`.`child`, CONSTRAINT `child_ibfk_1` FOREIGN KEY (`parent_id`) REFERENCES `parent` (`id`))
mysql> insert into parent values(20);
Query OK, 1 row affected (0.00 sec)

mysql> insert into child values(10, 20);
Query OK, 1 row affected (0.00 sec)

mysql> select * from parent; select * from child;
+----+
| id |
+----+
|  1 |
| 20 |
+----+
2 rows in set (0.00 sec)

+------+-----------+
| id   | parent_id |
+------+-----------+
|    1 |      NULL |
|    1 |         1 |
|   10 |        20 |
+------+-----------+
3 rows in set (0.00 sec)

mysql> delete from parent where id =1;
ERROR 1451 (23000): Cannot delete or update a parent row: a foreign key constraint fails (`masai`.`child`, CONSTRAINT `child_ibfk_1` FOREIGN KEY (`parent_id`) REFERENCES `parent` (`id`))
mysql> delete from child where parent_id =1;
Query OK, 1 row affected (0.00 sec)

mysql> select * from parent; select * from child;
+----+
| id |
+----+
|  1 |
| 20 |
+----+
2 rows in set (0.00 sec)

+------+-----------+
| id   | parent_id |
+------+-----------+
|    1 |      NULL |
|   10 |        20 |
+------+-----------+
2 rows in set (0.00 sec)

mysql> delete from parent where id =1;
Query OK, 1 row affected (0.00 sec)

mysql> select * from parent; select * from child;
+----+
| id |
+----+
| 20 |
+----+
1 row in set (0.00 sec)

+------+-----------+
| id   | parent_id |
+------+-----------+
|    1 |      NULL |
|   10 |        20 |
+------+-----------+
2 rows in set (0.00 sec)

mysql> delete from child;
Query OK, 2 rows affected (0.00 sec)

mysql> select * from person;
+----+-----------+----------+------+
| id | firstname | lastname | age  |
+----+-----------+----------+------+
|  1 | Agnieszka | Stepniak |   29 |
|  2 | Yuvan     | Thakur   |    5 |
+----+-----------+----------+------+
2 rows in set (0.00 sec)

mysql> truncate table person;
Query OK, 0 rows affected (0.01 sec)

mysql> select * from person;
Empty set (0.00 sec)

mysql> drop table person;
Query OK, 0 rows affected (0.01 sec)

mysql> select * from person;
ERROR 1146 (42S02): Table 'masai.person' doesn't exist
mysql> select * from item;
ERROR 1146 (42S02): Table 'masai.item' doesn't exist
mysql> use test;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> select * from item;
+------+-------+
| name | price |
+------+-------+
| abc  |    10 |
| axc  |    10 |
| axy  |    10 |
| ax   |    10 |
+------+-------+
4 rows in set (0.00 sec)

mysql> select Name from item where name like 'a_c';
+------+
| Name |
+------+
| abc  |
| axc  |
+------+
2 rows in set (0.00 sec)

mysql> select Name from item where name like '%c';
+------+
| Name |
+------+
| abc  |
| axc  |
+------+
2 rows in set (0.00 sec)

mysql> select count(*) from item;
+----------+
| count(*) |
+----------+
|        4 |
+----------+
1 row in set (0.01 sec)

mysql> select * from item;
+------+-------+
| name | price |
+------+-------+
| abc  |    10 |
| axc  |    10 |
| axy  |    10 |
| ax   |    10 |
+------+-------+
4 rows in set (0.00 sec)

mysql> insert into item values("ax", 20);
Query OK, 1 row affected (0.00 sec)

mysql> select count(*) from item where price =10;
+----------+
| count(*) |
+----------+
|        4 |
+----------+
1 row in set (0.00 sec)

mysql> select * from item;
+------+-------+
| name | price |
+------+-------+
| abc  |    10 |
| axc  |    10 |
| axy  |    10 |
| ax   |    10 |
| ax   |    20 |
+------+-------+
5 rows in set (0.00 sec)

mysql> select count(*) from item where price =20;
+----------+
| count(*) |
+----------+
|        1 |
+----------+
1 row in set (0.00 sec)

mysql> insert into item values("zz", 30);
Query OK, 1 row affected (0.01 sec)

mysql> insert into item values("zz", 40);
Query OK, 1 row affected (0.00 sec)

mysql> select * from item;
+------+-------+
| name | price |
+------+-------+
| abc  |    10 |
| axc  |    10 |
| axy  |    10 |
| ax   |    10 |
| ax   |    20 |
| zz   |    30 |
| zz   |    40 |
+------+-------+
7 rows in set (0.00 sec)

mysql> select * from item order by name;
+------+-------+
| name | price |
+------+-------+
| abc  |    10 |
| ax   |    10 |
| ax   |    20 |
| axc  |    10 |
| axy  |    10 |
| zz   |    30 |
| zz   |    40 |
+------+-------+
7 rows in set (0.00 sec)

mysql> select * from item order by name asc;
+------+-------+
| name | price |
+------+-------+
| abc  |    10 |
| ax   |    10 |
| ax   |    20 |
| axc  |    10 |
| axy  |    10 |
| zz   |    30 |
| zz   |    40 |
+------+-------+
7 rows in set (0.00 sec)

mysql> select * from item order by name desc;
+------+-------+
| name | price |
+------+-------+
| zz   |    30 |
| zz   |    40 |
| axy  |    10 |
| axc  |    10 |
| ax   |    10 |
| ax   |    20 |
| abc  |    10 |
+------+-------+
7 rows in set (0.00 sec)

mysql> select * from item order by name desc, price desc;
+------+-------+
| name | price |
+------+-------+
| zz   |    40 |
| zz   |    30 |
| axy  |    10 |
| axc  |    10 |
| ax   |    20 |
| ax   |    10 |
| abc  |    10 |
+------+-------+
7 rows in set (0.00 sec)

mysql> desc item;
+-------+-------------+------+-----+---------+-------+
| Field | Type        | Null | Key | Default | Extra |
+-------+-------------+------+-----+---------+-------+
| name  | varchar(10) | YES  |     | NULL    |       |
| price | int         | YES  |     | NULL    |       |
+-------+-------------+------+-----+---------+-------+
2 rows in set (0.01 sec)

mysql> select * from item where name like='a%';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '='a%'' at line 1
mysql> select * from item where name like = 'a%';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '= 'a%'' at line 1
mysql> select * from item where name like 'a%';
+------+-------+
| name | price |
+------+-------+
| abc  |    10 |
| axc  |    10 |
| axy  |    10 |
| ax   |    10 |
| ax   |    20 |
+------+-------+
5 rows in set (0.00 sec)

mysql> select * from item;
+------+-------+
| name | price |
+------+-------+
| abc  |    10 |
| axc  |    10 |
| axy  |    10 |
| ax   |    10 |
| ax   |    20 |
| zz   |    30 |
| zz   |    40 |
+------+-------+
7 rows in set (0.00 sec)

mysql> select * from item limit 2;
+------+-------+
| name | price |
+------+-------+
| abc  |    10 |
| axc  |    10 |
+------+-------+
2 rows in set (0.00 sec)


