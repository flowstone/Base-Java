package org.xueyao.access;
/**
 * 学生类
 * 
 * 通过对象直接访问成员变量，会存在数据安全问题
 * 这个时候，我们就想能不能不让外界的对象直接访问成员变量呢？
 * 能
 * 如何实现呢
 *      private关键字
 *      
 * private:
 *      是一个修饰符
 *      可以修饰成员变量，也可以修饰成员方法
 *      被 private修饰的成员只能在本类中使用
 * 针对private修饰的成员变量，我们会相应的提供getXxx()和setXxx()
 * 用于获取和设置成员变量的值，方法用public 修饰
 * @author Yao Xue
 * @date Jul 3, 2017 11:44:02 AM
 */
public class Student {
    String name;
    private int age;
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 200) {
            System.out.println("你给的年龄有误");
        } else {
            this.age = age;
        }
    }

    public void show() {
        System.out.println("姓名是："+name+"年龄是"+age);
    }
}
