package com.itheima;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jul 6, 2017 12:36:31 PM
 */
public class StudentManangerTest {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        while (true) {
            System.out.println("------- ��ӭ����ѧ������ϵͳ����ѡ�� -------");
            System.out.println("1 �鿴����ѧ��");
            System.out.println("2 ���ѧ��");
            System.out.println("3 ɾ��ѧ��");
            System.out.println("4 �޸�ѧ��");
            System.out.println("5 �˳�");
            
            System.out.println("���������ѡ��");
            Scanner sc = new Scanner(System.in);
            String number = sc.nextLine().trim();
            switch (number) {
            case "1":
                //�鿴����ѧ��
                findAllStudent(array);
                break;
            case "2":
                //���ѧ��
                addStudent(array);
                break;
            case "3":
                //ɾ��ѧ��
                deleteStudent(array);
                break;
            case "4":
                //�޸�ѧ��
                updateStuent(array);
                break;  
            case "5":
            default:
                System.out.println("ллʹ��");
                System.exit(0);
            }
        }
        
       
    }
    //�޸�ѧ��
    private static void updateStuent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("������˼��Ŀǰû��ѧ����Ϣ");
            return;
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("��������Ҫ�޸ĵ�ѧ����ѧ�ţ�");
        String id = sc.nextLine();
        
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getId().equals(id)) {
                index = i;
                break;
            }
        }
        
        if (index == -1) {
            System.out.println("������˼����Ҫ�޸ĵ�ѧ�Ŷ�Ӧ��ѧ����Ϣ�����ڣ�������ѡ��");
            return;
        } 
        
        System.out.println("���������µ�����");
        String name = sc.nextLine().trim();
        System.out.println("���������µ�����");
        String age = sc.nextLine().trim();
        System.out.println("���������µĵ�ַ");
        String address = sc.nextLine().trim();
        Student s = new Student();
        s.setId(id);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        array.set(index,s);
        
        System.out.println("�޸�ѧ����Ϣ��ȷ");
    }
    //ɾ��ѧ��
    private static void deleteStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("������˼��Ŀǰû��ѧ����Ϣ");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("�������� Ҫɾ����ѧ����ѧ�ţ�");
        String id = sc.nextLine().trim();
        
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getId().equals(id)) {
                index = i;
                break;
            }
        }
        
        if (index == -1) {
            System.out.println("������˼����Ҫɾ����ѧ�Ŷ�Ӧ��ѧ����Ϣ�����ڣ�������ѡ��");
        } else {
            array.remove(index);
            System.out.println("ɾ��ѧ���ɹ�");
        }
        
    }
    
    //���ѧ��
    private static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.println("������ѧ��ѧ�ţ�");
            id = sc.nextLine().trim();
            
            Boolean flag = false;
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                if (id.equals(s.getId())) {  //˵��ѧ�ű�ռ��
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("�������ѧ���Ѿ���ռ�ã�����������");
            } else {
                break;
            }
        }
        System.out.println("������ѧ��������");
        String name = sc.nextLine().trim();
        System.out.println("������ѧ�����䣺");
        String age = sc.nextLine().trim();
        System.out.println("������ѧ����ס�أ�");
        String address = sc.nextLine().trim();
        
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        
        array.add(student);
        
        System.out.println("���ѧ���ɹ�");
        
    }
    //�鿴ѧ��
    private static void findAllStudent(ArrayList<Student> array) {
        // TODO Auto-generated method stub
        if (array.size() == 0) {
            System.out.println("������˼��Ŀǰû��ѧ����Ϣ�ɹ���ѯ�����ȥ");
            return;
        } 
        
        System.out.println("ѧ��\t\t����\t����\t��ס��");
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            System.out.println(student.getId()+"\t"+student.getName()+"\t"+student.getAge()+"\t"+student.getAddress());
        }
    }
}
