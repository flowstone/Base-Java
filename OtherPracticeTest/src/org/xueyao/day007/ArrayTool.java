package org.xueyao.day007;
/**
 * ����һ�����鹤���࣬�������˲����������ֵ����ӡ���飬���鷴ת�ķ���
 * @author Yao Xue
 * @date Jul 10, 2017 8:13:09 PM
 */
public class ArrayTool {
    //���һ���������еķ������Ǿ�̬�ģ���Ҫ�ٶ���һ����˽�й��췽����Ŀ���ǲ��������ഴ���������
    //ֱ�������ͣ����ü���
    /**
     * ˽�й��췽��
     */
    private ArrayTool(){}
    //��ȡ���ֵ
    
    /**
     * ���ǻ�ȡ���������ֵ�ķ���
     * @param arr   ����һ��int��������
     * @return  �������������ֵ
     */
    public static int getMax(int[] arr) {
        int max = arr[0];                          //��¼��һ��Ԫ��
        for (int i = 0; i < arr.length; i++) {     //�ӵڶ���Ԫ�ؿ�ʼ����
            if (max < arr[i]) {                    //max��������������Ԫ�رȽ� 
                max = arr[i];                      //��¼ס�ϴ�� 
            }
        }
        return max;                                //�����ֵ���� 
    }
    
    //����ı���
    
    /**
     * ���ǻ�ȡ��������ķ���
     * @param arr ����һ��int��������
     */
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    //����ķ�ת
    
    /**
     * ��������ķ�ת�ķ���
     * @param arr ����һ��int��������
     */
    public static void revArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
    
}
