package com.itheima.arraylist;

import java.util.ArrayList;

/**
 *  * ����һ���ַ������飺{"�����ᡱ,"��Զ�š�,"���޼ɡ�,"����ͤ��,"�Ŵ�ɽ��,"Ī���ȡ�}���������е�Ԫ����ӵ������У������������ŵ���Ա��ӡ������̨�ϡ�
 * @author Yao Xue
 * @date Jul 7, 2017 11:52:32 AM
 */
public class ArrayListDemo3 {
    public static void main(String[] args) {
        String[] str = {"������","��Զ��","���޼�","����ͤ","�Ŵ�ɽ","Ī����"};
        ArrayList<String> arrayList = new ArrayList<String>();
        //���ӵ�������
        for (int i = 0; i < str.length; i++) {
            arrayList.add(str[i]);
        }
        //�������ϣ������ŵ����
        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(i);
            if (s.startsWith("��")) {
                System.out.println(s);
            }
        }
    }
}
