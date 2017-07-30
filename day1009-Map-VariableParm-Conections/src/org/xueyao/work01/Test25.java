package org.xueyao.work01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Map中有{张三=23,李四=24,王五=15,赵六=36,孙七=17,田七=57,周八=35}
 * 这些元素key为姓名value为年龄.将周八的年龄修改为22,
 * 并将年龄小于30岁人的信息写入到perosn.txt中,person.txt每行数据格式为:姓名=年龄
 * @author Yao Xue
 * @date Jul 30, 2017 3:31:05 AM
 */
public class Test25 {
    public static void main(String[] args) throws IOException {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("张三",23);
        map.put("李四",24);
        map.put("王五",15);
        map.put("赵六",36);
        map.put("孙七",17);
        map.put("田七",57);
        map.put("周八",35);
        
        map.put("周八",22);
        BufferedWriter bw = new BufferedWriter(new FileWriter("person.txt"));
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            Integer value = map.get(key);
            if (value < 30) {
                bw.write(key+"="+value);
                bw.newLine();
                bw.flush();
            }
        }
        bw.close();
    }
}
