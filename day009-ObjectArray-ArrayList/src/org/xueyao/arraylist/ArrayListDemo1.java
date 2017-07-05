package org.xueyao.arraylist;

import java.util.ArrayList;

/**
 * ArrayList���ϵı���
 *      ͨ��size()��get()���ʵ�ֵ�
 * @author Yao Xue
 * @date Jul 5, 2017 11:37:37 PM
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        //�������϶���
        ArrayList<String> array = new ArrayList<String>();
        
        //���Ԫ��
        array.add("hello");
        array.add("world");
        array.add("java");
        
        //��ȡԪ��
        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
        System.out.println("-----------");
        
        for (int i = 0; i < 3; i++) {
            System.out.println(array.get(i));
        }
        System.out.println("----------------");
        
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
        
        System.out.println("------------");
        
        //���׼���÷�
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            System.out.println(s);
        }
    }
}
