package org.xueyao.arraylist;

import java.util.ArrayList;

/**
 * ��ȡԪ��
 *      public E get(int index):����ָ����������Ԫ��
 * ���ϳ���
 *      public int size():���ؼ�����Ԫ�صĸ���
 * ɾ��Ԫ��
 *      public boolean remove(Object o):ɾ��ָ��Ԫ�أ�����ɾ���Ƿ�ɹ�
 *      public E remove(int index): ɾ��ָ����������Ԫ�أ����ر�ɾ����Ԫ��
 * �޸�Ԫ��
 *      public E set(int index,E elemet)���޸�ָ����������Ԫ�أ����ر��޸ĵ�Ԫ��
 * 
 * @author Yao Xue
 * @date Jul 5, 2017 11:09:50 PM
 */
public class ArrayListCURD {
    public static void main(String[] args) {
        //�������϶���
        ArrayList<String> array = new ArrayList<String>();
        
        array.add("hello");
        array.add("world");
        array.add("java");
        
        //public E get(int index):����ָ����������Ԫ��
        //System.out.println("get:"+array.get(0));
        //System.out.println("get:"+array.get(1));
        //System.out.println("get:"+array.get(2));
        
        //public int size():���ؼ�����Ԫ�صĸ���
        //System.out.println("size:"+array.size());
        
        //public boolean remove(Object o):ɾ��ָ��Ԫ�أ�����ɾ���Ƿ�ɹ�
        //System.out.println("remove:"+array.remove("world")); //true
        //System.out.println("remove:"+array.remove("world"));  //false
        
        //public E remove(int index): ɾ��ָ����������Ԫ�أ����ر�ɾ����Ԫ��
        //System.out.println("remove:"+array.remove(0));
        
        //public E set(int index,E elemet)���޸�ָ����������Ԫ�أ����ر��޸ĵ�Ԫ��
        System.out.println("set:"+array.set(1, "android"));
        //���
        System.out.println(array);
    }
}
