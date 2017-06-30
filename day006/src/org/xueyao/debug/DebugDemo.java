package org.xueyao.debug;
/**
 * 断点调试的作用：
 *          A：查看程序的执行流程
 *          B：调试程序
 * 断点：
 *      其实就是一个标记
 * 在哪里加断点
 *      哪里不会加哪里
 * 如何加断点
 *      在 代码区域的左边双击   
 * 
 *  如何运行加断点的程序呢？
 *      代码区域--右键--Debug As --Java Application
 *  如何让程序往下执行
 *      F6
 *  看哪些区域
 *      代码区域：看程序的执行流程
 *      Debug区域：看程序的执行流程
 *      Variables:看变量的变化
 *      Console:看程序 的输入与输出
 *      
 * 如何去掉断点
 *      A：把加断点的动作两点一遍
 *      B：在Debug视图中，找到Breakpoints,选中要删除的断点，点击双X即可
 * @author Yao Xue
 * @date Jun 30, 2017 4:05:37 PM
 */
public class DebugDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("c:"+c);
    }
}
