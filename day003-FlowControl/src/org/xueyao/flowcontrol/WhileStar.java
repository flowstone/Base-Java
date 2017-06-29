package org.xueyao.flowcontrol;
/*
 * .使用whlie循环打印一个四行五列的星星
        如下: 
    *****
    *****
    *****
    *****

 */
public class WhileStar {
    public static void main(String[] args) {
        int i = 1;
       //控制星星的行数
        while (i <= 4) {
            int j = 1;
            //控制星星的个数
            while (j <= 5) {
                System.out.print("*");
                j++;
            }
            
            System.out.println();
            i++;
        }
       
    }
}
