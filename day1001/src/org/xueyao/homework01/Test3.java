package org.xueyao.homework01;
/**" ���ô�������: �ܽ��������ݳ��ջ�̨����(ʹ����������)
1.����Person��
  a)����: ����(name)
  b)��Ϊ: ����(void sing(String song))
  c)Ҫ�� �ṩ���ι��췽��
2.���������Test
 a)�ṩmain����
 b)��main������
   i.ʹ�ô��ι��촴��Person����,��name��ֵΪ�ܽ���
  ii.ʹ�����洴��������������ó���ķ���;����ķ��������ʽΪ
     �ܽ��������ݳ��ջ�̨����"

 * @author Yao Xue
 * @date Jul 18, 2017 8:53:17 PM
 */
public class Test3 {
    public static void main(String[] args) {
        new Person("�ܽ���").sing("�ջ�̨");
    }
}

/*
 * 1.����Person��
  a)����: ����(name)
  b)��Ϊ: ����(void sing(String song))
  c)Ҫ�� �ṩ���ι��췽��
*/
class Person {
    private String name;

    public Person(String name) {
        super();
        this.name = name;
    }
    //�ܽ��������ݳ��ջ�̨����
    public void sing(String song) {
        System.out.println(name+"�����ݳ�"+song+"����");
    }
}
