package org.xueyao.flowcontrol;

public class DoWhileDemo2 {
    public static void main(String[] args) {
        /* 
         * 此处代码有用处
        int x = 3;
        while (x < 3) {
            System.out.println("爱生活,爱Java");
            x++;
        }
        
        System.out.println("-----------");
        int y = 3;
        do {
            System.out.println("爱生活,爱Java");
            y++;
        } while (y < 3);
        
        System.out.println("------------");*/
        
        for (int x = 1; x <= 10; x++) {
            System.out.println("爱生活,爱Java");
        }
        System.out.println("-----------");
        
        int y = 1;
        while (y <= 10) {
            System.out.println("爱生活,爱Java");
            y++;
        }
        
        
    }
}
