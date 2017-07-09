package com.itheima.cn;

import java.util.ArrayList;

/**
 * 1.定义一个学生类Student，在类中定义两个属性name(姓名)：String类型，score(分数)：int类型，并将其私有化，提供get/set方法
    2.定义测试类，在测试类中创建三个Student对象，第一个对象的属性赋值为”小红”,80;第二个对象的属性赋值为”小明”,90;第三个对象的属性赋值为”小花”,95
    3.在测试类中，定义集合，将创建的三个Student对象存储到集合中，遍历集合，并计算三个学生的平均值，将结果输出到控制台上
 * @author Yao Xue
 * @date Jul 9, 2017 8:27:17 AM
 */
public class Test07 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("小红");
        s1.setScore(80);
        Student s2 = new Student();
        s2.setName("小明");
        s2.setScore(90);
        Student s3 = new Student();
        s3.setName("小花");
        s3.setScore(95);
        
        ArrayList<Student> arrayList = new ArrayList<Student>();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i).getScore();
        }
        
        int avg = sum / arrayList.size();
        System.out.println("三个学生的平均分："+avg);
    }
}
