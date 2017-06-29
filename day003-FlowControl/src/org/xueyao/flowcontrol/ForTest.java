package org.xueyao.flowcontrol;
/*
 * 获取数据1-5和5-1
 */
public class ForTest {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        
        System.out.println("---------");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
