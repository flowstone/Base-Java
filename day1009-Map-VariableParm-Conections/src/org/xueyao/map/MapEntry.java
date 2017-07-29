package org.xueyao.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Yao Xue
 * @date Jul 29, 2017 10:07:28 AM
 */
public class MapEntry {
    public static void main(String[] args) {
        //创建Map对象 
         
        Map<String, String> map = new HashMap<String, String>();
        //给map中添加元素
        map.put("邓超", "孙俪");
        map.put("赵灵儿", "李逍遥");
        map.put("阿奴", "唐钰小宝");
        
        //获得Map中所有Key与value的对应关系
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        //遍历Set集合
        Iterator<Map.Entry<String,String>> it = entrySet.iterator();
        
        while (it.hasNext()) {
            //得到每一对对应关系 
            Map.Entry<String, String> entry = it.next();
            //通过每一对对应关系获取对应的key
            String key = entry.getKey();
            //通过每一对对应关系获取对应的value
            String value = entry.getValue();
            
            System.out.println(key +"=" +value);
        }
        
    }
}
