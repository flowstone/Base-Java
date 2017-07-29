package org.xueyao.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Yao Xue
 * @date Jul 29, 2017 9:32:49 AM
 */
public class MapGetDemo {
    public static void main(String[] args) {
        //创建Map对象
        
        Map<String, String> map = new HashMap<String, String>();
        //给map添加元素
        map.put("邓超", "孙俪");
        map.put("赵灵儿", "李逍遥");
        map.put("阿奴", "唐钰小宝");
        
        //获取Map中的所有key
        
        Set<String> keySet = map.keySet();
        
        //遍历存放所有key的Set集合
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            //得到每一个key
            String key = it.next();
            //通过key获取对应的value
            String value = map.get(key);
            System.out.println(key+"="+value);
        }
        
    }
}
