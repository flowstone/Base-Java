package org.xueyao.access;
/**
 * ѧ����
 * 
 * ͨ������ֱ�ӷ��ʳ�Ա��������������ݰ�ȫ����
 * ���ʱ�����Ǿ����ܲ��ܲ������Ķ���ֱ�ӷ��ʳ�Ա�����أ�
 * ��
 * ���ʵ����
 *      private�ؼ���
 *      
 * private:
 *      ��һ�����η�
 *      �������γ�Ա������Ҳ�������γ�Ա����
 *      �� private���εĳ�Աֻ���ڱ�����ʹ��
 * ���private���εĳ�Ա���������ǻ���Ӧ���ṩgetXxx()��setXxx()
 * ���ڻ�ȡ�����ó�Ա������ֵ��������public ����
 * @author Yao Xue
 * @date Jul 3, 2017 11:44:02 AM
 */
public class Student {
    String name;
    private int age;
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 200) {
            System.out.println("�������������");
        } else {
            this.age = age;
        }
    }

    public void show() {
        System.out.println("�����ǣ�"+name+"������"+age);
    }
}
