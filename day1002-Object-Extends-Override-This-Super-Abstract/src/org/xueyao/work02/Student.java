package org.xueyao.work02;
/**
 * 3. 定义学生类(Student),继承Person类
    i.  成员变量: score(成绩)
    ii. 成员方法:
    1.   重写父类的 eat()方法
    a)  输出格式:: 成绩为90分的15岁的李小乐学生在吃学生餐
    2.   特有方法: study() 学习方法
    a)  输出格式:: 成绩为90分的15岁的李小乐学生在学习
    iii.    提供空参和带参构造方法
    iv. 提供setXxx和getXxx方法

 * @author Yao Xue
 * @date Jul 19, 2017 8:10:12 PM
 */
public class Student extends Person{
    private double score;
    
    public Student() {
    }

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    @Override
    public void eat() {
        System.out.println("成绩为"+score+"分的"+getAge()+"岁的"+getName()+"学生在吃学生餐");
    }
    
    public void study() {
        System.out.println("成绩为"+score+"分的"+getAge()+"岁的"+getName()+"学生在学习");
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    
    
}
