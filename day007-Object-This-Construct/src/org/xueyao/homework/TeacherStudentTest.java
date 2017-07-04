package org.xueyao.homework;
/**
 * 1.按照以上要求定义Teacher类和Student类,属性要私有,生成空参、有参构造，setter和getter方法
        2.定义测试类,在main方法中创建该类的对象并给属性赋值(演示两种方法:setter方法和构造方法)
        3.调用成员方法,打印格式如下:
            年龄为30的周志鹏老师正在吃饭....
            年龄为30的周志鹏老师正在亢奋的讲着Java基础中面向对象的知识........("Java基础中面向对象"代表老师讲课的内容)    
            年龄为18的韩光同学正在吃饭....          
            年龄为18的韩光同学正在专心致志的听着面向对象的知识....("面向对象"代表学生学习的内容)
 * @author Yao Xue
 * @date Jul 3, 2017 5:37:19 PM
 */
public class TeacherStudentTest {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("周志鹏");
        t.setAge(30);
        t.setContent("Java基础中面向对象");
        t.eat();
        t.lesson();
        
        Student s = new Student();
        s.setName("韩光");
        s.setAge(18);
        s.setContent("面向对象");
        s.eat();
        s.study();
        
        System.out.println("-------------");
        Teacher t1 = new Teacher("周志鹏", 30, "Java基础中面向对象");
        t1.eat();
        t1.lesson();
        Student s1 = new Student("韩光", 18, "面向对象");
        s1.eat();
        s1.study();
        
    }
}
