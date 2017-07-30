package org.xueyao.work01;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 有四种水果(苹果，香蕉，西瓜，橘子)
     1、给每种水果设定一个商品号，商品号是8个0-9的随机数，商品号码不能重复, 最小值 "00000001", 最大值 "99999999"
     2、根据商品号查询对应的商品。
如果查不到输出：“查无此商品”
如果能查到打印：”根据商品号：12345678，查询到对应的商品为：西瓜”

 * @author Yao Xue
 * @date Jul 30, 2017 3:33:51 AM
 */
public class Test31 {
    public static void main(String[] args) {
        Map<Apple,String> map = new HashMap<Apple,String>();
        
        Random r = new Random();
        String str = "";
        for (int i=0; i<8; i++) {
            str += r.nextInt(10);
        }
        
    }
    
}
