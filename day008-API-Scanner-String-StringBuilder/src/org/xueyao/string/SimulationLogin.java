package org.xueyao.string;

import java.util.Scanner;

/**
 * ģ���¼,�����λ���,����ʾ���м���
 * @author Yao Xue
 * @date Jul 5, 2017 1:01:46 PM
 */
public class SimulationLogin {
    public static void main(String[] args) {
        String username = "admin";
        String password = "123456";
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            System.out.println("����������û�����");
            String inputUsername = sc.nextLine();
            System.out.println("������������룺");
            String inputPassword = sc.nextLine();
            
            if (username.equals(inputUsername) && password.equals(inputPassword)) {
                System.out.println("��¼�ɹ�!");
                break;
            } else {
                if (i == 2) {
                    System.out.println("�����ʺ��ѱ��������������Ա��ϵ");
                } else {
                    System.out.println("������"+(2-i)+"�λ���");
                }
            }
        }
       
    }
}
