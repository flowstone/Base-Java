package org.xueyao.arraylist1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ����һ�����ϣ��洢ѧ������ѧ��������������Լ���¼�룬��󣬱�������
 * @author Yao Xue
 * @date Jul 6, 2017 12:13:32 AM
 */
public class ArrayListScanner {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        
        addStudent(array);
        addStudent(array);
        addStudent(array);
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            System.out.println(student.getName()+"---"+student.getAge());
        }
    }

    private static void addStudent(ArrayList<Student> array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������ѧ��������");
        String name = scanner.nextLine();
        System.out.println("������ѧ�����䣺");
        String age = scanner.nextLine();
        
        Student student= new Student();
        student.setAge(age);
        student.setName(name);
        
        array.add(student);
    }
}
