package org.xueyao06.school;
/**
 * @author Yao Xue
 * @date Jul 19, 2017 11:59:00 AM
 */
public class SchoolDemo {
    public static void main(String[] args) {
        SchoolMaster schoolMaster = new SchoolMaster();
        schoolMaster.name = "�仨";
        schoolMaster.age = 50;
        schoolMaster.gender = '��';
        schoolMaster.years = 30;
        
        schoolMaster.introduce();
        
        Student s = new Student();
        s.name = "����";
        s.age = 18;
        s.gender = 'Ů';
        s.num = 9527;
        s.introduce();
    }
}


class Person {
    String name;
    int age;
    char gender;
    public void introduce() {
        System.out.println("�ҽ�"+name+",���"+age+"��,�Ա�"+gender);
    }
}

class SchoolMaster extends Person {
    int years; //��������
}

class Student extends Person {
    int num; //ѧ��
}

class Teacher extends Person {
    String field; //��ѧ����
}