package org.xueyao.studentmanager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ------- ��ӭ����ѧ������ϵͳ����ѡ�� -------
 * 1 �鿴����ѧ��
 * 2 ���ѧ��
 * 3 ɾ��ѧ��
 * 4 �޸�ѧ��
 * 5 �˳�
 * 
 * ��������Ҫ�޸ĵ�ѧ����ѧ�ţ�
 * ������˼����Ҫ�޸ĵ�ѧ�Ŷ�Ӧ��ѧ����Ϣ�����ڣ�������ѡ��
 * 
 * ���������µ�����
 * ���������µ�����
 * ���������µĵ�ַ
 * 
 * �޸�ѧ����Ϣ��ȷ
 * 
 * �������� Ҫɾ����ѧ����ѧ�ţ�
 * 
 * ������˼����Ҫɾ����ѧ�Ŷ�Ӧ��ѧ����Ϣ�����ڣ�������ѡ��
 * 
 * ɾ��ѧ���ɹ�
 * 
 * ������ѧ��ѧ�ţ�
 * �������ѧ���Ѿ���ռ�ã�����������
 * 
 * ������ѧ��������
 * ������ѧ�����䣺
 * ������ѧ����ס�أ�
 * ���ѧ���ɹ�
 * 
 * ������˼��Ŀǰû��ѧ����Ϣ�ɹ���ѯ�����ȥ
 * @author Yao Xue
 * @date Jul 7, 2017 11:07:54 AM
 */
public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<Student>();
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
                System.out.println("ллʹ��");
                System.exit(0);
                break;
            }
        }
    }
    

    private static void deleteStudent(ArrayList<Student> arrayList) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.println("�������� Ҫɾ����ѧ����ѧ�ţ�");
            id = sc.nextLine();
            Boolean flag = false;
            for (int i = 0; i < arrayList.size(); i++) {
                Student s = arrayList.get(i);
                if (!id.equals(s.getId())) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("������˼����Ҫɾ����ѧ�Ŷ�Ӧ��ѧ����Ϣ�����ڣ�������ѡ��");
            } else {
                break;
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            Student s = arrayList.get(i);
            if (id.equals(s.getId())) {
                arrayList.remove(i);
                System.out.println("ɾ��ѧ���ɹ�");
            }
        }
        
    }

    private static void addStudent(ArrayList<Student> arrayList) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.println("������ѧ��ѧ�ţ�");
            id = sc.nextLine();
            Boolean flag = false;
            for (int i = 0; i < arrayList.size(); i++) {
                Student s = arrayList.get(i);
                if (id.equals(s.getId())) {
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
        System.out.println("������ѧ�����䣺");
        String age = sc.nextLine();
        System.out.println("������ѧ����ס�أ�");
        String address = sc.nextLine();
        
        Student student = new Student(id,name, age, address);
        arrayList.add(student);
        System.out.println("���ѧ���ɹ�");
    }

   
    private static void findAllStudent(ArrayList<Student> arrayList) {
        // TODO Auto-generated method stub
        if (arrayList.size() == 0) {
            System.out.println("������˼��Ŀǰû��ѧ����Ϣ�ɹ���ѯ�����ȥ");
            return;
        }
        
        System.out.println("ѧ��\t\t����\t����\t��ס��");
        for (int i = 0; i < arrayList.size(); i++) {
            Student s = arrayList.get(i);
            System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
        }
    }

    private static void updateStudent(ArrayList<Student> arrayList) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.println("�������� Ҫ�޸ĵ�ѧ����ѧ�ţ�");
            id = sc.nextLine();
            Boolean flag = false;
            for (int i = 0; i < arrayList.size(); i++) {
                Student s = arrayList.get(i);
                if (id.equals(s.getId())) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            } else {
                System.out.println("������˼����Ҫ�޸ĵ�ѧ�Ŷ�Ӧ��ѧ����Ϣ�����ڣ�������ѡ��");
            }
        }
        System.out.println("���������µ�����");
        String name = sc.nextLine();
        System.out.println("���������µ�����");
        String age = sc.nextLine();
        System.out.println("���������µĵ�ַ");
        String address = sc.nextLine();
        
        for (int i = 0; i < arrayList.size(); i++) {
            Student s = arrayList.get(i);
            if (id.equals(s.getId())) {
                s.setId(id);
                s.setName(name);
                s.setAge(age);
                s.setAddress(address);
                arrayList.set(i,s);
                System.out.println("ɾ��ѧ���ɹ�");
            }
        }
        
    }
}
