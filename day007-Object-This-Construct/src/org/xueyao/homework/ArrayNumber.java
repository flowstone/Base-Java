package org.xueyao.homework;
/**
 * @author Yao Xue
 * @date Jul 4, 2017 11:50:39 AM
 */
public class ArrayNumber {
    private int[] arr;
    
    public ArrayNumber() {
        
    }
    
    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }


    //数组内所有质数
    public void primeNumber() {
        for (int i = 0; i < arr.length; i++) { // 3 4 5 7
            boolean flag = true;
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(arr[i]);
            }
        }
    }
}
