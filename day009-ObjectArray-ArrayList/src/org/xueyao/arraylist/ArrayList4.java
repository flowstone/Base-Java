package org.xueyao.arraylist;

import java.util.ArrayList;

/**
 * �洢�Զ�����󲢱��� 
 * 
 * ������
 *      A������ѧ����
 *      B���������϶���
 *      C������ѧ������
 *      D����ѧ��������ΪԪ����ӵ�������
 *      E����������
 * @author Yao Xue
 * @date Jul 5, 2017 11:58:58 PM
 */
public class ArrayList4 {
    public static void main(String[] args) {
        //�������϶���
        ArrayList<Student> array = new ArrayList<Student>();
        
        //����ѧ������
        Student s1 = new Student("����ϼ",28);
        Student s2 = new Student("������",25);
        Student s3 = new Student("����",23);
        Student s4 = new Student("Ī��ε",21);
        
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            System.out.println(student.getName()+"-----"+student.getAge());
        }
    }
}
