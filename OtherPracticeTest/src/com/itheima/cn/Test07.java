package com.itheima.cn;

import java.util.ArrayList;

/**
 * 1.����һ��ѧ����Student�������ж�����������name(����)��String���ͣ�score(����)��int���ͣ�������˽�л����ṩget/set����
    2.��������࣬�ڲ������д�������Student���󣬵�һ����������Ը�ֵΪ��С�족,80;�ڶ�����������Ը�ֵΪ��С����,90;��������������Ը�ֵΪ��С����,95
    3.�ڲ������У����弯�ϣ�������������Student����洢�������У��������ϣ�����������ѧ����ƽ��ֵ����������������̨��
 * @author Yao Xue
 * @date Jul 9, 2017 8:27:17 AM
 */
public class Test07 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        
        student1.setName("С��");
        student1.setScore(80);
        
        student2.setName("С��");
        student2.setScore(90);
        
        student3.setName("С��");
        student3.setScore(95);
        
        ArrayList<Student> arrayList = new ArrayList<Student>();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        
        int sum = 0;
        
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i).getScore();
        }
        
        int avg = sum / arrayList.size();
        System.out.println("����ѧ����ƽ���֣�"+avg);
    }
}
