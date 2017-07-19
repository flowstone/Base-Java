package org.xueyao.homework;
/**
 *   请使用代码描述:  18岁的景甜在使用iPhone手机玩游戏
1.定义手机类(Phone)
   i.成员变量:  品牌(brand)
   ii.成员方法:  玩游戏(void playGame())
  iii.提供空参和带参构造方法
   iv.提供setXxx和getXxx方法
2.定义人类(Person)
  i.成员变量: 姓名(name),年龄(age)
  ii.成员方法: 使用手机玩游戏 (usePhone(Phone p))
  iii.提供空参和带参构造方法
  iv.提供setXxx和getXxx方法
3.定义Test类
  a)提供main方法
  b)在main方法中
    i.创建手机对象,并把手机品牌赋值为iPhone
   ii.创建Person对象,并把名称赋值为景甜,年龄赋值为18
  iii.调用Person对象的,usePhone方法,传入手机对象
   iv.打印格式如下:
        18岁的景甜在使用iPhone手机玩游戏
 * @author Yao Xue
 * @date Jul 18, 2017 8:27:13 PM
 */
public class Test2 {
    public static void main(String[] args) {
        
        Person person = new Person();
        person.setName("景甜");
        person.setAge(18);
        person.usePhone(new Phone("iPhone"));
        Phone phone = new Phone();
        phone.playGame();
    }
}

/*
 * 1.定义手机类(Phone)
   i.成员变量:  品牌(brand)
   ii.成员方法:  玩游戏(void playGame())
   iii.提供空参和带参构造方法
   iv.提供setXxx和getXxx方法
 */
class Phone {
    private String brand;

    public Phone() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Phone(String brand) {
        super();
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    
    public void playGame() {
        System.out.println("玩游戏");
    }
}
/*
 * 2.定义人类(Person)
  i.成员变量: 姓名(name),年龄(age)
  ii.成员方法: 使用手机玩游戏 (usePhone(Phone p))
  iii.提供空参和带参构造方法
  iv.提供setXxx和getXxx方法
 */

class Person {
    private String name;
    private int age;
    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
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
    //18岁的景甜在使用iPhone手机玩游戏
    public void usePhone(Phone p) {
        System.out.print(age+"岁的"+name+"在使用"+p.getBrand()+"手机");
    }
}

