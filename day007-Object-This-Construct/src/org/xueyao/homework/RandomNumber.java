package org.xueyao.homework;

import java.util.Random;

/**
 * @author Yao Xue
 * @date Jul 4, 2017 1:33:17 PM
 */
public class RandomNumber {
    private int[] arr;
    
    public RandomNumber() {
        
    }
    public int[] getN() {
        return arr;
    }
    
    public void setN(int[] arr) {
        this.arr = arr;
    }
    //�������5����Χ��3��97֮������������Ҵ�ӡ��5������Ҫ����5���������ظ�
    public void repeatRandom() {
        Random r = new Random();
        
        arr[0] = r.nextInt(95)+3;
        for (int i = 0; i < arr.length;) {
            int temp = r.nextInt(95)+3;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == temp && j!=i) {
                    break;
                } else if (j == arr.length-1) {
                    arr[i] = temp;
                    i++;
                }
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
