package org.xueyao.homework_03;

import java.util.ArrayList;

import org.xueyao.homework.Student;

/**
 * @author Yao Xue
 * @date Jul 6, 2017 4:08:17 PM
 */
public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        
        Student[] students = new Student[10];
        students[0] = new Student("С��", 18, 56);
        students[1] = new Student("С��", 19, 57);
        students[2] = new Student("С��", 20, 64);
        students[3] = new Student("С��", 21, 56);
        students[4] = new Student("С��", 22, 60);
        students[5] = new Student("С��", 24, 80);
        students[6] = new Student("Сˮ", 26, 90);
        students[7] = new Student("С��", 24, 70);
        students[8] = new Student("С��", 29, 36);
        students[9] = new Student("С��", 17, 99);
        
        for (int i = 0; i < students.length; i++) {
            array.add(students[i]);
        }
        
        Student s = getMaxStudent(array);
        System.out.println(s.getName()+"---"+s.getAge()+"---"+s.getScore());
        getSumScore(array);
        getAverageScore(array);
        getCountInfo(array);
    }
    
  //��ȡ�ɼ���ߵ�ѧԱ
    public static Student getMaxStudent(ArrayList<Student> array) {
        Student s = new Student();
        int index = 0;
        int max = array.get(0).getScore();
        for (int i = 0; i < array.size(); i++) {
            Student student  = array.get(i);
            if (max < student.getScore()) {
                index = i;
            }
        }
        s = array.get(index);
        return s;
    }
    
    //��ȡѧ���ɼ���ƽ��ֵ
    public static void getAverageScore(ArrayList<Student> array) {
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            sum += s.getScore();
        }
        int average = sum / array.size();
        System.out.println("10��ѧ����ƽ����"+average);
    }
    
  //��ȡѧ���ɼ����ܷ�ֵ
    public static  void getSumScore(ArrayList<Student> array) {
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            sum += s.getScore();
        }
       
        System.out.println("10��ѧ�����ܳɼ�"+sum);
    }
    
    
  //��ӡ�������ѧԱ��Ϣ������
    public  static  void getCountInfo(ArrayList<Student> array) {
        int count = 0;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getScore() < 60) {
                System.out.println(s.getName()+"---"+s.getAge()+"---"+s.getScore());
                count++;
            }
        }
        System.out.println("�������ѧԱ���� "+count);
    }
}
