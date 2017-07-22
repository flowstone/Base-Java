package org.xueyao.work02;
/**
 * 验证：引用类型的变量值为对象地址值，地址值不能更改，但是地址内的对象属性值可以修改
 * @author Yao Xue
 * @date Jul 22, 2017 8:44:35 PM
 */
public class Final_4 {
    public static void main(String[] args) {
        final Cat c = new Cat();
        //引用类型的变量值为对象地址值，地址值不能更改
        //c = new Cat();
        //地址内的对象属性值可以修改
        c.age = 2;
    }
    
}
class Cat {
    public int age;
}