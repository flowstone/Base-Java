package com.itheima.arraylist;

import java.util.ArrayList;

/**
 * ��ȡԪ��
 *      public E get(int index) ���ؼ����е�Ԫ��
 *���ϳ���
 *
 *  ɾ������
 *      
 *  �޸�Ԫ��
 *  
 *      public E set()
 * @author Yao Xue
 * @date Jul 7, 2017 10:46:01 AM
 */
public class ArrayLIstDemo2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        
        //���Ԫ��
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");
        
        //��ȡԪ��
        //System.out.println("get:"+arrayList.get(0));
        //System.out.println("get:"+arrayList.get(1));
        //System.out.println("get:"+arrayList.get(02));
        
        //ɾ��
        //System.out.println("remove:"+arrayList.remove("world"));
        
        //�޸�
        System.out.println("set:"+arrayList.set(2, "PHP"));
        
        //���
        System.out.println("array:"+arrayList);
    }
}
