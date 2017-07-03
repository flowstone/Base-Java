package org.xueyao_02;
/**
 * 学生类
 *  起名字我们要求做到见名知意
 *  如果有局部变量名和成员变量名相同，在局部使用的时候，采用的是就近原则
 *  
 *  我们有没有办法把局部变量的name赋值给成员变量的name呢？
 *  有
 *  什么办法呢
 *  使用this关键字就可以解决这个问题
 *  
 *  this:代表所在类的对象引用 
 *  
 *  使用场景：
 *      局部变量隐藏成员变量
 *      
 * @author Yao Xue
 * @date Jul 3, 2017 1:43:34 PM
 */
public class Student {
    private String name;
    private int age;
    
    public void setName(String name) {
        //name = name
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAge(int age) {
        //age = age;
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
}

