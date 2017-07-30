package org.xueyao.work01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 有一个Map集合里面存储了学生的名字,年龄,内容如下:{赵四=21, 王二=17, 张三=21},
 * 1将里面的元素使用两种遍历方式打印的控制台,
 * 2将赵四的年龄改为18,
 * 3将元素存入到student.txt中.一行保存格式:姓名,年龄
 * @author Yao Xue
 * @date Jul 30, 2017 3:29:43 AM
 */
public class Test22 {
    public static void main(String[] args) throws IOException {
        Map<String,Integer> student =new  HashMap<String,Integer>();
        
        student.put("赵四",21);
        student.put("王二",17);
        student.put("张三",21);
        
        Iterator<String> it = student.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            Integer value = student.get(key);
            System.out.println(key+" = "+value);
        }
        System.out.println("-----------------");
        Iterator<Entry<String,Integer>> it2 = student.entrySet().iterator();
        while (it2.hasNext()) {
            Entry<String,Integer> studentInfo = it2.next();
            String studentName = studentInfo.getKey();
            Integer studentAge = studentInfo.getValue();
            System.out.println(studentName+" = "+studentAge);
        }
        
        student.put("赵四",18);
        
        BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));
        
        Iterator<Entry<String,Integer>> it3 = student.entrySet().iterator();
        while (it3.hasNext()) {
            Entry<String,Integer> next = it3.next();
            String name = next.getKey();
            Integer age = next.getValue();
            bw.write(name+","+age);
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
