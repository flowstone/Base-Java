package com.itheima.string_01;

import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jul 5, 2017 2:56:14 PM
 */
public class SimulationLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String userName = "admin";
        String passWord = "admin";
        
        for (int i = 2; i >= 0; i--) {
            System.out.println("����������û�����");
            String name = sc.nextLine().trim();
            System.out.println("������������룺");
            String pass = sc.nextLine().trim();
            
            if (name.equals(userName) && pass.equals(passWord)) {
                System.out.println("��¼�ɹ�");
                break;
            } else {
                if (i==0) {
                    System.out.println("�����ʺű�����������ϵ����Ա");
                } else {
                    System.out.println("����û�����������󣬻���"+i+"�λ���");
                }
            }
        }
    }
}
