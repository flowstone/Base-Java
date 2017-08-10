package org.xueyao.beans;
/**
 * @author Yao Xue
 * @date Aug 10, 2017 4:02:36 PM
 */
public class Student {
    private String name;
    private int age;
    private char gender;
    private float score;
    public Student(String name, int age, char gender, float score) {
        super();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.score = score;
    }
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public float getScore() {
        return score;
    }
    public void setScore(float score) {
        this.score = score;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", score=" + score + "]";
    }
    
    
}
