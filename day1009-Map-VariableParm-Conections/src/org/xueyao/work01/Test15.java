package org.xueyao.work01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 研发部门有5个人，信息如下：
 * （姓名-工资）【柳岩=2100, 张亮=1700, 诸葛亮=1800, 灭绝师太=2600, 东方不败=3800】,
 * 将以上员工的相关信息存放在适合的集合中,给柳岩涨工资300,迭代出每个元素的内容输出到控制台
 * @author Yao Xue
 * @date Jul 30, 2017 2:10:23 AM
 */
public class Test15 {
    public static void main(String[] args) {
        Map<String,Integer> employee = new HashMap<String, Integer>();
        employee.put("柳岩",2100);
        employee.put("张亮",1700);
        employee.put("诸葛亮",1800);
        employee.put("灭绝师太",2600);
        employee.put("东方不败",3800);
        //System.out.println(employee);
        Integer money = employee.get("柳岩");
        employee.put("柳岩", money+300);
        /* 效率底,不推荐使用,没有面向对象思想
        Set<String> keySet = employee.keySet();
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            String key = it.next();
            Integer value = employee.get(key);
            System.out.println(key+"="+value);
        }
        */
        Set<Entry<String,Integer>> entrySet = employee.entrySet();
        Iterator<Entry<String,Integer>> it = entrySet.iterator();
        while (it.hasNext()) {
            Entry<String,Integer> next = it.next();
            String name = next.getKey();
            Integer salary = next.getValue();
            System.out.println(name +"="+ salary);
        }
    }
}
