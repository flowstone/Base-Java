package org.xueyao02.superd;

import java.util.jar.Attributes.Name;

/**
 * @author Yao Xue
 * @date Jul 19, 2017 2:52:44 PM
 */
public class SayHiDemo {
    public static void main(String[] args) {
       /* Chinese chinese = new Chinese();
        chinese.name = "中国人";
        chinese.sayHi();
        
        Korean korean = new Korean();
        korean.name = "韩国人";
        korean.sayHi();*/
        
        Japanese japanese = new Japanese();
        japanese.name = "苍井空";
        japanese.sayHi();
    }
}

/**
 * 
 * 问题：子类继承父类的方法，并不想直接覆盖父类的方法，想在父类方法的基础上进行增强
 * 解决：
 *      在扩展父类方法之前，先调用父类的方法
 * 引出 
 *      super  关键字
 *      1.super.方法      调用父类中的方法
 *      2.super.属性      调用父类中的属性
 *      
 * super 和 this的区别
 *      1.this:表示本类对象，先找子类特有的属性和方法，如果没有再找到父类的属性方法(层层往上找，直到Object)
 *      2.super:表示父类引用，直接到父类中找属性和方法，如果找不到，层层往上找(不能越级查找)
 */
class Person {
    String name = "父类的苍老师";
    void sayHi() {
        System.out.println(name+"说：大家好");
    }
}

class Chinese extends Person {
    @Override
    void sayHi() {
        // TODO Auto-generated method stub
        System.out.println(name+"说：大家好");
    }
}

class Korean extends Person {
    //注解:编译时期检测方法是否是重写方法，如果不是则报错
    @Override
    void sayHi() {
        System.out.println(name+ "说:泡菜思密达");
    }
}

class Japanese extends Person {
    @Override
    void sayHi() {
        super.sayHi();
        System.out.println(name+"说：....");
        System.out.println(this.name+"说：口你急哇！");
        System.out.println(super.name+"说：口你急哇！");
    }
}