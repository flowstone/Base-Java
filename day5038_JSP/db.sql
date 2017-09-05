use t_201709_test;
CREATE TABLE `product` (
  `pid` VARCHAR(32) NOT NULL PRIMARY KEY,
  `pname` VARCHAR(50) DEFAULT NULL COMMENT'商品名',
  `market_price` DOUBLE DEFAULT NULL ,
  `shop_price` DOUBLE DEFAULT NULL,
  `pimage` VARCHAR(200) DEFAULT NULL COMMENT '商品图片',
  `pdate` DATE DEFAULT NULL ,
  `is_hot` INT(11) DEFAULT NULL,
  `pdesc` VARCHAR(255) DEFAULT NULL COMMENT '商品描述'  
); 

INSERT INTO `product` VALUES 
('1','小米 4c 标准版',1399,1299,'products/1/c_0001.jpg','2015-11-02',1,'小米 4c 标准版 全网通 白色 移动联通电信4G手机 双卡双待'),
('2','华为 Ascend Mate7',2699,2599,'products/1/c_0010.jpg','2015-11-02',1,'华为 Ascend Mate7 月光银 移动4G手机 双卡双待双通6英寸高清大屏！'),
('3','vivo X5Pro',2399,2298,'products/1/c_0014.jpg','2015-11-02',1,'移动联通双4G手机 3G运存版 极光白【购机送蓝牙耳机+蓝牙自拍杆】'),
('4','努比亚（nubia）My 布拉格',1899,1799,'products/1/c_0013.jpg','2015-11-02',0,'努比亚（nubia）My 布拉格 银白 移动联通4G手机 ！'),
('5','华为 麦芒4',2599,2499,'products/1/c_0012.jpg','2015-11-02',1,'华为 麦芒4 晨曦金 全网通版4G手机 双卡双待金属机身 2.5D弧面屏 指纹解锁 光学防抖'),
('6','vivo X5M',1899,1799,'products/1/c_0011.jpg','2015-11-02',0,'vivo X5M 移动4G手机 双卡双待 香槟金【购机送蓝牙耳机+蓝牙自拍杆】');

SELECT * FROM product;
