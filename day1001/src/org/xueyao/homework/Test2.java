package org.xueyao.homework;
/**
 *   ��ʹ�ô�������:  18��ľ�����ʹ��iPhone�ֻ�����Ϸ
1.�����ֻ���(Phone)
   i.��Ա����:  Ʒ��(brand)
   ii.��Ա����:  ����Ϸ(void playGame())
  iii.�ṩ�ղκʹ��ι��췽��
   iv.�ṩsetXxx��getXxx����
2.��������(Person)
  i.��Ա����: ����(name),����(age)
  ii.��Ա����: ʹ���ֻ�����Ϸ (usePhone(Phone p))
  iii.�ṩ�ղκʹ��ι��췽��
  iv.�ṩsetXxx��getXxx����
3.����Test��
  a)�ṩmain����
  b)��main������
    i.�����ֻ�����,�����ֻ�Ʒ�Ƹ�ֵΪiPhone
   ii.����Person����,�������Ƹ�ֵΪ����,���丳ֵΪ18
  iii.����Person�����,usePhone����,�����ֻ�����
   iv.��ӡ��ʽ����:
        18��ľ�����ʹ��iPhone�ֻ�����Ϸ
 * @author Yao Xue
 * @date Jul 18, 2017 8:27:13 PM
 */
public class Test2 {
    public static void main(String[] args) {
        
        Person person = new Person();
        person.setName("����");
        person.setAge(18);
        person.usePhone(new Phone("iPhone"));
        Phone phone = new Phone();
        phone.playGame();
    }
}

/*
 * 1.�����ֻ���(Phone)
   i.��Ա����:  Ʒ��(brand)
   ii.��Ա����:  ����Ϸ(void playGame())
   iii.�ṩ�ղκʹ��ι��췽��
   iv.�ṩsetXxx��getXxx����
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
        System.out.println("����Ϸ");
    }
}
/*
 * 2.��������(Person)
  i.��Ա����: ����(name),����(age)
  ii.��Ա����: ʹ���ֻ�����Ϸ (usePhone(Phone p))
  iii.�ṩ�ղκʹ��ι��췽��
  iv.�ṩsetXxx��getXxx����
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
    //18��ľ�����ʹ��iPhone�ֻ�����Ϸ
    public void usePhone(Phone p) {
        System.out.print(age+"���"+name+"��ʹ��"+p.getBrand()+"�ֻ�");
    }
}

