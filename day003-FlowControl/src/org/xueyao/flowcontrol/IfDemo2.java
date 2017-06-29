package org.xueyao.flowcontrol;

/*
 * if语句格式2：
 *      if (关系表达式) {
 *          语句体;
 *      } else {
 *          语句体2;
 *      }
 */
public class IfDemo2 {
    public static void main(String[] args) {
        System.out.println("开始");
        
        //判断一个数是偶数还是奇数
        int a = 100;
        
        if (a%2 == 0) {
            System.out.println("a是偶数");
        } else {
            System.out.println("a是奇数");
        }
        
        System.out.println("结束");
    }
}
