package com.itheima.arraylist;

import java.util.ArrayList;

/**
 * �½�һ���洢�ַ�������
�洢��hello��,��world��,��java��
����forѭ�������������е�Ԫ��

 * @author Yao Xue
 * @date Jul 7, 2017 11:24:12 AM
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        
        //�洢��hello��,��world��,��java��
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");

        //System.out.println(arrayList);
        //����forѭ�������������е�Ԫ��
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}   
