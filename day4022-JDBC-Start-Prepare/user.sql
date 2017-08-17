CREATE TABLE  user(
	id VARCHAR(10) PRIMARY KEY  COMMENT '用户id',
	username VARCHAR(20) NOT NULL DEFAULT '' COMMENT '用户名',
	password VARCHAR(20) NOT NULL DEFAULT '' COMMENT '密码',
	age TINYINT NOT NULL DEFAULT 0 COMMENT '年龄'
) CHARACTER SET utf8 COMMENT '用户表';

INSERT INTO user VALUES('111','admin','123456',18);
INSERT INTO user VALUES('222','root','123',19);


-- 创建一张学生表(id，姓名，性别)
CREATE TABLE IF NOT EXISTS student(
	id INT AUTO_INCREMENT COMMENT '学生id',
	name VARCHAR(20) NOT NULL DEFAULT '' COMMENT '姓名',
	gender CHAR   COMMENT '性别',
	PRIMARY KEY (id)
)CHARACTER SET utf8 COMMENT '学生表';

-- 向学生表添加一条记录
INSERT INTO student VALUES(NULL, '小明', '男');

-- 部门表dept
CREATE TABLE IF NOT EXISTS dept(
	deptno INT AUTO_INCREMENT COMMENT '部门编号',
	deptname VARCHAR(30) NOT NULL UNIQUE DEFAULT '' COMMENT '部门名称',
	PRIMARY KEY (deptno)
) CHARACTER SET utf8 COMMENT '部门表';

INSERT INTO dept(deptname) VALUES('研发部'),('销售部'),('产品部');

-- 员工 表 employee
CREATE TABLE IF NOT EXISTS employee(
	id INT AUTO_INCREMENT COMMENT '员工编号',
	name VARCHAR(30) NOT NULL UNIQUE DEFAULT '' COMMENT '员工姓名',
	gender CHAR NOT NULL DEFAULT '' COMMENT '员工性别',
	position VARCHAR(20) NOT NULL DEFAULT '' COMMENT '员工职位',
	salary DECIMAL NOT NULL DEFAULT 0 COMMENT '员工工资',
	addTime DATE NOT NULL DEFAULT '1999-09-09' COMMENT '入职日期',
	deptno INT,
	PRIMARY KEY (id),
	FOREIGN KEY (deptno) REFERENCES dept(deptno)
)CHARACTER SET utf8 COMMENT '员工表';


INSERT INTO employee(name,gender,post,salary,edate,deptid),
	VALUES('张三','男','Java研发工程师',9000,'2016-10-10',1),
	('林青霞','女','销售经理',15000,'2015-06-15',2),
	('李四','男','产品经理',10000,'2014-12-11',3),
	('张三丰','男','Android研发工程师',8000,'2017-05-26',1);
