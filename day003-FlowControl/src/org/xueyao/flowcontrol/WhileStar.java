package org.xueyao.flowcontrol;
/*
 * .ʹ��whlieѭ����ӡһ���������е�����
        ����: 
    *****
    *****
    *****
    *****

 */
public class WhileStar {
    public static void main(String[] args) {
        int i = 1;
       //�������ǵ�����
        while (i <= 4) {
            int j = 1;
            //�������ǵĸ���
            while (j <= 5) {
                System.out.print("*");
                j++;
            }
            
            System.out.println();
            i++;
        }
       
    }
}
