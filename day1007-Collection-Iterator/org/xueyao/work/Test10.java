package org.xueyao.work;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 自定义学生类:包含姓名,年龄,成绩属性.私有成员变量,生成无参,有参构造方法,生成get/set方法.
 * 创建5个学生放到ArrayList中.使用迭代器获取每个学生信息.统计总分,平均分,最高分,最低分并输出
 * 1.   定义学生类生成类无参,有参构造方法,生成get/set方法.
    2.  定义ArrayList
    3.  添加5个学生
    4.  获取迭代器
    5.  定义总分
    6.  定义最高分
    7.  定义最低分
    8.  循环判断是否有下一个学生
    9.  使用next方法获取学生对象
    10. 将这个学生对象的分数添加到总分
    11. 判断这个学生的分数是否大于最大分数
    12. 这个学生的分数大于最大分数.最大分数等于这个学生的分数
    13. 判断这个学生的分数是否大低最大分数
    14. 这个学生的分数小于最小分数.最小分数等于这个学生的分数
    15. 计算平均分(平均分 = 总分/人数)
    16. 打印总分,最高分,最低分

 * @author Yao Xue
 * @date Jul 26, 2017 8:39:14 PM
 */
public class Test10 {
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<Student>();
        
        student.add(new Student("小明",18,98));
        student.add(new Student("小陈",19,97));
        student.add(new Student("小芳",20,96));
        student.add(new Student("小丽",21,95));
        student.add(new Student("小欣",22,94));
        int sum = 0;
        Iterator<Student> it = student.iterator();
        int max = student.get(0).getScore();
        int min = student.get(0).getScore();
        //TODO:有问题,待修复
        while (it.hasNext()) {
            int score = it.next().getScore();
            min = score;
            System.out.println(score);
            sum += score;
            if (max < score) {
                max = score;
            }
            
            if (min > score) {
                min = score;
            }
        }
        int avg = sum / 5;
        System.out.println("总分:"+sum+",最高分:"+max+",最低分:"+min+",平均分:"+avg);
    }
    
    
}
