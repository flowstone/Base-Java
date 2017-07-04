package org.xueyao.homework;
/**
 * 有一个int数组{51, 53, 17, 97},写代码，打印出这个数组中的所有质数
 * @author Yao Xue
 * @date Jul 4, 2017 1:17:51 PM
 */
public class ArrayNumberTest {
    public static void main(String[] args) {
        int[] arr = {51, 53, 17, 97};
        ArrayNumber arrayNumber = new ArrayNumber();
        arrayNumber.setArr(arr);
        
        arrayNumber.primeNumber();
    }
}
