package org.xueyao.arraylist;

import java.util.ArrayList;

/**
 * 存储自定义对象并遍历 
 * 
 * 分析：
 *      A：定义学生类
 *      B：创建集合对象
 *      C：创建学生对象
 *      D：把学生对象作为元素添加到集合中
 *      E：遍历集合
 * @author Yao Xue
 * @date Jul 5, 2017 11:58:58 PM
 */
public class ArrayList4 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> array = new ArrayList<Student>();
        
        //创建学生对象
        Student s1 = new Student("林青霞",28);
        Student s2 = new Student("王祖贤",25);
        Student s3 = new Student("朱茵",23);
        Student s4 = new Student("莫文蔚",21);
        
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            System.out.println(student.getName()+"-----"+student.getAge());
        }
    }
}
