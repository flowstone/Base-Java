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
        Student s1 = new Student();
        s1.setName("С��");
        s1.setScore(80);
        Student s2 = new Student();
        s2.setName("С��");
        s2.setScore(90);
        Student s3 = new Student();
        s3.setName("С��");
        s3.setScore(95);
        
        ArrayList<Student> arrayList = new ArrayList<Student>();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i).getScore();
        }
        
        int avg = sum / arrayList.size();
        System.out.println("����ѧ����ƽ���֣�"+avg);
    }
}
