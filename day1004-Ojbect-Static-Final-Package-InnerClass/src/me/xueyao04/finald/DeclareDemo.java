package me.xueyao04.finald;
/**
 *  7. 动物联合声明案例
        步骤一 : 定义一个 `共性` 类.   行为: 联合声明 (decleration)
        步骤二 : 定义一个 `Dog` 类. 继承 `Animal` 类, 子类无条件拥有父类中所有可继承的 `属性和行为`.  (不可继承: 构造方法)
        步骤三 : Fox extends Animal    获取 decleration() 行为，重写了该方法。
        
         继承的好处: Fox 可以不重写该方法, 可以直接继承.  
        继承的缺点: 继承后重写方法，打破了 `类` 的封装性.
        
        解决： final 关键字   最终  
        final修饰的方法可以被继承，不能被更改
    8. final 关键字 :
    final 关键字是用于修饰类,变量和方法,它有"这是无法改变的"或者"最终"的含义.
    特点 :
    1.  final 修饰的类不能被继承.即不能有子类.
    2.  final 修饰的方法不能被子类重写.老老实实继承,不允许做任何篡改.
    3.  final 修饰的变量(成员变量和局部变量)是常量,由于常量在运行期间不允许再发生改变,所以常量在声明时没有默认值, 这就要求程序在声明常量时必须指定该常量的值.
        1. 局部变量：因为在运行时才创建，所以可以先定义后初始化 
        2. 成员变量：因为在类加载时已经创建，所以必须声明时进行初始化（系统的方法 `静态代码块, 构造方法, 构造代码块`）
        3. 一个原则：final修饰的变量在被调用的时候必须有值
    注意：由于final修饰的变量是常量，我们开发中为了和变量名有区别，因此所有的被final修饰的变量名统一大写。
    
    总结：不可继承（类）、不可重写（方法）、不可修改（属性）
 * @author Yao Xue
 * @date Jul 23, 2017 10:27:29 AM
 */
public class DeclareDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "哈士奇";
        dog.declare();
        
        Fox fox = new Fox();
        fox.name = "金刚狐狸";
        fox.declare();
    }
}

class Animal {
    String name;
    public final void declare() {
        System.out.println(name+"说：动物是人类的好朋友");
    }
}

class Dog extends Animal {
    //final修饰属性都是常量，在方法区的常量池中
    //当对象创建的时候被加载
    //只要保证该常量被 调用的时候有值即可
    //一次赋值，终身不变
    public static final  int I;
    /*public Dog() {
        I = 3;
    }*/
    /*
    {
        I = 3;
    }*/
    
    static {
        I = 3;
    }
    
    public  void speak() {
        //当方法入栈的时候加载
        final  int J;
        J = 2;
        System.out.println(J);
    }
}

class Fox extends Animal {
    /*private void declare() {
        // TODO Auto-generated method stub

    }*/
}