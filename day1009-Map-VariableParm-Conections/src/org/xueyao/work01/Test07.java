package org.xueyao.work01;
/**
 * 定义一个方法add接收0个及以上的int类型数据,
 * 这个方法的作用是将传入的int类型的值进行相加,并返回相加后的结果
 * @author Yao Xue
 * @date Jul 30, 2017 1:25:14 AM
 */
public class Test07 {
    public static void main(String[] args) {
       int sum =  add(1,2,3,4,5);
       System.out.println(sum);
    }

    public static int add(int ... num) {
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        return sum;
    }
}
