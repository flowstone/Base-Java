package org.xueyao_04;
/**
 * ѧ����Ĳ�����
 * @author Yao Xue
 * @date Jul 3, 2017 3:09:48 PM
 */
public class StudentDemo {
    public static void main(String[] args) {
        
        //�޲�+setXxx
        Student s = new Student();
        s.setAge(28);
        s.setName("����ϼ");
        System.out.println(s.getName()+"-----"+s.getAge());
        
        //���ι��췽��
        Student s1 = new Student("����ϼ",28);
        System.out.println(s1.getName()+"-----"+s1.getAge());
        
    }
}
