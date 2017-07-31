package me.xueyao.digui;
/**
 * 使用递归求5的阶乘:
 * 1。找规律：
 * 5！=5*4*3*2*1
 * 5!=5*4!
 *      4！=4*3!
 *              3!=3*2!
 *                   2!=2*1!
 *                        1!=1*0!
 *0!=1
 *n!=n*(n-1)!
 *2.结束条件：
 *if(n<=1)
 *{
 *  return 1;
 *}
 *递归注意：
 *1.必须要有结束条件
 *2.递归虽然好用，但是开发中要慎用，如果次数调用太多，容易内存溢出
 *3.构造方法不支持递归调用
 * @author Yao Xue
 * @date Jul 31, 2017 1:58:17 PM
 */
public class DiGuiDemo2 {
    public static void main(String[] args) {
        //调用方法求阶乘
        int x = jC(5);
        System.out.println(x); //5050
    }
    
    public static int jC(int n) {
        if (n == 1) {
            return 1;
        }
        return n * jC(n-1);
    }
}
