package org.xueyao.flowcontrol;

/*
 * if�������һ�ָ�ʽ
 * 
 * if����ʽ1��
 *      if (��ϵ���ʽ) {
 *          �����;
 *      }     
 */
public class IfDemo {
    public static void main(String[] args) {
        System.out.println("��ʼ");
        
        //������������
        int a = 10;
        int b = 20;
        
        if (a == b) {
            System.out.println("a����b");
        }
        
        int c = 10;
        
        if (a == c) {
            System.out.println("a����c");
        }
        
        System.out.println("����");
    }
}
