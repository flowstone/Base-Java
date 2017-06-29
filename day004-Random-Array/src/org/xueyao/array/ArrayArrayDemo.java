package org.xueyao.array;
/*
 * ��ά���飺��ʵ����Ԫ��Ϊһ�����������
 * 
 * �����ʽ ��
 *      A:��������[][] ������ ; (�Ƽ�)
 *      B����������   ������[][];
 *      C:��������[] ������[];
 *
 *��ʼ����
 *      A����̬��ʼ��
 *          ��������[][] ������ = new ��������[m][n];
 *          m��ʾ���Ƕ�ά������һά����ĸ���
 *          n��ʾ����һά�����е�Ԫ�ظ���
 *      B����̬��ʼ��
 *          ��������[][] ������ = new ��������[][]{{Ԫ��1��Ԫ��2},{Ԫ��1,...},{Ԫ��1,...}....};
 *          �򻯸�ʽ
 *              ��������[][] ������ = {{Ԫ��1��Ԫ��2},{Ԫ��1,...},{Ԫ��1,...}....};
 */
public class ArrayArrayDemo {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        
        System.out.println("----------");
        System.out.println(arr[0][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][2]);
    }
}
