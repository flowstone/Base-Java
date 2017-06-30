package org.xueyao.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jun 29, 2017 10:34:50 PM
 */
public class HomeWork_02_01 {
    public static void main(String[] args) {
        /*
         * 第二题：分析以下需求，并用代码实现
            1.将day04作业中第一题和第二题中创建数组及给数组元素的值赋值的操作封装成方法
            2.然后按照day04作业中第一题和第二题中的题目要求封装方法完成功能
            ----------------------------------------
                                第一题：分析以下需求，并用代码实现
                        1.键盘录入班级人数
                        2.根据录入的班级人数创建数组
                        3.利用随机数产生0-100的成绩(包含0和100)
                        4.要求:
                            (1)打印该班级的不及格人数
                            (2)打印该班级的平均分
                            (3)演示格式如下:
                                请输入班级人数:
                                键盘录入:100
                                控制台输出:
                                    不及格人数:19
                                    班级平均分:87
            ------------------------------------------

         */
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入班级人数：");
        //从键盘获取班级人数
        int classNumber = sc.nextInt();
        int[] number = createNumber(classNumber);
        numberAssignment(number);
       
        System.out.println("不及格人数:"+noPassCount(number));
        System.out.println("班级平均分:"+classAvg(number));
    }
    /**
     * @Description: TODO  创建班级人数数组
     * @return: int[]
     */
    public static int[] createNumber(int classNumber){
      //根据获得班级人数创建数组
        int[] number = new int[classNumber];
        return number;
    }
    /**
     * @Description: TODO  数组初始化
     * @return: void
     */
    public static void numberAssignment(int[] number) {
        Random r = new Random();
        for (int i = 0; i < number.length; i++) {
            number[i] = r.nextInt(101);
        }
    }
    
    /**
     * @Description: TODO  不及格的人数
     * @return: int
     */
    public static int noPassCount(int[] number) {
        int noPassCount =0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] < 60) {
                noPassCount++;
            }
        }
        return noPassCount;
    }
    
    /**
     * @Description: TODO  班级人数
     * @return: int
     */
    public static int classAvg(int[] number) {
        int sum =0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        return sum / number.length;
    }
    
    
}
