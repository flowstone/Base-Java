package org.xueyao.day008;
/**
 * @author Yao Xue
 * @date Jul 14, 2017 4:34:21 PM
 */
public class Demo1_Code {
   public static void main(String[] args) {
       {
           int x = 10;  //�޶���������������
           System.out.println(x); 
       }
       
       Student s1 = new Student();
       System.out.println("-----------");
       Student s2 = new Student("����",23);
    }
}

class Student {
    private String name;
    private int age;
    
    public Student(){
        //study();
        System.out.println("�ղι���");
    }
    
    public Student(String name, int age) {
        //study();
        this.name = name;
        this.age = age;
        System.out.println("�вι���");
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
    
    {
        //�������飺ÿ����һ�ζ���ͻ�ִ��һ�Σ������ڹ��췽��ִ��
        //System.out.println("��������");
        study();
    }
    
    public void study() {
        System.out.println("ѧ��ѧϰ");
    }
    
    //��������ض����أ���ִֻ��һ��
    //���ã�����������г�ʼ����һ���������
    //��̬�������������������ִ��
    static {
        System.out.println("���Ǿ�̬�����");
    }
}
