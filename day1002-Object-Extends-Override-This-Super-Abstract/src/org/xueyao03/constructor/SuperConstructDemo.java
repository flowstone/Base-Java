package org.xueyao03.constructor;
/**super(参数列表)：调用父类的构造方法
 * 0.如果对象要想创建成功，必须调到Object类中的构造方法
 *      1.Object的本地方法调用系统资源，创建对象
 *      2.无论如何，子类必须调到父类的构造方法
 * 1.子类默认调用父类的空参构造
 * 2.如果父类没有空参构造，子类必须调用其有参构造
 * 
 * 3.作用：父类的属性由父类自己的构造方法赋值(规范)
 * @author Yao Xue
 * @date Jul 20, 2017 2:27:37 PM
 */
public class SuperConstructDemo {
    public static void main(String[] args) {
        Student s = new Student();
    }
}


class Person {
     String name;
     int age;
    public  Person() {
        super();
        System.out.println("父类中的构造方法");
    }
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("父类中有参构造方法");
    }
}

class Student extends Person {
    private int id;
//    
//    public Student(String name, int age, int id) {
//        this.name = name; 
//        this.age = age;
//        this.id = id;
//    }
    
//    public Student(String name, int age, int id) {
//        super.name = name;
//        super.age = age;
//        this.id = id;
//    }
     //规范写法：构造方法给成员变量属性赋值，父类的成员属性由自己赋值(自己事情自己干)
    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }
    public Student() {
        System.out.println("子类中的构造方法");
    }
    
    //问题：this调用构造方法和super调用父类构造方法可以共存吗?
    public Student(String name) {
        this();
        //super();
    }
}