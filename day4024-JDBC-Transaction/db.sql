-- 创建一个表:账户表
CREATE DATABASE t_20170818_test CHARACTER SET utf8;

-- 使用数据库
USE t_20170818_test;

-- 创建账号表
CREATE TABLE account(
	id INT AUTO_INCREMENT COMMENT '账号id',
	name VARCHAR(20) NOT NULL DEFAULT '' COMMENT '账号名',
	money DECIMAL NOT NULL DEFAULT 0 COMMENT '金额',
	PRIMARY KEY (id)
)CHARACTER SET utf8 COMMENT '账号表';

-- 初始化数据
INSERT INTO account VALUES(NULL, 'jack', 10000);
INSERT INTO account VALUES(NULL, 'rose', 10000);
INSERT INTO account VALUES(NULL, 'tom', 10000);


-- 开启事务
start transaction;

-- 提交事务
commit;