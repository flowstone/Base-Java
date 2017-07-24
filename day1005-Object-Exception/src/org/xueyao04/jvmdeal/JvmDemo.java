package org.xueyao04.jvmdeal;
/**
 * @author Yao Xue
 * @date Jul 24, 2017 2:27:52 PM
 */
public class JvmDemo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int i = getElement(array);
        System.out.println(i);
    }

    private static int getElement(int[] array) {
        int i = array[3];
        return i;
    }
    
    
}
