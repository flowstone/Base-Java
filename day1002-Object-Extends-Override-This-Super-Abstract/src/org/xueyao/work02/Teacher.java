package org.xueyao.work02;
/**
 * 2. 定义老师类(Teacher),继承Person类
    i.  成员变量:  salary(工资)
    ii. 成员方法:
    1.   重写父类的 eat()方法
    a)  输出格式:: 工资为8000元的30岁的王小平老师在吃工作餐
    2.   特有方法:  lecture() 讲课方法
    a)  输出格式:: 工资为8000元的30岁的王小平老师在讲课
    iii.    提供空参和带参构造方法
    iv. 提供setXxx和getXxx方法

 * @author Yao Xue
 * @date Jul 19, 2017 8:02:09 PM
 */
public class Teacher extends Person {
    private double salary;
    
    public Teacher() {
    }
    
    
    public Teacher(String name, int age, double salary) {
        super(name,age);
        this.salary = salary;
    }
    

    public double getSalary() {
        return salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public void eat() {
        System.out.println("工资为"+salary+"元的"+getAge()+"岁的"+getName()+"老师在吃工作餐");
    }
    
    public void lecture() {
        System.out.println("工资为"+salary+"元的"+getAge()+"岁的"+getName()+"老师在讲课");
    }
    
}
