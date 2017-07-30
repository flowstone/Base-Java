package org.xueyao.work01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 现在有一个map集合如下:{1="张三丰",2="周芷若",3="汪峰",4="灭绝师太"}
要求:
1.将map集合中的所有信息显示到控制台上
2.向该map集合中插入一个编码为5姓名为李晓红的信息
    3.移除该map中的编号为1的信息 
    4.将map集合中编号为2的姓名信息修改为"周林"

 * @author Yao Xue
 * @date Jul 30, 2017 2:36:39 AM
 */
public class Test16 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"张三丰");
        map.put(2,"周芷若");
        map.put(3,"汪峰");
        map.put(4,"灭绝师太");
        
        System.out.println(map);
        map.put(5,"李晓红");
        map.remove(1);
        map.put(2,"周林");
        
        Iterator<Entry<Integer,String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry<Integer,String> next = it.next();
            Integer id = next.getKey();
            String name = next.getValue();
            System.out.println(id+"-"+name);
        }
    }
}
