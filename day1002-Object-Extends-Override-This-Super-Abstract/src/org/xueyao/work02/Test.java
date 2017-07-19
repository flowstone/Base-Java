package org.xueyao.work02;
/**
 * 4. 定义Test类   
    a)  提供main方法
    b)  在main方法中
    i.  创建老师对象t,并把名称赋值为”王小平”,年龄赋值为30,工资赋值为8000
    ii. 调用老师对象t的吃饭方法
    iii.    调用老师对象t的讲解方法
    iv. 创建学生对象 s,并把名称赋值为”李小乐”,年龄赋值为14,成绩赋值为90分.
    v.  调用学生对象 s 的吃饭方法
    vi. 调用学生对象 s 的学习方法

 * @author Yao Xue
 * @date Jul 19, 2017 8:14:10 PM
 */
public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher("王小平", 30, 8000);
        t.eat();
        t.lecture();
        
        Student s = new Student("李小乐", 18,90);
        s.eat();
        s.study();
    }
}
