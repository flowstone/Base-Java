package org.xueyao.homework;
/**
 * 1.��������Ҫ����Teacher���Student��,����Ҫ˽��,���ɿղΡ��вι��죬setter��getter����
        2.���������,��main�����д�������Ķ��󲢸����Ը�ֵ(��ʾ���ַ���:setter�����͹��췽��)
        3.���ó�Ա����,��ӡ��ʽ����:
            ����Ϊ30����־����ʦ���ڳԷ�....
            ����Ϊ30����־����ʦ���ڿ��ܵĽ���Java��������������֪ʶ........("Java�������������"������ʦ���ε�����)    
            ����Ϊ18�ĺ���ͬѧ���ڳԷ�....          
            ����Ϊ18�ĺ���ͬѧ����ר����־��������������֪ʶ....("�������"����ѧ��ѧϰ������)
 * @author Yao Xue
 * @date Jul 3, 2017 5:37:19 PM
 */
public class TeacherStudentTest {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("��־��");
        t.setAge(30);
        t.setContent("Java�������������");
        t.eat();
        t.lesson();
        
        Student s = new Student();
        s.setName("����");
        s.setAge(18);
        s.setContent("�������");
        s.eat();
        s.study();
        
        System.out.println("-------------");
        Teacher t1 = new Teacher("��־��", 30, "Java�������������");
        t1.eat();
        t1.lesson();
        Student s1 = new Student("����", 18, "�������");
        s1.eat();
        s1.study();
        
    }
}
