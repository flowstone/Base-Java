package org.xueyao.day008_02;
/**
 * @author Yao Xue
 * @date Jul 14, 2017 5:59:45 PM
 */
public class Demo5_Extends {
    public static void main(String[] args) {
        Son son = new Son();
    }
}

/*
 * ���������еĹ��췽��Ĭ�϶�����ʸ����пղ����Ĺ��췽��
 * ��Ϊ���� ��̳и����е����ݣ����� ����ʹ�ø�������� 
 * ���ԣ������ʼ��֮ǰ ��һ��Ҫ����ɸ������� �ĳ�ʼ��
 * ��ʵ��
 *      ÿһ�����췽���ĵ�һ�����Ĭ�϶���super()��Object�����ĸ���
 * */
class Father {
    public Father() {
       
        System.out.println("Father �Ĺ��췽��");
    }
}

class Son extends Father {
    public Son() {
        super();  //����һ����䣬��� ��д��ϵͳ��Ĭ�ϼ��ϣ��������ʸ����еĿղι��췽��
        System.out.println("Son �Ĺ��췽��");
    }
}
