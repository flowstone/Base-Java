package org.xueyao;
/**
 * Student是一个学生事物描述类，main方法不适合放在它里面
 * 使用一个类，其实就是使用该类的成员(成员变量和成员方法)
 * 而我们要想使用一个类的成员，就必须首先拥有该类的对象
 * 如何创建对象
 *      格式： 类名  对象名 = new 类名();
 * 对象如何 访问成员呢
 *      成员变量： 对象名.变量名
 *      成员方法：对象名.方法名(....)
 * @author Yao Xue
 * @date Jul 3, 2017 10:26:42 AM
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
       // System.out.println("s:"+s);
        System.out.println("姓名："+s.name);
        System.out.println("年龄："+s.age);
        System.out.println("------------");
        s.age = 10;
        s.name = "天下第一帅";
        System.out.println("姓名："+s.name);
        System.out.println("年龄："+s.age);
        
        System.out.println("---------");
        s.study();
        s.eat();
    }
}
