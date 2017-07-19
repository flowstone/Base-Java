package org.xueyao.homework04;
/** 请用代码描述
        棕色的Tom猫会吃和抓老鼠
        白色的Jerry狗会吃和看家
        要求: 把猫和狗的共性抽取到动物类中

1.定义动物类(Animal)
  a)成员变量
   i.名称 name
   ii.颜色 color
  b)成员方法
   i.吃  eat()  
    1.打印格式: 白色的Tom动物在吃东西
  c)要求:
    i.成员变量不带权限修饰符,方法是公共权限的.
2.定义猫类(Cat),继承Animal类
  a)成员方法: 抓老鼠(catchMouse())
    i.在方法中的输出格式为: 棕色的Tom猫在抓老鼠 
3.定义狗类(Dog),继承Animal类
    a)成员方法: 看家 (lookHome())
       i.在方法中的输出格式为: 白色的Jerry狗在看家 
4.定义测试类Test
  a)提供main方法
  b)在main方法中
    i.使用空参构造,创建Cat对象c
   ii.把c对象的成员name赋值为Tom
  iii.把c对象的成员color赋值为 棕色
   iv.调用c对象成员方法eat方法
    v.调用c对象的成员方法catchMouse()
   vi.使用空参构造,创建Dog对象 d
  vii.把d对象的成员name赋值为Jerry
 viii.把d对象的成员color赋值为 白色
   ix.调用d对象成员方法eat方法
    x.调用d对象成员方法 lookHome方法
 * @author Yao Xue
 * @date Jul 18, 2017 9:27:16 PM
 */
public class Test7 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.name = "Tom";
        c.color = "棕色";
        c.eat();
        c.catchMouse();
        
        Dog d = new Dog();
        d.name = "Jerry";
        d.color = "白色";
        d.eat();
        d.lookHome();
    }
}

/*
1.定义动物类(Animal)
a)成员变量
 i.名称 name
 ii.颜色 color
b)成员方法
 i.吃  eat()  
  1.打印格式: 白色的Tom动物在吃东西
c)要求:
  i.成员变量不带权限修饰符,方法是公共权限的.
*/

class Animal {
     String name;
     String color;
     
     public void eat() {
         //白色的Tom动物在吃东西
         System.out.println(color+"的"+name+"动物在吃东西");
     }
    
}

/*2.定义猫类(Cat),继承Animal类
a)成员方法: 抓老鼠(catchMouse())
i.在方法中的输出格式为: 棕色的Tom猫在抓老鼠 
*/

class Cat extends Animal {
    public void catchMouse() {
        System.out.println(color+"的"+name+"猫在吃东西");
    }
}

/*
3.定义狗类(Dog),继承Animal类
a)成员方法: 看家 (lookHome())
   i.在方法中的输出格式为: 白色的Jerry狗在看家 
*/

class Dog extends Animal {
    public void lookHome() {
        System.out.println(color+"的"+name+"狗在看家");

    }
}