//建表
 CREATE TABLE T_BOOK(
	 BOOKNO varchar(40),
	 BOOKNAME varchar(40),
	 BOOKPRICE float 
 );
 
//插入数据
 INSERT INTO T_BOOK (BOOKNO,BOOKNAME,BOOKPRICE) VALUE(1,'c',58);
 INSERT INTO T_BOOK (BOOKNO,BOOKNAME,BOOKPRICE) VALUE(2,'java',80);
 INSERT INTO T_BOOK (BOOKNO,BOOKNAME,BOOKPRICE) VALUE(3,'c++',65);
 INSERT INTO T_BOOK (BOOKNO,BOOKNAME,BOOKPRICE) VALUE(4,'PHP',66);
 INSERT INTO T_BOOK (BOOKNO,BOOKNAME,BOOKPRICE) VALUE(5,'python',75);
 
 //修改数据
 
 
 //查看数据
select * from T_BOOK; 

//删除表
Drop table T_BOOK;

//删除语句
 delete from T_BOOK where BOOKNO = 1; 
 delete from T_BOOK where BOOKNO = 2; 
 delete from T_BOOK where BOOKNO = 3;

//设置中文
set character_set_client = gb2312;
set character_set_results = gb2312;
set character_set_connection = gb2312;


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

1.insert into store values('学生书包',18.91,101,null);

2.update store price = price + 50 where number > 30;

3.delete from store where price > 60 and number <200;

4.insert into library values('Java核心技术'，Cay S. Horstman，56.43，'计算机技术')；

5.update library set price = 61 where name = 'Java核心技术';


1.select from student where neme like'张%' and age between 18 and 25;

2.select from article where create_date between '2019-1-1 10:30:00' and '2019-11-10 16:02:00';

3.select from article where title is null and create_date > '2019-1-1';

4.select from book where author is not null or (price > 50 and publish_date > '2019-1-1 00:00:00');

5.select from user where accout is not null and (id between 1 and 200 or between 300 and 500)
and amount > 1000;