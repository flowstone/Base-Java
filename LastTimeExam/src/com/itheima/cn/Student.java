package com.itheima.cn;
/**
 * @author Yao Xue
 * @date Jul 9, 2017 8:28:47 AM
 */
public class Student {
    private String name;
    private int score;
    public Student() {
        // TODO Auto-generated constructor stub
    }
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    
    
}
