package org.xueyao_05;
/**
 * ѧ��������
 * ����һ��������ֱ�ʹ���������췽��
 * @author Yao Xue
 * @date Jul 3, 2017 4:12:06 PM
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student(100);
        System.out.println("������"+s.getName()+", ��ߣ�"+s.getHeight());
        
        Student s2 = new Student("����ϼ");
        System.out.println("������"+s2.getName()+", ��ߣ�"+s2.getHeight());
        
        Student s1 = new Student("����ϼ", 166);
        System.out.println("������"+s1.getName()+", ��ߣ�"+s1.getHeight());
        
    }
}
