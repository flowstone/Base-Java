package com.itheima.cn;

import java.util.ArrayList;

/**
 * 1.����"����"��,Soldier,�������³�Ա: 

��Ա����: name (����):String���ͣ�age (����):int���ͣ�like (����):String���ͣ�����ʹ��private���Ρ� 

��Ա����: 

        1).get/set���� 

        2).show()����,��ӡ�����������Ե�ֵ; 

2.�����ࣺTest05,���ж���main()������������Ҫ���д����: 

   2.1�ֱ�ʵ��������Soldier������������ֱ�Ϊ��"��С��" ,25,�������򡱡�"���ų�" ,35,����Ӿ����"������" ,55,��������; 

   2.2����һ��ArrayList���ϣ������������洢����Solider���ͣ��ֱ����������Solider������ӵ������� 

   2.3����������ϣ��ڱ����Ĺ����У������������������ж�����������40����ô���������������İ��øĳɡ���߶���
   ��Ȼ�������������show����չʾ����������е�������Ϣ 
 * @author Yao Xue
 * @date Jul 9, 2017 6:28:19 PM
 */
public class Test16 {
    public static void main(String[] args) {
        Soldier s1 = new Soldier();
        s1.setName("��С��");
        s1.setAge(25);
        s1.setLike("������");
        
        Soldier s2 = new Soldier();
        s2.setName("���ų�");
        s2.setAge(35);
        s2.setLike("��Ӿ");
        
        Soldier s3 = new Soldier();
        s3.setName("������");
        s3.setAge(55);
        s3.setLike("������");
        
        ArrayList<Soldier> arrayList = new ArrayList<Soldier>();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        
        for (int i = 0; i < arrayList.size(); i++) {
            Soldier soldier = arrayList.get(i);
            if (soldier.getAge() > 40) {
                soldier.setLike("��߶���");
                arrayList.set(i, soldier);
                soldier.show();
            }
        }
    }
}
