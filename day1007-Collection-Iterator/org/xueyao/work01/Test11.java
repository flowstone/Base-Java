package org.xueyao.work01;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * 自定义人类:包含姓名,年龄,身高属性.私有成员变量,生成无参,有参构造方法,生成get/set方法.
 * 创建5个人放到ArrayList中.
 * 使用迭代器获取每个人的信息.找出最高的人,最矮的人并输出最高人和最矮人的信息.
 * 打印格式如下:最高的人是张三,身高1.80. 最矮的人是李四,身高1.60
 * 
 * 1.   定义学人类生成类无参,有参构造方法,生成get/set方法
    2.  定义ArrayList
    3.  添加5个学生
    4.  获取迭代器
    5.  定义最高人
    6.  定义最矮人
    7.  使用迭代器循环判断是否有下一个人
    8.  使用next方法获取学生对象
    9.  判断这个人的的身高是否大于最大高度
    10. 这个人的的身高大于最大高度.最大身高的人等于这个人
    11. 判断这个人的的身高是否小于于最矮高度
    12. 这个人的的身高小于于最矮高度.最矮身高的人等于这个人
    13. 按照格式打印信息

 * @author Yao Xue
 * @date Jul 26, 2017 9:21:23 PM
 */
public class Test11 {
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<Student>();
        student.add(new Student("小明",18,160));
        student.add(new Student("小陈",19,197));
        student.add(new Student("小芳",20,166));
        student.add(new Student("小丽",21,156));
        student.add(new Student("小欣",22,170));
        
        Iterator<Student> it = student.iterator();
        
        int maxHeight  = student.get(0).getHeight();
        int minHeight = student.get(0).getHeight();
        
        while (it.hasNext()) {
            int height = it.next().getHeight();
            if (maxHeight < height) {
                maxHeight = height;
            }
            if (minHeight > height) {
                minHeight = height;
            }
        }
        System.out.println(maxHeight);
        System.out.println(minHeight);
    }
}
