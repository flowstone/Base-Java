package org.xueyao.homework05;
/**
 * 请用代码描述： 小王卖出一部价值6000的iPhone手机
1.定义手机类
  a)属性: 品牌(brand),价格(price)
  b)要求:
    i.提供带参构造,setXxx与getXxx方法
2.定义人类(Person)
  a)属性: 名称(name)
  b)行为:  卖手机: Phone sellPhone() ,在方法内部使用匿名对象作为返回值 
  c)要求: 提供带参构造,setXxx和getXxx方法
3.定义测试类Test
  a)提供main方法
  b)在main方法中
    i.使用带参构造创建Person对+D15象 p,name初始化为小王
   ii.调用对象p的sellPhone()方法,赋值给Phone phone变量
   iii.在main方法输出: 小王卖出一部价值6000的iPhone手机
 * @author Yao Xue
 * @date Jul 18, 2017 9:37:18 PM
 */
public class Test8 {
    public static void main(String[] args) {
        Person p = new Person("小王");
        Phone phone = p.sellPhone();
        System.out.println(p.getName()+"卖出一部价值"+phone.getPrice()+"的"+phone.getBrand()+"手机");
    }
}
/*
定义手机类
a)属性: 品牌(brand),价格(price)
b)要求:
  i.提供带参构造,setXxx与getXxx方法
*/

class Phone {
    private String brand;
    private int price;
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
    
    
}

/*2.定义人类(Person)
a)属性: 名称(name)
b)行为:  卖手机: Phone sellPhone() ,在方法内部使用匿名对象作为返回值 
c)要求: 提供带参构造,setXxx和getXxx方法
*/

class Person {
    private String name;

    public Person(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Phone sellPhone() {
        return new Phone("iPhone", 6000);
    }
}