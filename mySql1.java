mysql -u root -p;
show databases;
use tablename;
select * from timetest;

create table timetest(
	id int,
	datetimefield datetime,		//默认为空
	timestampfield timestamp	//默认当前时间
);

insert into timetest values(1,'2019-12-24 08:00:01','2019-12-23 08:01:02');

insert into timetest(id,datetimefield) values(2,'1997-07-23 10:12:23');

insert into timetest(id,timestampfield) values(3,'2001-01-01 01:01:01');

//标识符遇到关键字，反引号
create table `select`(
	id int
);

//查找系统变量
show variables like 'char%';

show variables like 'collation%';


create table stu_constraint(
	id int primary key,
	sn int unique,
	name varchar(20) not null
);

insert into stu_constraint values(1,17060208,'changcheng');

create table student(
	sn int primary key,
	name varchar(20)
);

create table teacher(
	tn int primary key,
	name varchar(20)
);

#mysql单行注解

/*
多行注解
*/

//练习
create table staff(
	id int primary key,
	name varchar(20),
	age int,
	In_time timestamp,
	Out_time timestamp,
	zhuangtai varchar(20)
);

create table check(
	id int primary key,
	zhuangtai varchar(20) primary key
);



