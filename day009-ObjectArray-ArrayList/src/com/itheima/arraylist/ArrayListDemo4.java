package com.itheima.arraylist;

import java.util.ArrayList;

/**
 * �Զ���һ��ѧ����,ѧ��������������������,�������ι�����ղι����������Զ�Ӧ��getter/setter����
        �ڲ�������ʹ�����ι��촴������ѧ������,Ȼ��ÿ��ѧ���������ӵ�ArrayList������
        �������ArrayList����,���δ�ӡ��ÿ��ѧ��������������
 * @author Yao Xue
 * @date Jul 7, 2017 2:46:44 PM
 */
public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        Student student = new Student("����",24,"Ů");
        Student student1 = new Student("С��",18,"Ů");
        Student student2 = new Student("С��",24,"��");
        
        arrayList.add(student);
        arrayList.add(student1);
        arrayList.add(student2);
        
        //��������
        for (int i = 0; i < arrayList.size(); i++) {
            Student s = arrayList.get(i);
            System.out.println(s.getName()+"----"+s.getAge()+"----"+s.getSex());
        }
    }
}

