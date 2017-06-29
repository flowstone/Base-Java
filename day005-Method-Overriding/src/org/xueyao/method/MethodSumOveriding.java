package org.xueyao.method;
/**
 * 方法重载：在同一个类中，出现了方法名相同的情况
 * 方法重载的特点
 *      方法名相同,参数列表不同.与返回值无关
 *      参数列表不同：
 *          参数的个数不同
 *          参数的个数相同，数据类型不同
 *          
 * 注意：
 *      在调用方法时候，java虚拟机会通过参数来识别
 * @author Yao Xue
 * @date Jun 29, 2017 8:08:52 PM
 */
public class MethodSumOveriding {
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 20;
        
        //求和方法
        int result = sum(num1, num2);
        System.out.println("result:"+result);
        
        //定义变量
        int num3 = 30;
//        int result2 = sum2(num1, num2, num3);
//        System.out.println("result2:"+result2);
    }
    
    public static float sum(float num1, float num2) {
        return num1 + num2;
    }
    
    /**
     * 
     * @Title: sum
     * @Description: TODO 求三个数据的和
     * @param 
     * @return int
     */
    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    /**
     * 
     * @Title: sum
     * @Description: TODO 求两个数的和
     * @param 
     * @return int
     */
    public static int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}
