package org.xueyao.work01;

import java.util.HashMap;

/**
 * 有2个数组,第一个数组内容为:[黑龙江省,浙江省,江西省,广东省,福建省],
 * 第二个数组为:[哈尔滨,杭州,南昌,广州,福州],
 * 将第一个数组元素作为key,第二个数组元素作为value存储到Map集合中.
 * 如{黑龙江省=哈尔滨, 浙江省=杭州, …}
 * @author Yao Xue
 * @date Jul 30, 2017 3:32:01 AM
 */
public class Test27 {
    public static void main(String[] args) {
        String[] province = {"黑龙江省","浙江省","江西省","广东省","福建省"};
        String[] city = {"哈尔滨","杭州","南昌","广州","福州"};
        
        HashMap<String,String> area = new HashMap<String,String>();
        for (int i=0; i < province.length; i++) {
            area.put(province[i],city[i]);
        }
        
        System.out.println(area);
    }
}
