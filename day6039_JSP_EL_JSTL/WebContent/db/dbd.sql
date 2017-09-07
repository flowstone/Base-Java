CREATE TABLE `user` (
  `uid` VARCHAR(32) NOT NULL PRIMARY KEY,
  `username` VARCHAR(20) DEFAULT NULL,		#用户名
  `password` VARCHAR(20) DEFAULT NULL,		#密码
  `name` VARCHAR(20) DEFAULT NULL,			#昵称
  `email` VARCHAR(30) DEFAULT NULL,			#电子邮箱
  `telephone` VARCHAR(20) DEFAULT NULL,		#电话
  `birthday` DATE DEFAULT NULL,				#生日
  `sex` VARCHAR(10) DEFAULT NULL			#性别    
) ;

INSERT INTO USER VALUES('u001','mary','1234','玛丽','12345@qq.com','13888888888','1992-2-2','女');

SELECT * FROM USER;