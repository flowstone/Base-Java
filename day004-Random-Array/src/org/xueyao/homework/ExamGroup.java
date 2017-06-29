package org.xueyao.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jun 28, 2017 9:10:25 PM
 * 第二题：分析以下需求，并用代码实现
    1.基础班考试要进行分组,键盘录入该班级总共多少组?以及每组的学生数量?  //groupNumber   //groupStudenNumber
    2.根据录入的组数及每组学员的数量创建二维数组
    3.利用随机数产生0-100的成绩(包含0和100)  //studentScore
    4.要求:
        (1)打印该班级中每组的不及格人数   //groupNoPassNumber  完成
        (2)打印该班级中每组的平均分      //groupAverage         完成
        (3)打印组的最高平均分        //groupAverageMax         完成
        (4)打印班级中的不及格人数   //classNoPassNumber       完成
        (5)打印班级平均分        //classAverage            完成
        (6)演示格式如下:
            请输入班级总组数:3
            请输入班级中每组的人数:10
           
 */
public class ExamGroup {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入班级总组数:");
        int groupNumber = sc.nextInt();
        
        System.out.print("请输入班级中每组的人数:");
        int groupStudenNumber = sc.nextInt();
        
        int[][] studentScore = new int[groupNumber][groupStudenNumber];
        for (int i = 0; i < studentScore.length; i++) {
            for (int j = 0; j < studentScore[i].length; j++) {
                studentScore[i][j] = r.nextInt(100);
                System.out.print(studentScore[i][j]+" "); //测试用
            }
            System.out.println();////测试用
        }
        System.out.println("----------");
        //每组的不及格人数
        int[] groupNoPassNumber = new int[studentScore.length];
        //每组的平均分 
        int[] groupAverage = new int[studentScore.length];
        
        
        //班级平均分
        int classAverage = 0;
        
        for (int i = 0; i < studentScore.length; i++) {
            int tempNoPassNumber = 0; //临时存放组不及格人数
            int tempGroupSum = 0; //临时存放组的总分
            
            for (int j = 0; j < studentScore[i].length; j++) {
               if (studentScore[i][j] < 60) {
                   tempNoPassNumber++;
               }
               //每组的总分
               tempGroupSum += studentScore[i][j];
            }
           //每组的平均分 
            groupAverage[i] = tempGroupSum / groupStudenNumber;
            //每组的不及格人数
            groupNoPassNumber[i] = tempNoPassNumber;
            //存储班级总分
            classAverage += tempGroupSum;
        }
        //班级平均分
        classAverage = classAverage / (groupNumber * groupStudenNumber);
        
        
        //组的最高平均分
        int groupAverageMax = groupAverage[0];
        for (int i = 1; i < groupAverage.length; i++) {
            if (groupAverage[i] > groupAverageMax) {
                groupAverageMax = groupAverage[i];
            }
        }
        
        
      //班级中的不及格人数
        int classNoPassNumber = 0;
        for (int i = 0; i < groupNoPassNumber.length; i++) {
            classNoPassNumber += groupNoPassNumber[i];
        }
        
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
        for (int i = 0; i < groupNoPassNumber.length; i++) {
            System.out.println("第"+(i+1)+"组不及格人数为: "+groupNoPassNumber[i]+" 人");
            
            System.out.println("第"+(i+1)+"组平均分为: "+groupAverage[i]);
        }
        System.out.println("班级中单组最高平均分为:"+groupAverageMax);
        System.out.println("班级中不及格人数为: "+classNoPassNumber+" 人");
        System.out.println("班级总平均分为: "+classAverage);
    }
}
