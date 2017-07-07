package com.itheima.studentmanager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jul 7, 2017 4:03:03 PM
 */
public class StudentManagerTest {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        while (true) {
            System.out.println("--------��ӭ����ѧ������ϵͳ--------");
            System.out.println("1 �鿴����ѧ��");
            System.out.println("2 ���ѧ��");
            System.out.println("3 ɾ��ѧ��");
            System.out.println("4 �޸�ѧ��");
            System.out.println("5 �˳�");
            System.out.println("���������ѡ��");
            
            Scanner sc = new Scanner(System.in);
            String choiceString = sc.nextLine();
            switch (choiceString) {
            case "1":
                //�鿴����ѧ��
                findAllStudent(arrayList);
                break;
            case "2":
                //���ѧ��
                addStudent(arrayList);
                break;
            case "3":
                //ɾ��ѧ��
                deleteStudent(arrayList);
                break;
            case "4":
                //�޸�ѧ��
                updateStudent(arrayList);
                break;
            case "5":
            default:
                System.out.println("лл���ʹ��");
                System.exit(0); //JVM�˳�
                break;
            }
        }
    }

    private static void updateStudent(ArrayList<Student> arrayList) {
        if (arrayList.size() == 0) {
            System.out.println("û��ѧ������");
            return;
        }
        Scanner sc = new Scanner(System.in);
        String id;
        int index = -1;
        while (true) {
            System.out.println("������Ҫ�޸ĵ�ѧ����ѧ��");

            id = sc.nextLine();
            for (int i = 0; i < arrayList.size(); i++) {
                Student s = arrayList.get(i);
                if (s.getId().equals(id)) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                System.out.println("������˼����Ҫ�޸ĵ�ѧ�Ŷ�Ӧ��ѧ����Ϣ�����ڣ����ȥ�������ѡ��");
            } else {
                break;
            }
        }
        
        
        Student student = new Student();
        System.out.println("�������µ�����");
        String name = sc.nextLine();
        System.out.println("�������µ�����");
        String age = sc.nextLine();
        System.out.println("�������µĵ�ַ");
        String address = sc.nextLine();
        
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        arrayList.set(index, student);
        System.out.println("�޸�ѧ����Ϣ�ɹ�");
        
    }

    private static void deleteStudent(ArrayList<Student> arrayList) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("������Ҫɾ����ѧ����ѧ��");
            String id = sc.nextLine();
            int index = -1;
            for (int i = 0; i < arrayList.size(); i++) {
                Student s = arrayList.get(i);
                if (id.equals(s.getId())) {
                    index = i;
                    arrayList.remove(index);
                    break;
                }
            }
            if (index == -1) {
                System.out.println("������˼����Ҫɾ����ѧ�Ŷ�Ӧ��ѧ����Ϣ�����ڣ����ȥ�������ѡ��");
            } else {
                break;
            }
        }
        
        System.out.println("ɾ���ɹ�");
    }
    
    //���ѧ��
    private static void addStudent(ArrayList<Student> arrayList) {
        //��������¼�����
        Scanner sc = new Scanner(System.in);
        String id;
        //Ϊ���ô����ܹ��ص���ʱ����ѭ��
        while (true) {
            System.out.println("������ѧ����ѧ��");
            id = sc.nextLine();
            boolean flag = false;
            for (int i = 0; i < arrayList.size(); i++) {
                Student student = arrayList.get(i);
                if (student.getId().equals(id)) {
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
        String name = sc.nextLine();
        System.out.println("������ѧ��������");
        String age = sc.nextLine();
        System.out.println("������ѧ���ľ�ס��");
        String address = sc.nextLine();
        
        //����ѧ������
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        
        //��ѧ��������ΪԪ����ӵ�������
        arrayList.add(student);
        System.out.println("���ѧ����Ϣ�ɹ�");
        
    }

    private static void findAllStudent(ArrayList<Student> arrayList) {
        
        if (arrayList.size() == 0) {
            System.out.println("������˼��Ŀǰû��ѧ����Ϣ�ɹ���ѯ�����ȥ����ѡ����Ĳ���");
            return;
        }
        System.out.println("ѧ��\t\t����\t����\t��ס��");
        for (int i = 0; i < arrayList.size(); i++) {
            Student s = arrayList.get(i);
            System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
        }
    }
}
