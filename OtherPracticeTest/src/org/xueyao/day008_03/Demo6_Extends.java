package org.xueyao.day008_03;
/**
 * @author Yao Xue
 * @date Jul 14, 2017 6:10:16 PM
 */
public class Demo6_Extends {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println("-----------");
        Son son2 = new Son("С��", 18);
    }
    
}

/*
 * ����û���޲ι��췽�������� ��ô�죿
 * super���
 * this���
 * 
 * ע������
 *      super() ����this() ��������ڹ��췽���ĵ�һ�������
 * */


class Father {
    private String name;  //����
    private int age;      //����
    
    public Father() {
        System.out.println("Father �ղι���");
    }

    public Father(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Father �ղι���");

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
    
    
}


class Son extends Father{
    public Son() {
        this("����", 25);   //�����еĹ��췽��
        //super("����",24);   //���ø����еĹ��췽��
        System.out.println("Son �ղι���");
    }
    
    public Son(String name, int age) {
        System.out.println("Son �вι���");

    }
}