package org.xueyao.flowcontrol;

public class DoWhileDemo2 {
    public static void main(String[] args) {
        /* 
         * �˴��������ô�
        int x = 3;
        while (x < 3) {
            System.out.println("������,��Java");
            x++;
        }
        
        System.out.println("-----------");
        int y = 3;
        do {
            System.out.println("������,��Java");
            y++;
        } while (y < 3);
        
        System.out.println("------------");*/
        
        for (int x = 1; x <= 10; x++) {
            System.out.println("������,��Java");
        }
        System.out.println("-----------");
        
        int y = 1;
        while (y <= 10) {
            System.out.println("������,��Java");
            y++;
        }
        
        
    }
}
