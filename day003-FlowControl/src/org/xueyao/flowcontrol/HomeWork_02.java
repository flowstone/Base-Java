package org.xueyao.flowcontrol;

import java.util.Scanner;

/*
 * �ڶ��⣺�����������󣬲��ô���ʵ�֣�
    1.����¼��һ������������x�������Ӧ�ı���y��ֵ
    2.xֵ��yֵ�Ķ�Ӧ��ϵ���£�
        x<0 y=-1
        x=0 y=0
        x>0 y=1
    3.����û������x��ֵΪ2���������к��ӡ��ʽ"x=2,y=1"
 */
public class HomeWork_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ������");
        int x = sc.nextInt();
        int y = 0;
        if (x < 0) {
            y = -1;
        } else if (x == 0) {
            y = 0;
        } else if (x > 0) {
            y = 1;
        } 
        
        System.out.println("x="+x+",y="+y);
    }
}
