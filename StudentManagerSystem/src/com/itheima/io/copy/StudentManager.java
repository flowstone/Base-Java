package com.itheima.io.copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jul 9, 2017 8:57:58 AM
 */
public class StudentManager {
    public static void main(String[] args) throws IOException {
        String fileName = "student_list.txt";
        Scanner sc = new Scanner(System.in);
        
        while (true) {

            System.out.println("------- ��ӭ����ѧ������ϵͳ����ѡ�� -------");
            System.out.println("1 �鿴����ѧ��");
            System.out.println("2 ���ѧ��");
            System.out.println("3 ɾ��ѧ��");
            System.out.println("4 �޸�ѧ��");
            System.out.println("5 �˳�");
            System.out.println("���������ѡ��");
            String id = sc.nextLine();
            
            switch (id) {
                case "1":
                    //�鿴����ѧ��
                    findAllStudent(fileName);
                    break;
                case "2":
                    //���ѧ��
                    addStudent(fileName);
                    break;
                case "3":
                    //ɾ��ѧ��
                    deleteStudent(fileName);
                    break;
                case "4":
                    //�޸�ѧ��
                    updateStudent(fileName);
                    break;
                case "5":
                default:
                    System.out.println("ллʹ��");
                    System.exit(0);
            }
            
        }
    }
    
    
    private static void readData(String fileName,ArrayList<Student> arrayList) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line=bufferedReader.readLine())!=null) {
            String[] split = line.split(",");
            Student student = new Student();
            student.setId(split[0]);
            student.setName(split[1]);
            student.setAge(split[2]);
            student.setAddress(split[3]);
            
            arrayList.add(student);
        }
        bufferedReader.close();
    }
    
    private static void writeData(String fileName,ArrayList<Student> arrayList) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(student.getId());
            stringBuffer.append(",");
            stringBuffer.append(student.getName());
            stringBuffer.append(",");
            stringBuffer.append(student.getAge());
            stringBuffer.append(",");
            stringBuffer.append(student.getAddress());
            
            bufferedWriter.write(stringBuffer.toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();
    }
   //�鿴����ѧ��
    private static void findAllStudent(String fileName) throws IOException {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        readData(fileName, arrayList);
        if (arrayList.size() == 0) {
            System.out.println("������˼��Ŀǰû��ѧ����Ϣ");
            return;
        }
        
        System.out.println("ѧ��\t\t����\t����\t��ס��\t");
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            System.out.println(student.getId()+"\t"+student.getName()+"\t"+student.getAge()+"\t"+student.getAddress());
        }
        
    }
    
    //���ѧ��
    private static void addStudent(String fileName) throws IOException {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        readData(fileName, arrayList);
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.println("���������ѧ��");
            id = sc.nextLine();
            boolean flag = false;
            for (int i = 0; i < arrayList.size(); i++) {
                if (id.equals(arrayList.get(i).getId())) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("ѧ���ظ�");
            } else {
                break;
            }
        }
        
        System.out.println("�������������");
        String name = sc.nextLine();
        System.out.println("�������������");
        String age = sc.nextLine();
        System.out.println("��������ľ�ס��");
        String address = sc.nextLine();
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        
        arrayList.add(student);
        writeData(fileName, arrayList);
        System.out.println("���ѧ����Ϣ�ɹ�");
        
    }
    
    //ɾ��ѧ��
    private static void deleteStudent(String fileName) throws IOException {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        readData(fileName, arrayList);
        if (arrayList.size() == 0) {
            System.out.println("������˼��Ŀǰû��ѧ����Ϣ");
            return;
        }

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("��������Ҫɾ��ѧ����ѧ��");
            String id = sc.nextLine();
            boolean flag = false;
            for (int i = 0; i < arrayList.size(); i++) {
                Student s = arrayList.get(i);
                if (id.equals(s.getId())) {
                    flag = true;
                    arrayList.remove(i);
                    break;
                }
            }
            if (!flag) {
                System.out.println("û�и�ѧ��ѧ������Ϣ");
            } else {
                break;
            }
        }
        writeData(fileName, arrayList);
        System.out.println("ɾ��ѧ����Ϣ�ɹ�");
    }
    
    //����ѧ��
    private static void updateStudent(String fileName) throws IOException {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        readData(fileName, arrayList);
        if (arrayList.size() == 0) {
            System.out.println("������˼��Ŀǰû��ѧ����Ϣ");
            return;
        }

        int index = -1;
        Scanner sc = new Scanner(System.in);
        
        String id;
        while (true) {
            System.out.println("��������Ҫ�޸ĵ�ѧ����ѧ��");
            id = sc.nextLine();
            
            for (int i = 0; i < arrayList.size(); i++) {
                Student student = arrayList.get(i);
                if (id.equals(student.getId())) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                System.out.println("������ѧ����ѧ�Ų�����");
            } else {
                break;
            }
        }
        
        System.out.println("�������µ�������");
        String name = sc.nextLine();
        System.out.println("�������µ����䣺");
        String age = sc.nextLine();
        System.out.println("�������µĵ�ַ��");
        String address = sc.nextLine();
        
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        
        arrayList.set(index, student);
        writeData(fileName, arrayList);
        System.out.println("�޸�ѧ����Ϣ�ɹ�");
        
    }
    


}
