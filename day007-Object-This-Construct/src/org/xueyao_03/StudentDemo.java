package org.xueyao_03;
/**
 * ѧ����Ĳ�����
 * @author Yao Xue
 * @date Jul 3, 2017 1:46:10 PM
 */
public class StudentDemo {
    public static void main(String[] args) {
        //��ε��ù��췽���أ�
        //ͨ��new�ؼ��ֵ���
        //��ʽ������  ������ = new ���췽��(...);
        Student s = new Student();
        s.show();
        
        Student s2 = new Student("����ϼ");
        s2.show();
        
        Student s3 = new Student(28);
        s3.show();
        
        Student  s4 = new Student("����ϼ",28);
        s4.show();
    }
}
