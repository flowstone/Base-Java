package org.xueyao.homework04;
/** ���ô�������
        ��ɫ��Tomè��Ժ�ץ����
        ��ɫ��Jerry����ԺͿ���
        Ҫ��: ��è�͹��Ĺ��Գ�ȡ����������

1.���嶯����(Animal)
  a)��Ա����
   i.���� name
   ii.��ɫ color
  b)��Ա����
   i.��  eat()  
    1.��ӡ��ʽ: ��ɫ��Tom�����ڳԶ���
  c)Ҫ��:
    i.��Ա��������Ȩ�����η�,�����ǹ���Ȩ�޵�.
2.����è��(Cat),�̳�Animal��
  a)��Ա����: ץ����(catchMouse())
    i.�ڷ����е������ʽΪ: ��ɫ��Tomè��ץ���� 
3.���幷��(Dog),�̳�Animal��
    a)��Ա����: ���� (lookHome())
       i.�ڷ����е������ʽΪ: ��ɫ��Jerry���ڿ��� 
4.���������Test
  a)�ṩmain����
  b)��main������
    i.ʹ�ÿղι���,����Cat����c
   ii.��c����ĳ�Աname��ֵΪTom
  iii.��c����ĳ�Աcolor��ֵΪ ��ɫ
   iv.����c�����Ա����eat����
    v.����c����ĳ�Ա����catchMouse()
   vi.ʹ�ÿղι���,����Dog���� d
  vii.��d����ĳ�Աname��ֵΪJerry
 viii.��d����ĳ�Աcolor��ֵΪ ��ɫ
   ix.����d�����Ա����eat����
    x.����d�����Ա���� lookHome����
 * @author Yao Xue
 * @date Jul 18, 2017 9:27:16 PM
 */
public class Test7 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.name = "Tom";
        c.color = "��ɫ";
        c.eat();
        c.catchMouse();
        
        Dog d = new Dog();
        d.name = "Jerry";
        d.color = "��ɫ";
        d.eat();
        d.lookHome();
    }
}

/*
1.���嶯����(Animal)
a)��Ա����
 i.���� name
 ii.��ɫ color
b)��Ա����
 i.��  eat()  
  1.��ӡ��ʽ: ��ɫ��Tom�����ڳԶ���
c)Ҫ��:
  i.��Ա��������Ȩ�����η�,�����ǹ���Ȩ�޵�.
*/

class Animal {
     String name;
     String color;
     
     public void eat() {
         //��ɫ��Tom�����ڳԶ���
         System.out.println(color+"��"+name+"�����ڳԶ���");
     }
    
}

/*2.����è��(Cat),�̳�Animal��
a)��Ա����: ץ����(catchMouse())
i.�ڷ����е������ʽΪ: ��ɫ��Tomè��ץ���� 
*/

class Cat extends Animal {
    public void catchMouse() {
        System.out.println(color+"��"+name+"è�ڳԶ���");
    }
}

/*
3.���幷��(Dog),�̳�Animal��
a)��Ա����: ���� (lookHome())
   i.�ڷ����е������ʽΪ: ��ɫ��Jerry���ڿ��� 
*/

class Dog extends Animal {
    public void lookHome() {
        System.out.println(color+"��"+name+"���ڿ���");

    }
}