package org.xueyao.homework04;
/**
 * ��ʹ�ô��������� 38��İװٺ���һ����ֵΪ8000Ԫ��iPhone���ֻ�,����ʹ���߲��ֻ����𷲴�绰
  
1. �����ֻ���
 a)��Ա����
  i.Ʒ�� brand
  ii.�۸� price
 b)��Ա����
  i.��绰  public void call(String name)
 c)Ҫ��
  i.�ṩ�޲κʹ��ι���
  ii.�ṩsetXxx��getXxx����
2.����Person��
 a)��Ա����
  i.����(name)
  ii.����(age)
  iii.�ֻ�(Phone)
 b)��Ա����: ��绰: public void callTo(Person p)  ʹ���Լ����ֻ���ָ�����˴�绰
  i.�ڷ����ڲ������ֻ���call(String name) ����,��������˴�绰
 c)Ҫ��:
  i.�ṩ�޲κʹ��ι���
  ii.�ṩsetXxx��getXxx����
3.���������Test
 a)�ṩmain����
 b)��main������
  i.ʹ�ô��ι��촴���ֻ����� phone,Ʒ�Ƴ�ʼ��ΪiPhone,�۸��ʼ��Ϊ8000
  ii.ʹ���޲ι��촴��Person���� yuFan,����setName(String name)����,����������Ϊ��
  iii.ʹ�ô��ι��촴��Person���� baiBaiHe,���Ƴ�ʼ��Ϊ�װٺ�,�����ʼ��Ϊ38,�ֻ���ʼ��,���洴����phone����
  iv.baiBaiHe����,����call(Person p) ����,����yuFan����
  1.�����ʽ:  38��İװٺ�ʹ��8000Ԫ��iPhone���ֻ�,����ʹ���߲��ֻ����𷲴�绰
 * @author Yao Xue
 * @date Jul 18, 2017 9:07:27 PM
 */
public class Test6 {
    public static void main(String[] args) {
        Phone phone = new Phone("iPhone", 8000);
        Person yuFan = new Person();
        yuFan.setName("��");
        
        Person baiBaiHe = new Person("�װٺ�", 38, phone.getBrand());
        baiBaiHe.callTo(yuFan);
    }
}

/*
1. �����ֻ���
a)��Ա����
 i.Ʒ�� brand
 ii.�۸� price
b)��Ա����
 i.��绰  public void call(String name)
c)Ҫ��
 i.�ṩ�޲κʹ��ι���
 ii.�ṩsetXxx��getXxx����
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
2.����Person��
a)��Ա����
 i.����(name)
 ii.����(age)
 iii.�ֻ�(Phone)
b)��Ա����: ��绰: public void callTo(Person p)  ʹ���Լ����ֻ���ָ�����˴�绰
 i.�ڷ����ڲ������ֻ���call(String name) ����,��������˴�绰
c)Ҫ��:
 i.�ṩ�޲κʹ��ι���
 ii.�ṩsetXxx��getXxx����
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
    
    //b)��Ա����: ��绰: public void callTo(Person p)  ʹ���Լ����ֻ���ָ�����˴�绰
    public void callTo(Person p) {
        call(p.getName());
    }
    
    //i.�ڷ����ڲ������ֻ���call(String name) ����,��������˴�绰
    public void call(String name) {
        //38��İװٺ�ʹ��8000Ԫ��iPhone���ֻ�,����ʹ���߲��ֻ����𷲴�绰
        //System.out.println(age+"���"+name+"ʹ��"+);
    }
}