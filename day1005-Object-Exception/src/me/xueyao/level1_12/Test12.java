package me.xueyao.level1_12;
/**
 * 2. 定义异常类NoScoreException,继承RuntimeException
a)  提供空参和有参构造方法
3. 定义学生类(Student)
a)  属性:name,score
b)  提供空参构造
c)  提供有参构造;
i.  使用setXxx方法给名称和score赋值
d)  提供setter和getter方法
i.  在setScore(int score)方法中
1.  首先判断,如果score为负数,就抛出NoScoreException,异常信息为:分数不能为负数:xxx.
2.  然后在给成员score赋值.
4. 定义测试类Test12
a)  提供main方法,在main方法中
i.  使用满参构造方法创建Student对象,分数传入一个负数,运行程序
ii. 由于一旦遇到异常,后面的代码的将不在执行,所以需要注释掉上面的代码
iii.    使用空参构造创建Student对象
iv. 调用setScore(int score)方法,传入一个正数,运行程序
v.  调用setScore(int score)方法,传入一个负数,运行程序

 * @author Yao Xue
 * @date Jul 23, 2017 8:37:19 PM
 */
public class Test12 {
    public static void main(String[] args) {
        Student s = new Student("小明", -99);
        Student s2 = new Student();
        
        s2.setScore(98);
        s2.setScore(-3);
    }
}

class NoScoreException extends RuntimeException {
    public NoScoreException() {
        
    }
    public NoScoreException(String message) {
        super(message);
    }
}


class Student {
    private String name;
    private int score;
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Student(String name, int score) {
        super();
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        if (score < 0) {
            throw new NoScoreException("分数不能为负数:"+name);
        }
        this.score = score;
    }
    
    
}
