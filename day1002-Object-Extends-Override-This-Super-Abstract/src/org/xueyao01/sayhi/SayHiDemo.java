package org.xueyao01.sayhi;
/**
 * @author Yao Xue
 * @date Jul 19, 2017 2:52:44 PM
 */
public class SayHiDemo {
    public static void main(String[] args) {
        Chinese chinese = new Chinese();
        chinese.name = "中国人";
        chinese.sayHi();
        
        Korean korean = new Korean();
        korean.name = "韩国人";
        korean.sayHi();
        
        Japanese japanese = new Japanese();
        japanese.name = "苍井空";
        japanese.sayHi();
    }
}

/*
 * 问题： 子类继承父类的方法，但是子类有不同的实现？
 * 解决：
 *      方法重写：子类定义与父类一模一样的方法
 *         1.方法名相同
 *         2.参数列表相同
 *         3.返回值 相同
 * 表现
 *     1.子类重写了父类的方法，则执行子类的方法
 *     2.子类如果没有重写，就执行父类的方法
 * 注意：
 *      1.子类重写父类方法时，不能使用此父类中被重写的方法更严格的访问权限(多态)  
 *          public(全局可访问)>protected(包，不同包子类)>default(package包)>private(只能本类访问)
 *      2.private 修饰的方法不能被重写，原因是私有方法有能继承，就无所谓重写
 *      3.在Java中，所有类(数组 )的顶层父类Object(除Object本身)
 */
class Person {
    String name;
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
        // TODO Auto-generated method stub
        System.out.println(name+"说：....");
    }
}