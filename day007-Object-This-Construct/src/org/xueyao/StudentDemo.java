package org.xueyao;
/**
 * Student��һ��ѧ�����������࣬main�������ʺϷ���������
 * ʹ��һ���࣬��ʵ����ʹ�ø���ĳ�Ա(��Ա�����ͳ�Ա����)
 * ������Ҫ��ʹ��һ����ĳ�Ա���ͱ�������ӵ�и���Ķ���
 * ��δ�������
 *      ��ʽ�� ����  ������ = new ����();
 * ������� ���ʳ�Ա��
 *      ��Ա������ ������.������
 *      ��Ա������������.������(....)
 * @author Yao Xue
 * @date Jul 3, 2017 10:26:42 AM
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
       // System.out.println("s:"+s);
        System.out.println("������"+s.name);
        System.out.println("���䣺"+s.age);
        System.out.println("------------");
        s.age = 10;
        s.name = "���µ�һ˧";
        System.out.println("������"+s.name);
        System.out.println("���䣺"+s.age);
        
        System.out.println("---------");
        s.study();
        s.eat();
    }
}
