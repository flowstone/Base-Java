package org.xueyao.array;
/**
 * @author Yao Xue
 * @date Jul 7, 2017 7:53:48 AM
 */
public class NumberFunction {
    //获取该三位数上每一位的数值
    public void getDigit(int number) {
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 10 / 10 % 10;
    }
    
    //三个数中的最大值
    public int getMax(int num1, int num2, int num3) {
        int max = num1 > num2 ? num1 : num2;
        max = max > num3 ? max : num3;
        return max;
    }
    
   //三个数中的最小值
    public int getMin(int num1, int num2, int num3) {
        int min = num1 < num2 ? num1 : num2;
        min = min < num3 ? min : num3;
        return min;
    }
    
  //三个数的和
    public int getSum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    
    //三个整数，按照从小到大的顺序输出
    public void getSort(int num1, int num2, int num3) {
        int min = num1 < num2 ? num1 : num2;
        min = min < num3 ? min : num3;
        
        int max = num1 > num2 ? num1 : num2;
        max = max > num3 ? max : num3;
        
        int mid = (num1 + num2 + num3) - min - max;
    }
    
    /**
     * 1.打印1到100之内的整数，但数字中包含9的要跳过
     * 2.每行输出5个满足条件的数，之间用空格分隔
    * 3.如：1 2 3 4 5 
     */
    public void leapNumber(int bound, int num) {
        int count = 0;
        for (int i = 1; i <= bound; i++) {
            if (i / 10 == num || i % 10 == 9) {
                continue;
            }
            System.out.print(i+" ");
            
            if (count % 5 == 0) {
                System.out.println();
            }
        }
    }
    
    /**
     * 1.按照从大到小的顺序输出四位数中的个位+百位=十位+千位(3553,2332,1166,8228,3773)的数字及个数
     * 2.每行输出5个满足条件的数，之间用空格分隔
     * 3.如：9999 9988 9977 9966 9955    
     */
    public void bigToSmailNumber() {
        int count = 0;
        for (int i = 9999; i >=1000; i--) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            int qian = i / 10 / 10 / 10 % 10;
            if (ge + bai == shi + qian) {
                count++;
                System.out.print(i+" ");
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
            
        }
    }
}
