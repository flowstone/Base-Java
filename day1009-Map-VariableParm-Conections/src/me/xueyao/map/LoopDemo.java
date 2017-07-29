package me.xueyao.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Yao Xue
 * @date Jul 29, 2017 3:20:35 PM
 */
public class LoopDemo {
    public static void main(String[] args) {
        //keySet();
        entrySet();
    }

    private static void entrySet() {
        // TODO Auto-generated method stub
        Map<String, Integer> map = new HashMap<String,Integer>();
        map.put("丽丽",18);
        map.put("欣欣",19);
        map.put("秦露露",20);
        map.put("老贾",45);
        map.put("鹏鹏",17);
        
        //1.取出map中的对应关系entry集合
        Set<Entry<String, Integer>> entrySet =  map.entrySet();
        //2.遍历entryset集合,取出key和value
        Iterator<Entry<String, Integer>> it = entrySet.iterator();
        while (it.hasNext()) {
            //遍历获取 entry
            Entry<String, Integer> entry = it.next();
            //通过对应关系,就可以获取key和value
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key +"="+ value);
        }
    }

    private static void keySet() {
        // TODO Auto-generated method stub
        Map<String, Integer> map = new HashMap<String,Integer>();
        map.put("a",1);
        map.put("b",2);
        map.put("秦露露",3);
        map.put("老贾",5);
        map.put("d",4);
        
        //1.先获取
        Set<String> keySet = map.keySet();
        
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            String key = it.next();
            //通过
            Integer value = map.get(key);
            System.out.println(key+":"+value);
        }
        
        for (String key : keySet) {
            
        }
        
    }
}
