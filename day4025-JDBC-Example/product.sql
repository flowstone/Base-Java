CREATE DATABASE t_20170819_test CHARACTER SET utf8;

use t_20170819_test;

CREATE TABLE IF NOT EXISTS product(
	pid INT AUTO_INCREMENT COMMENT '商品id',
	pname VARCHAR(50) NOT NULL DEFAULT '' COMMENT '商品名',
	price DECIMAL NOT NULL DEFAULT 0 COMMENT '商品价格',
	flag VARCHAR(2) COMMENT '是否上架标记为：1表示上架、0表示下架',
	category_id VARCHAR(32) COMMENT '分类id',
	PRIMARY KEY (pid)
)CHARACTER SET utf8 COMMENT '商品表';

INSERT INTO product(pname,price,flag,category_id) VALUES('联想',5000,'1','c001');
INSERT INTO product(pname,price,flag,category_id) VALUES('海尔',3000,'1','c001');
INSERT INTO product(pname,price,flag,category_id) VALUES('雷神',5000,'1','c001');

INSERT INTO product(pname,price,flag,category_id) VALUES('JACK JONES',800,'1','c002');
INSERT INTO product(pname,price,flag,category_id) VALUES('真维斯',200,'1','c002');
INSERT INTO product(pname,price,flag,category_id) VALUES('花花公子',440,'1','c002');
INSERT INTO product(pname,price,flag,category_id) VALUES('劲霸',2000,'1','c002');

INSERT INTO product(pname,price,flag,category_id) VALUES('香奈儿',800,'1','c003');
INSERT INTO product(pname,price,flag,category_id) VALUES('相宜本草',200,'1','c003');


