package org.xueyao.work2;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 自定义学生类:包含姓名,年龄,成绩属性.私有成员变量,生成无参,有参构造方法,生成get/set方法.
 * 创建5个学生放到HashSet中(姓名和年龄相同的认为是同一学生).
 * 使用迭代器获取每个学生信息.统计总分,平均分,最高分,最低分并输出
 * 
 * 1.   创建HashSet,用于存放学生
    2.  使用add方法添加5个学生
    3.  使用迭代器获取一个学生.
    4.  定义总分变量
    5.  定义最高分变量,初始化值为迭代出来的学生的成绩
    6.  定义最低分变量,初始化值为迭代出来的学生的成绩
    7.  使用增强for循环获取遍历HashSet,获取到每个学生
    8.  在增强for中将学生的分数添加到总分
    9.  在增强for中判断最高分是否小于这个学生的分数,如果最高分小于这个学生的分数,将这个学生的分数设置为最高分
    10. 在增强for中判断最低分是否大于这个学生的分数,如果最低分大于这个学生的分数,将这个学生的分数设置为最低分
    11. 计算平均分(平均分 = 总分 / 人数)
    12. 按照格式打印

 * @author Yao Xue
 * @date Jul 27, 2017 10:18:48 PM
 */
public class Test17 {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<Student>();
        hashSet.add(new Student("李逍遥",20,96));
        hashSet.add(new Student("赵灵儿", 18, 100));
        hashSet.add(new Student("林月如", 18, 97));
        hashSet.add(new Student("小青", 40, 80));
        hashSet.add(new Student("酒剑仙", 50, 70));
        
        int sum  = 0;
        Iterator<Student> it = hashSet.iterator();
        int score = it.next().getScore();
        int max = score;
        //System.out.println(max);
        int min = score;
        //System.out.println(min);
//        System.out.println(hashSet);
        for (Student  s : hashSet) {
            int score2 = s.getScore();
            sum += score2;
            
            if (max < score2) {
                max = score2;
            }
            if (min > score2) {
                min = score2;
            }
        }
        int avg = sum / hashSet.size();
        System.out.println("平均分为:"+avg);
    }
}
