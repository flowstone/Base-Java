package org.xueyao.work01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Map中有{张三=3,李四=4,王五=5,赵六=6,孙七=7,田七=7,周八=5}这些元素.
 * 将Map中value相同的元素从Map中去除(value为7和5是相同的,都要删除).
 * 再将Map中剩余元素的key存放到一个ArrayLis中,并打印到控制台上
 * @author Yao Xue
 * @date Jul 30, 2017 3:32:34 AM
 */
public class Test28 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        
        map.put("张三",3);
        map.put("李四",4);
        map.put("王五",5);
        map.put("赵六",6);
        map.put("孙七",7);
        map.put("田七",7);
        map.put("周八",5);
        System.out.println(map);
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        Iterator<Entry<String,Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
        }
        System.out.println(map);
    }
}
