package org.xueyao.homework;

import java.util.ArrayList;

/**
 * �����⣺�����������󣬲��ô���ʵ��
        1.����ArrayList���ϣ��������ַ���
           ��:"ab1" "123ad"  "bca" "dadfadf"  "dddaaa"  "��ð�"  "������"  "���ܰ�"
        2.��������,ɾ�����ȴ���5���ַ���,��ӡɾ����ļ��϶���
        3.������һ��,ɾ��������Ԫ�ذ���0-9���ֵ��ַ���(ֻҪ�ַ����а���0-9�е�����һ�����־���Ҫɾ���������ַ���)
    
 * @author Yao Xue
 * @date Jul 6, 2017 2:56:30 PM
 */
public class HomeWork_04 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("ab1");
        arrayList.add("123ad");
        arrayList.add("bca");
        arrayList.add("dadfadf");
        arrayList.add("dddaaa");
        arrayList.add("��ð�");
        arrayList.add("������");
        arrayList.add("���ܰ�");
       // System.out.println(arrayList);
        for (int i = arrayList.size()-1; i >= 0; i--) {
            String s = arrayList.get(i);
            if (s.length() > 5) {
                arrayList.remove(i);
            }
           
        }
        
        
        for (int i = 0; i < arrayList.size(); i++) {
            String string = arrayList.get(i);
            System.out.println(string);
        }
    }
}
