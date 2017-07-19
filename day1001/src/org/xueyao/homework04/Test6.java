package org.xueyao.homework04;
/**
 * 请使用代码描述： 38岁的白百合有一部价值为8000元的iPhone的手机,她在使用者部手机给羽凡打电话
  
1. 定义手机类
 a)成员变量
  i.品牌 brand
  ii.价格 price
 b)成员方法
  i.打电话  public void call(String name)
 c)要求
  i.提供无参和带参构造
  ii.提供setXxx和getXxx方法
2.定义Person类
 a)成员变量
  i.姓名(name)
  ii.年龄(age)
  iii.手机(Phone)
 b)成员方法: 打电话: public void callTo(Person p)  使用自己的手机给指定的人打电话
  i.在方法内部调用手机的call(String name) 方法,给传入的人打电话
 c)要求:
  i.提供无参和带参构造
  ii.提供setXxx和getXxx方法
3.定义测试类Test
 a)提供main方法
 b)在main方法中
  i.使用带参构造创建手机对象 phone,品牌初始化为iPhone,价格初始化为8000
  ii.使用无参构造创建Person对象 yuFan,调用setName(String name)方法,把名称设置为羽凡
  iii.使用带参构造创建Person对象 baiBaiHe,名称初始化为白百合,年龄初始化为38,手机初始化,上面创建的phone对象
  iv.baiBaiHe对象,调用call(Person p) 方法,传入yuFan对象
  1.输出格式:  38岁的白百合使用8000元的iPhone的手机,她在使用者部手机给羽凡打电话
 * @author Yao Xue
 * @date Jul 18, 2017 9:07:27 PM
 */
public class Test6 {
    public static void main(String[] args) {
        Phone phone = new Phone("iPhone", 8000);
        Person yuFan = new Person();
        yuFan.setName("羽凡");
        
        Person baiBaiHe = new Person("白百合", 38, phone.getBrand());
        baiBaiHe.callTo(yuFan);
    }
}

/*
1. 定义手机类
a)成员变量
 i.品牌 brand
 ii.价格 price
b)成员方法
 i.打电话  public void call(String name)
c)要求
 i.提供无参和带参构造
 ii.提供setXxx和getXxx方法
*/
class Phone {
    private String brand;
    private int price;
    public Phone() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Phone(String brand, int price) {
        super();
        this.brand = brand;
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
    public void call(String name) {
        
    }
}
/*
2.定义Person类
a)成员变量
 i.姓名(name)
 ii.年龄(age)
 iii.手机(Phone)
b)成员方法: 打电话: public void callTo(Person p)  使用自己的手机给指定的人打电话
 i.在方法内部调用手机的call(String name) 方法,给传入的人打电话
c)要求:
 i.提供无参和带参构造
 ii.提供setXxx和getXxx方法
*/
class Person {
    private String name;
    private int age;
    private String Phone;
    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Person(String name, int age, String phone) {
        super();
        this.name = name;
        this.age = age;
        Phone = phone;
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
    public String getPhone() {
        return Phone;
    }
    public void setPhone(String phone) {
        Phone = phone;
    }
    
    //b)成员方法: 打电话: public void callTo(Person p)  使用自己的手机给指定的人打电话
    public void callTo(Person p) {
        call(p.getName());
    }
    
    //i.在方法内部调用手机的call(String name) 方法,给传入的人打电话
    public void call(String name) {
        //38岁的白百合使用8000元的iPhone的手机,她在使用者部手机给羽凡打电话
        //System.out.println(age+"岁的"+name+"使用"+);
    }
}