package org.xueyao.object;
/**
 * ����һ��ѧ�����飬�洢����ѧ�����󲢱���
 * 
 * ������
 *      A������ѧ����
 *      B������ѧ������
 *      C:����ѧ������
 *      D����ѧ��������ΪԪ�ظ�ֵ��ѧ������ 
 *      E������ѧ������
 * @author Yao Xue
 * @date Jul 5, 2017 10:42:57 PM
 */
public class StudentDemo {
    public static void main(String[] args) {
        //����ѧ������ 
        Student[] students = new Student[3];
        
        //����ѧ������
        Student s1 = new Student("С��", 20);
        Student s2 = new Student("С��", 22);
        Student s3 = new Student("С��", 23);
        
        //��ѧ��������ΪԪ�ظ�ֵ��ѧ������
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        
        //����ѧ������ 
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
//            System.out.println(student);
            System.out.println(student.getName()+"---"+student.getAge());
        }
    }
}
