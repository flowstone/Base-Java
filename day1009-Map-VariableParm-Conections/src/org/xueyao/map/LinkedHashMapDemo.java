package org.xueyao.map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Yao Xue
 * @date Jul 29, 2017 10:36:02 AM
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<String,String>();
        
        map.put("邓超", "孙俪");
        map.put("赵灵儿", "李逍遥");
        map.put("阿奴", "唐钰小宝");
        
        Set<Entry<String, String>> entrySet = map.entrySet();
        
        for (Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
    }
}
