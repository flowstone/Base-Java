package org.xueyao.flowcontrol;
/*
 * �����⣺�����������󣬲��ô���ʵ�֣�
    1.��ӡ1��100֮�ڵ��������������а���9��Ҫ����
    2.ÿ�����5����������������֮���ÿո�ָ�
    3.�磺1 2 3 4 5 
    //9 19 29 39 49 59 69 79 89 99
 */
public class HomeWork_07 {
    public static void main(String[] args) {
        //��ʼ��������,����ÿ��5�����ֻ���һ��
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            /*//ȥ��������β������9������
            if (i % 10 == 9) {
                continue;
            }*/
            
            //ȥ��������β���Ϳ�ͷ����9������
            if (i / 10 ==9 || i % 10 == 9 ) {
                continue;
            }
            
            
            System.out.print(i+" ");
            
            //ÿ������5�����֣�����
            count++;
            if (count % 5 == 0) {
                System.out.println();
            }
            
        }
    }
}
