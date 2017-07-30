package org.xueyao.work01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**使用键盘录入5个学生信息,录入格式为:”姓名,年龄”.将这5个学生信息存入Map集合中,key是姓名,value是年龄
 * @author Yao Xue
 * @date Jul 30, 2017 1:41:40 AM
 */
public class Test12 {
    public static void main(String[] args) {
        Map<String,Integer> student = new HashMap<String,Integer>();
        Scanner sc = new Scanner(System.in);
        while (student.size() < 5) {
            System.out.println("请输入学生信息,录入格式为:”姓名,年龄”");
            String line = sc.nextLine();
            String[] arr = line.split(",");
            String key = arr[0];
            Integer value = Integer.valueOf(arr[1]);
            student.put(key,value);
        }
        
        System.out.println(student);
    }
}
