package org.xueyao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * ����¼��3��ѧ����Ϣ(ѧ��,����,����,��ס��)���뼯�ϡ�Ȼ��������ϰ�ÿһ��ѧ����Ϣ�����ı��ļ�
 * (ÿһ��ѧ����ϢΪһ�����ݣ��Լ�����ָ���)
 * 
 * ������
 *      ����ѧ����
 *      �������϶���
 *      д����ʵ�ּ���¼��ѧ����Ϣ������ѧ��������ΪԪ����ӵ�����
 *      �����������������
 *      �������ϣ��õ���һ��ѧ����Ϣ������ѧ����Ϣ����һ���ĸ�ʽд���ı��ļ�
 *              ������studentid001,���30���Ϻ�
 * @author Yao Xue
 * @date Jul 9, 2017 2:30:16 PM
 */
public class ArrayListToFileTest {
    public static void main(String[] args) throws IOException {
        //�������϶���
        ArrayList<Student> arrayList = new ArrayList<Student>();
        
        //д����ʵ�ּ���¼��ѧ����Ϣ������ѧ��������ΪԪ����ӵ�����
        addStudent(arrayList);
        addStudent(arrayList);
        addStudent(arrayList);
        
        //�����������������
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("array.txt",true));
        //�������ϣ��õ���һ��ѧ����Ϣ������ѧ����Ϣ����һ���ĸ�ʽд���ı��ļ�
        
        for (int i = 0; i < arrayList.size(); i++) {
            Student s = arrayList.get(i);
            //bufferedWriter.write(s.getId()+","+s.getName()+","+s.getAge()+","+s.getAddress());
            //bufferedWriter.newLine();
            StringBuilder sb = new StringBuilder();
            sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
            bufferedWriter.write(sb.toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();
    }

    private static void addStudent(ArrayList<Student> arrayList) {
        Scanner sc = new Scanner(System.in); 
        String id;
        while (true) {
            System.out.println("������ѧ����ѧ��");
            id = sc.nextLine();
            boolean flag = false;
            for (int i = 0; i < arrayList.size(); i++) {
                if (id.equals(arrayList.get(i).getId())) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("�Բ����������ѧ����ѧ���ظ�������������");
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
        
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        
        arrayList.add(student);
        System.out.println("���ѧ����Ϣ�ɹ�");
    }
}
