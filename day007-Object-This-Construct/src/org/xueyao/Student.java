package org.xueyao;
/**
 * 类的定义：
 *      类是用来描述现实世界的事物的
 *      
 * 事物：
 *     属性      事物的描述信息
 *     行为     事物能够做什么
 * 类是如何和事物进行对应的呢？
 *      类：
 *          成员变量
 *          成员方法
 * 需要： 写一个学生类
 * 
 * 学生事物：
 *      属性：姓名，年龄....
 *      行为：学习，吃饭....
 * 学生类：
 *      成员变量： 姓名，年龄
 *      成员方法：学习，吃饭
 * 
 * 成员变量： 和我们前面学习过的变量的定义是一样的。
 *      位置不同：类中，方法外
 *      初始化值：不需要给初始化值
 *      
 * 成员方法： 和我们前面学习过的方法的定义是一样的
 *      去掉static 关键字
 * @author Yao Xue
 * @date Jul 1, 2017 8:13:42 PM
 */
public class Student {
    String name;
    int age;
    
    public void study() {
        System.out.println("好好学习，天天向上");
    }
    
    public void eat() {
        System.out.println("学习饿了要吃饭");
    }
}
