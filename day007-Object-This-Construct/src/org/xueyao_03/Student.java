package org.xueyao_03;
/**
 * ѧ����  
 * ���췽����
 *      ����������ݽ��г�ʼ��
 * ��ʽ��
 *      ��������������ͬ
 *      û�з���ֵ���ͣ���void������д
 *      û�о���ķ���ֵ
 * ���췽����ע������
 *      A���������û�и������췽����ϵͳ�����ṩһ��Ĭ�ϵ��޲ι��췽������ʹ�á�
 *      B����� ���Ǹ����˹��췽����ϵͳ�������ṩĬ�ϵ��޲ι��췽��������ʹ�á�
 *        ���ʱ�����������ʹ���޲ι��췽�����ͱ����Լ��ṩ
 *        �Ƽ����Լ����޲ι��췽��
 *      C�����췽��Ҳ�ǿ������ص�
 * ��Ա������ֵ��
 *      A:setXxx()����
 *      B�����ι��췽��
 *      
 * 
 * @author Yao Xue
 * @date Jul 3, 2017 1:43:34 PM
 */
public class Student {
    
    private String name;
    private int age;
   /*public Student() {
       System.out.println("���ǹ��췽��");
   }*/
    
    public Student() {
        
    }
    public Student(String name) {
        this.name = name;
    }
    
    public Student(int age) {
        this.age = age;
    }
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void show() {
        System.out.println(name+"-----"+age);
    }
}

