package org.xueyao07.privated;
/**
 * @author Yao Xue
 * @date Jul 19, 2017 1:21:41 PM
 */
public class SchoolDemo {
    public static void main(String[] args) {
        SchoolMaster master = new SchoolMaster();
        master.name = "�仨";
        master.age = 50;
        master.gender = '��';
        master.years = 30;
        
        master.introduce();
    }
}

class Person {
    String name = "����Ĵ仨";
    int age;
    char gender;
}

class SchoolMaster extends Person {
    String name;
    int years; //��������
    public void introduce() {
        //super��ʾ���������ڴ��еĸ�������
        System.out.println("�ҽ�"+super.name+",���"+age+"�꣬�Ա�"+gender);
    }
}

class Student extends Person {
    int num; //ѧ��
}

class Teacher extends Person {
    String field; //��ѧ����
}
