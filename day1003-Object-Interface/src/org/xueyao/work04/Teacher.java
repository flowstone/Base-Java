package org.xueyao.work04;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 9:44:42 PM
 */
public class Teacher extends Person{
    public Teacher(){}
    public Teacher(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void eat() {
        System.out.println("年龄为"+getAge()+"岁"+getName()+"老师,正在吃工作餐");
    }
    
}
