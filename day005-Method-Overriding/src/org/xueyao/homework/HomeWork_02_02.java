package org.xueyao.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jun 29, 2017 10:38:39 PM
 */
public class HomeWork_02_02 {
    public static void main(String[] args) {
        /*
         *  第二题：分析以下需求，并用代码实现
            1.将day04作业中第一题和第二题中创建数组及给数组元素的值赋值的操作封装成方法
            2.然后按照day04作业中第一题和第二题中的题目要求封装方法完成功能
         * 第二题：分析以下需求，并用代码实现
            1.基础班考试要进行分组,键盘录入该班级总共多少组?以及每组的学生数量?
            2.根据录入的组数及每组学员的数量创建二维数组
            3.利用随机数产生0-100的成绩(包含0和100)
            4.要求:
                (1)打印该班级中每组的不及格人数
                (2)打印该班级中每组的平均分
                (3)打印组的最高平均分
                (4)打印班级中的不及格人数
                (5)打印班级平均分
                (6)演示格式如下:
                                请输入班级总组数:3
                                请输入班级中每组的人数:10
                                控制台输出:
                                    第1组不及格人数为: 6 人
                                    第1组平均分为: 52
                                    第2组不及格人数为: 7 人
                                    第2组平均分为: 46
                                    第3组不及格人数为: 3 人
                                    第3组平均分为: 69
                                    班级中单组最高平均分为:69
                                    班级中不及格人数为: 16 人
                                    班级总平均分为: 56
         */
        
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入班级总组数:");
        int groupNumber = sc.nextInt();
        
        System.out.print("请输入班级中每组的人数:");
        int groupStudenNumber = sc.nextInt();
        
        int[][] studentScore = createStudentScore(groupNumber, groupStudenNumber);
        studentScore = StudentScoreAssignment(studentScore);
        //每组的不及格人数
        int[] groupNoPassNumber = createGroupNoPassNumber(groupNumber);
        groupNoPassNumber = groupNoPassNumber(groupNoPassNumber, studentScore);
        //每组的平均分 
        int[] groupAverage = creategroupAverage(groupNumber);
        groupAverage = groupAverage(groupAverage, studentScore);
        int groupAverageMax = groupAverageMax(groupAverage);
        
        int classNoPassNumber = classNoPassNumber(groupNoPassNumber);
        
        int classAverage = classAverage(studentScore, groupNumber, groupStudenNumber);
        /*
         *  控制台输出:
                                    第1组不及格人数为: 6 人
                                    第1组平均分为: 52
                                    第2组不及格人数为: 7 人
                                    第2组平均分为: 46
                                    第3组不及格人数为: 3 人
                                    第3组平均分为: 69
                                    班级中单组最高平均分为:69
                                    班级中不及格人数为: 16 人
                                    班级总平均分为: 56
         */
        printInfo(groupNoPassNumber, groupAverage, groupAverageMax, classNoPassNumber, classAverage);
        
    }
    
    public static int[][] createStudentScore(int groupNumber, int groupStudenNumber ) {
        int[][] studentScore = new int[groupNumber][groupStudenNumber];
        return studentScore;
    }
    
    
    public static int[][] StudentScoreAssignment(int[][] studentScore) {
        Random r = new Random();
        for (int i = 0; i < studentScore.length; i++) {
            for (int j = 0; j < studentScore[i].length; j++) {
                studentScore[i][j] = r.nextInt(100);
                System.out.print(studentScore[i][j]+" "); //测试用
            }
            System.out.println();////测试用
        }
        System.out.println("----------");
        return studentScore;
    }
    
    public static int[] createGroupNoPassNumber(int groupNumber) {
        int[] groupNoPassNumber = new int[groupNumber];
        return groupNoPassNumber;
    }
    
    public static int[] creategroupAverage(int groupNumber) {
        int[] groupAverage = new int[groupNumber];
        return groupAverage;
    }
    
  //每组的不及格人数
    public static int[]  groupNoPassNumber(int[] groupNoPassNumber, int[][] studentScore) {
        for (int i = 0; i < studentScore.length; i++) {
            int temp = 0;
            for (int j = 0; j < studentScore[i].length; j++) {
                if (studentScore[i][j] < 60) {
                    temp++;
                }
            }
            groupNoPassNumber[i] = temp;
        }
        return groupNoPassNumber;
    }
    
    //每组平均分
    public static int[] groupAverage(int[] groupAverage, int[][] studentScore) {
        for (int i = 0; i < studentScore.length; i++) {
            int temp = 0;
            for (int j = 0; j < studentScore[i].length; j++) {
                temp += studentScore[i][j];
            }
            //每组的平均分 
            groupAverage[i] = temp / studentScore[i].length;
        }
        return groupAverage;
    }
  //组的最高平均分
    public static int groupAverageMax(int[] groupAverage) {
        
        int groupAverageMax = groupAverage[0];
        for (int i = 1; i < groupAverage.length; i++) {
            if (groupAverage[i] > groupAverageMax) {
                groupAverageMax = groupAverage[i];
            }
        }
        return groupAverageMax;
    }
  //班级中的不及格人数
    public static int classNoPassNumber(int[] groupNoPassNumber) {
        int classNoPassNumber = 0;
        for (int i = 0; i < groupNoPassNumber.length; i++) {
            classNoPassNumber += groupNoPassNumber[i];
        }
        return classNoPassNumber;
    }
  //班级平均分
    public static int classAverage(int[][] studentScore, int groupNumber, int groupStudenNumber) {
        int classAverage = 0;
        for (int i = 0; i < studentScore.length; i++) {
            int temp = 0;
            for (int j = 0; j < studentScore[i].length; j++) {
                temp += studentScore[i][j];
            }
            
            classAverage += temp;
        }
        classAverage = classAverage / (groupNumber * groupStudenNumber);
        return classAverage;
    }
    
    //输出信息
    public static void printInfo(int[] groupNoPassNumber, int[] groupAverage, int groupAverageMax, int classNoPassNumber, int classAverage) {
        for (int i = 0; i < groupNoPassNumber.length; i++) {
            System.out.println("第"+(i+1)+"组不及格人数为: "+groupNoPassNumber[i]+" 人");
            
            System.out.println("第"+(i+1)+"组平均分为: "+groupAverage[i]);
        }
        System.out.println("班级中单组最高平均分为:"+groupAverageMax);
        System.out.println("班级中不及格人数为: "+classNoPassNumber+" 人");
        System.out.println("班级总平均分为: "+classAverage);
    }
    
 
    
}
