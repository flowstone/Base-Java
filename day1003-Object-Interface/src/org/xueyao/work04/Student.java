package org.xueyao.work04;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 9:49:51 PM
 */
public class Student extends Person{
    
    public Student(){}
    public Student(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println("年龄"+getAge()+"岁的 "+getName()+" 在吃学生餐");
    }

}
