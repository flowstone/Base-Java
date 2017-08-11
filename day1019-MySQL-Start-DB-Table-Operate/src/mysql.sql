/*登录数据库*/
mysql[-h 连接的主机ip -P 端口号] -u root -p

/* 查询当前所有的数据库*/
show databases;

/*显示创建的数据库*/
show CREATE database mysql;

/*创建数据库*/
CREATE database  数据库名;

/*指定创建数据库的编码集*/
CREATE database 数据库名 CHARACTER SET utf8;
CREATE database 数据库名 charset=utf8;

/*删除数据库*/
DROP database mydb1;

/*修改数据库的字符集*/
ALTER database 数据库名称 CHARACTER SET 字符集;

/*显示当前数据库*/
SELECT database();

/*使用数据库*/
USE  数据库;

/*数据表操作*/
/*创建表*/
CREATE TABLE 表名(
	列名  数据类型,
	列名  数据类型,
	列名  数据类型
);

CREATE TABLE IF NOT EXISTS emp(
	id INT,
	name VARCHAR(20),
	age INT,
	gender INT,
	birthday DATE
)CHARACTER SET utf8;

SHOW TABLES;

/*显示表的结构*/
SHOW COLUMNS FROM emp;
DESC emp;

SHOW CREATE TABLE emp;


CREATE TABLE emp2(
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(20) UNIQUE,
	age INT NOT NULL,
	gender INT,
	birthday DATE,
	address VARCHAR(30) UNIQUE NOT NULL
)CHARACTER SET utf8;

/*增加列*/
ALTER TABLE emp2 ADD salary DOUBLE;

/*修改列*/
ALTER TABLE emp2  MODIFY name VARCHAR(30) UNIQUE;

/*修改列名*/
ALTER TABLE emp2 CHANGE name username VARCHAR(30) UNIQUE;

/*删除列*/
ALTER TABLE emp2 DROP age;

/*修改表名*/
RENAME TABLE emp2 TO employee;

/*修改表的字符集*/
ALTER TABLE employee CHARACTER SET utf8;

/*删除表*/
DROP TABLE emp;

/**数据记录的CRUD**/
/**/
INSERT INTO 表名(列名,列名) VALUES(值,值);
INSERT INTO 表名 VALUES(值,值),(值,值);
CREATE TABLE user(
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(30) NOT NULL,
	age INT NOT NULL,
	gender INT,
	birthday DATE,
	address VARCHAR(30) NOT NULL UNIQUE
)CHARACTER SET utf8;

INSERT INTO user(id,name,age,gender,birthday,address) VALUES(null,'小明',5,1,'2012-12-12','南京东路108号');

SHOW VARIABLES LIKE 'characte	r%';
/*设置CMD Client 的字符集*/
SET CHARACTER SET gbk;

/*修改表记录*/
UPDATE 表名 SET 列名=值,列名=值[WHERE 条件语句]
UPDATE user SET age = 20;
UPDATE user SET age = 18 WHERE name='张三';

/*删除表中数据*/
DELETE FROM 表名[WHERE 条件语句]

TRUNCATE TABLE 表名;

/*开启事务*/
START TRANSACTION;

