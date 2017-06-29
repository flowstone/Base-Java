package org.xueyao.method;
/**
 * 方法的调用(有明确返回值 的方法调用) ：
 *      A：单独调用，没有意义
 *      B：输出调用，有意义，但是不够好，因为我可能需要结果
 *      B：赋值调用，推荐使用
 * @author Yao Xue
 * @date Jun 29, 2017 7:05:26 PM
 */
public class MethodSum {
    public static void main(String[] args) {
        //单独调用
        //sum(10, 20);
        
        //输出调用
        //System.out.println(sum(10,20));
        
        //赋值调用
        int sum = sum(10, 20);
        System.out.println("sum:"+sum);
    }
    
    /*
     * 求和的方法
     * 
     * 两个明确：
     *      返回值类型:int
     *      参数列表：int a, int b;
     */
    
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
