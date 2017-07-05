package org.xueyao.arraylist;

import java.util.ArrayList;

/**
 * Ϊʲô����ּ����ࣺ
 *      ����ѧϰ����������������ԣ���������������Զ��������������ͨ�����������ֵġ�
 *      Ϊ�˷���Զ��������в��������Ǿͱ���Զ��������д洢����Ҫ��Զ��������д洢��
 *      �Ͳ�����һ�������ı�������Ӧ����һ���������͵ı���
 *      ��ĿǰΪֹ������ѧϰ������Щ�������͵������أ� StringBuilder, ����
 *      ���ԣ�����Ŀǰֻ��ѡ�������ˣ�Ҳ��������ǰ��ѧϰ���Ķ������顣
 *      ���ǣ�����ĳ����ǹ̶��ģ���Ӧ���˱仯 ��������ô�� ���Ǹ����ѡ���أ�
 *      ���ʱ��java���ṩ�˼����๩�ҵ�ʹ�á�
 *  
 *  ���ϵ��ص㣺
 *      ���ȿɱ�
 *      
 *  ArrayList<E>:
 *          ��С�ɱ������ʵ��
 *          
 *          <E>��һ��������������ͣ����͡�
 *          ��ô���أ�
 *              �ڳ���E�ĵط�����ʹ������ ���������滻����
 *              ������ArrayList<String>,ArrayList<Student>
 *              
 *  ���췽����
 *          ArrayList()
 *      
 *  ���Ԫ�أ�
 *          public boolean add(E e); ���Ԫ��
 *          public void add(int index, E element) ��ָ�����������һ��Ԫ�� 
 * @author Yao Xue
 * @date Jul 5, 2017 10:56:11 PM
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        
        // add(E e); ���Ԫ��
        array.add("hello");
        array.add("world");
        array.add("java");
        
        //add(int index, E element) ��ָ�����������һ��Ԫ�� 
        //array.add(1, "android");
        
        System.out.println("array:"+array);
    }
}
