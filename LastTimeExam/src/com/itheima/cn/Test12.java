package com.itheima.cn;

import java.util.ArrayList;

/**
 * /*1.����ArrayList���ϣ����������ַ�����"abc"��"123"�� "java"��"mysql"��"���ܰ�" 

2.��������,������С��4��Ԫ���������ַ���0�����ڿ���̨��ӡ����޸ĺ󼯺�������Ԫ�� 

��������ʽ���£� 

[0abc, 0123, java, mysql, 0���ܰ�] 

 * @author Yao Xue
 * @date Jul 9, 2017 5:03:02 PM
 */
public class Test12 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("abc");
        arrayList.add("123");
        arrayList.add("java");
        arrayList.add("mysql");
        arrayList.add("���ܰ�");
        
        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(i);
            if (s.length() < 4) {
                s = '0'+ s;
            }
            arrayList.set(i, s);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
