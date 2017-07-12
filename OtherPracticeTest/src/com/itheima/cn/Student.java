package com.itheima.cn;
/**
 * @author Yao Xue
 * @date Jul 10, 2017 10:37:16 PM
 */
public class Student {
    private String name;
    private int score;
    public Student() {
        // TODO Auto-generated constructor stub
    }
    public Student(String name, int score) {
        super();
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
