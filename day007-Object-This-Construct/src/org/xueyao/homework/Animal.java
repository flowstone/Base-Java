package org.xueyao.homework;
/**
 * ��һ�⣺�����������󣬲��ô���ʵ��
    ������:
    ����:����
    ��Ϊ:��ˮ,�Զ���(��ʲô��ȷ��)
    ��Ӿ�ӿ�:
    ��Ϊ:��Ӿ����
    ����:
    ��Ϊ:�Է�(�й�ͷ)�� ��Ӿ(����)
    ����:
    ��Ϊ:�Է�(��в�)
    ������:
    ��Ϊ:�Է�(�Գ���)�� ��Ӿ(��Ӿ)
    ����Ա��:
    ��Ϊ:��������:�����Է��ͺ�ˮ
    ������:
    ��������Ա����,����Ա����������������:������,������,��������
    Ҫ��: 
        1.������д�����еĳԶ�������
        2.Ҫ�����������������Ӿ�ķ���(ʵ����Ӿ�ӿ�)
        2.����Ա���ж���һ������,���붯�������(����),ʹ��instanceofת��������,
        ���óԷ�����,�������Ӿ����Ҳ����в���
    
    ��ӡ���¸�ʽ�Ľ��:
    ����ˮ
    ���й�ͷ
    ���ṷ����Ӿ
    
    ���ܺ�ˮ
    ���ܳ�С��
    ���ܻ���Ӿ
    
    ���ˮ
    ��в�

 * @author Yao Xue
 * @date Jul 3, 2017 4:32:10 PM
 */
public class Animal {
    private int age;
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    
    public void drinkWater() {
        System.out.println("��ˮ");
    }
    
    public void eat() {
        
    }
    
}