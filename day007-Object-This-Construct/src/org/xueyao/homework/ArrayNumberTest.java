package org.xueyao.homework;
/**
 * ��һ��int����{51, 53, 17, 97},д���룬��ӡ����������е���������
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
