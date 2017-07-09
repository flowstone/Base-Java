package org.xueyao.array;
/**
 * @author Yao Xue
 * @date Jul 7, 2017 7:53:48 AM
 */
public class NumberFunction {
    //��ȡ����λ����ÿһλ����ֵ
    public void getDigit(int number) {
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 10 / 10 % 10;
    }
    
    //�������е����ֵ
    public int getMax(int num1, int num2, int num3) {
        int max = num1 > num2 ? num1 : num2;
        max = max > num3 ? max : num3;
        return max;
    }
    
   //�������е���Сֵ
    public int getMin(int num1, int num2, int num3) {
        int min = num1 < num2 ? num1 : num2;
        min = min < num3 ? min : num3;
        return min;
    }
    
  //�������ĺ�
    public int getSum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    
    //�������������մ�С�����˳�����
    public void getSort(int num1, int num2, int num3) {
        int min = num1 < num2 ? num1 : num2;
        min = min < num3 ? min : num3;
        
        int max = num1 > num2 ? num1 : num2;
        max = max > num3 ? max : num3;
        
        int mid = (num1 + num2 + num3) - min - max;
    }
    
    /**
     * 1.��ӡ1��100֮�ڵ��������������а���9��Ҫ����
     * 2.ÿ�����5����������������֮���ÿո�ָ�
    * 3.�磺1 2 3 4 5 
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
     * 1.���մӴ�С��˳�������λ���еĸ�λ+��λ=ʮλ+ǧλ(3553,2332,1166,8228,3773)�����ּ�����
     * 2.ÿ�����5����������������֮���ÿո�ָ�
     * 3.�磺9999 9988 9977 9966 9955    
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
