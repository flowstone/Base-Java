package org.xueyao.day008;
/**
 * @author Yao Xue
 * @date Jul 14, 2017 4:34:21 PM
 */
public class Demo1_Code {
   public static void main(String[] args) {
       {
           int x = 10;  //限定变量的声明周期
           System.out.println(x); 
       }
       
       Student s1 = new Student();
       System.out.println("-----------");
       Student s2 = new Student("张三",23);
    }
}

class Student {
    private String name;
    private int age;
    
    public Student(){
        //study();
        System.out.println("空参构造");
    }
    
    public Student(String name, int age) {
        //study();
        this.name = name;
        this.age = age;
        System.out.println("有参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    {
        //构造代码块：每创建一次对象就会执行一次，优先于构造方法执行
        //System.out.println("构造代码块");
        study();
    }
    
    public void study() {
        System.out.println("学生学习");
    }
    
    //随着类加载而加载，且只执行一次
    //作用：用来给类进行初始化，一般加载驱动
    //静态代码块是优先于主方法执行
    static {
        System.out.println("我是静态代码块");
    }
}
