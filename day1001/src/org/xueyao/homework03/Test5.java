package org.xueyao.homework03;
/**
 * ���ô��������� С������һ����ֵ6000��iPhone�ֻ�
1.�����ֻ���
  a)����: Ʒ��(brand),�۸�(price)
  b)Ҫ��:
    i.�ṩ���ι���,setXxx��getXxx����
2.��������(Person)
  a)����: ����(name)
  b)��Ϊ:  ���ֻ�: Phone sellPhone() ,�ڷ����ڲ�ʹ������������Ϊ����ֵ 
  c)Ҫ��: �ṩ���ι���,setXxx��getXxx����
3.���������Test
  a)�ṩmain����
  b)��main������
    i.ʹ�ô��ι��촴��Person���� p,name��ʼ��ΪС��
   ii.���ö���p��sellPhone()����,��ֵ��Phone phone����
   iii.��main�������: С������һ����ֵ6000��iPhone�ֻ�
 * @author Yao Xue
 * @date Jul 18, 2017 8:59:50 PM
 * ����������Ϊ����ֵ
������Ϊ����ֵ����
 */
public class Test5 {
    public static void main(String[] args) {
        Person person = new Person("С��");
        Phone phone = person.sellPhone();
        System.out.println(person.getName()+"����һ����ֵ"+phone.getPrice()+"��"+phone.getBrand()+"�ֻ�");
    }
}

/*1.�����ֻ���
a)����: Ʒ��(brand),�۸�(price)
b)Ҫ��:
  i.�ṩ���ι���,setXxx��getXxx����
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

/*
2.��������(Person)
a)����: ����(name)
b)��Ϊ:  ���ֻ�: Phone sellPhone() ,�ڷ����ڲ�ʹ������������Ϊ����ֵ 
c)Ҫ��: �ṩ���ι���,setXxx��getXxx����
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
       return  new Phone("iPhone", 6000);
    }
}