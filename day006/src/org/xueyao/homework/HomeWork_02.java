package org.xueyao.homework;
/**
 * 第三题：分析以下需求，并用代码实现
    1.求1-500之内能同时被2，5，7整除的所有数及个数并5个一行打印
    2.求100以内能被3整除的数加上能被5整除的数的和
 * @author Yao Xue
 * @date Jul 1, 2017 9:32:02 PM
 */
public class HomeWork_02 {
    public static void main(String[] args) {
        except();
        System.out.println();
        System.out.println("---------");
        int sum = zhengChu(100, 3)+zhengChu(100, 5);
        System.out.println("sum:"+sum);
    }
    /**
     * @Description: TODO 1-500之内能同时被2，5，7整除的所有数及个数并5个一行打印
     * @return: void
     */
    public static void except() {
        int count = 0;
        
        for (int i = 1; i <= 500; i++) {
            if ((i % 2 == 0) && (i % 5 == 0) && (i % 7 == 0)) {
                count++;
                System.out.print(i+" ");
                if(count % 5 == 0) {
                    System.out.println();
                }
            }
            
        }
    }
    
    public static int zhengChu(int n, int divisor) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (i % divisor == 0) {
                sum += i;
               // System.out.println(i);
            }
        }
        
        return sum;
    }
}
