CREATE TABLE tmp_170831_user(
	userid INT AUTO_INCREMENT COMMENT '用户id',
	username VARCHAR(32) NOT NULL DEFAULT '' COMMENT '用户名',
	userpass VARCHAR(32) NOT NULL DEFAULT '' COMMENT '密码',
	PRIMARY KEY (userid)
)CHARACTER SET utf8 COMMENT '用户表';

INSERT INTO tmp_170831_user VALUES(1,'tom','1234');
INSERT INTO tmp_170831_user VALUES(2,'mary','1235');

SELECT * FROM tmp_170831_user;

