package org.xueyao.basetest;
/**
 * 需求：
 *      有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 *      假如兔子都不死，问第二十个月的兔子对数为多少？ 
 * 
 * 规律：
 *      第一个月：1
 *      第二个月：1
 *      第三个月：2
 *      第四个月：3
 *      第五个月：5
 *      ...
 * 
 *      规律：从第三个月开始，每个月的兔子对数是前两个月的兔子对数之和
 *          第一个月和第二个月的兔子对数都是1
 * 
 * 分析：
 *      A:由于数据比较多,所以我们就定义数组来实现了
 *          int[] arr = new int[20];
 *      B:给数组的元素赋值
 *          arr[0] = 1
 *          arr[1] = 2
 *      C:找规律
 *          arr[2] = arr[1] + arr[0];
 *          arr[3] = arr[2] + arr[1];
 *          arr[4] = arr[3] + arr[2];
 *          arr[5] = arr[4] + arr[3];
 *          ... 
 * @author Yao Xue
 * @date Jun 30, 2017 6:24:14 PM
 */
public class NoDieRabbit {
    public static void main(String[] args) {
        getRabbitCount();
    }
    
    public static void getRabbitCount() {
        int[] rabbit = new int[20];
        
        rabbit[0] = 1;
        rabbit[1] = 1;
        for (int i = 2; i < rabbit.length; i++) {
            rabbit[i] = rabbit[i-2] + rabbit[i-1];
        }
        
        System.out.println("第二十个月的兔子对数"+rabbit[19]);

    }
}
