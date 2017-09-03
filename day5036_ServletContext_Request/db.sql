USE t_201709_test;

CREATE TABLE tb_user(
	userid INT AUTO_INCREMENT COMMENT '用户id',
	username VARCHAR(255) NOT NULL DEFAULT '' UNIQUE COMMENT '用户名',
	userpass VARCHAR(255) NOT NULL DEFAULT '' COMMENT '密码',
	useremail VARCHAR(255) COMMENT '邮箱',
	nickname VARCHAR(255) UNIQUE COMMENT '呢称',
	usersex VARCHAR(255) COMMENT '性别',
	birthday VARCHAR(255) COMMENT '生日',
	PRIMARY KEY (userid)
)CHARACTER SET utf8 COMMENT '用户表';

SELECT * FROM tb_user;

INSERT INTO tb_user VALUES(NULL, 'tom', '1234', '1234@qq.com', 'tomcat', '男', '1992-02-02');