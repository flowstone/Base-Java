package org.xueyao.arraylist;

import java.util.ArrayList;

/**
 * �洢�ַ���������
 * 
 * ������
 *      A:�������϶���
 *      B������ַ���Ԫ��
 *      C����������
 * @author Yao Xue
 * @date Jul 5, 2017 11:43:23 PM
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        //��������
        ArrayList<String> array = new ArrayList<String>();
        
        //����ַ���Ԫ��
        array.add("������");
        array.add("������");
        array.add("������");
        array.add("������");
        
        //��������
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            System.out.println(s);
        }
    }
}
