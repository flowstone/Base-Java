package org.xueyao.homework02;
/**
 * ���ô��������� �����������ڿ������С˵(ʹ����������)
1.��������(Book)
   a)����: ����(name)
   b)Ҫ��:
       i.�ṩ���ι���,setXxx��getXxx����
2.��������(Person)
   a)����: ����(name)
   b)��Ϊ: ����: readBook(Book book) 
   c)Ҫ��: �ṩ���ι���
3.���������Test
   a)�ṩmain����
   b)��main������
     i.ʹ�ô��ι��촴��Person����,name��ʼ��Ϊ��������
     ii.ʹ�ø���������,����readBook(Book book) ������ʹ��Book�Ĵ��ι��촴��Book����,�����Ƴ�ʼ��Ϊ�����,��Book������������Ϊ��������readBook(Book book)����
  c)�����ʽ
     i.�����������ڿ������С˵
 * @author Yao Xue
 * @date Jul 18, 2017 8:45:45 PM
 */
public class Test4 {
    public static void main(String[] args) {
        Person person = new Person("��������");
        person.readBook(new Book("�����"));
    }
}

/*1.��������(Book)
a)����: ����(name)
b)Ҫ��:
    i.�ṩ���ι���,setXxx��getXxx����
*/

class Book {
    private String name;
    
    public Book(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

/*2.��������(Person)
   a)����: ����(name)
   b)��Ϊ: ����: readBook(Book book) 
   c)Ҫ��: �ṩ���ι���
 * */
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
    //�����������ڿ������С˵
    public void readBook(Book book) {
        System.out.println(name+"���ڿ�"+book.getName()+"С˵");
    }
 }