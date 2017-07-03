package com.itheima.basicclass;

import java.util.Scanner;

/*
 * 键盘录入学生考试成绩，请根据成绩判断该学生属于哪个级别
 * 90-100	优秀
 * 80-90	好
 * 70-80	良
 * 60-70	及格
 * 60以下	不及格
 * 
 * 分析：
 * 		A:键盘录入学生考试成绩
 * 			三步骤
 * 		B:通过简单的分析，我们决定采用if语句格式3来实现
 * 
 * 程序一定要考虑周全了。
 * 		安全数据
 * 		边界数据
 * 		错误数据
 */
public class Test02 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生考试成绩：");
		int score = sc.nextInt();
	    if (score < 0 || score > 100) {
	        System.out.println("你输入数据非法");
        } else {
            switch (score/10) {
            case 10:
            case 9:
                System.out.println("优秀");
                break;
            case 8:
                System.out.println("好");
                break;
            case 7:
                System.out.println("良");
                break;
            case 6:
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
                break;
            }
        }
	}
}
