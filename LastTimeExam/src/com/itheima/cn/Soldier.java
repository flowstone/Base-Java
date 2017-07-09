package com.itheima.cn;
/**
 * @author Yao Xue
 * @date Jul 9, 2017 6:28:39 PM
 */
public class Soldier {
    private String name;
    private int age;
    private String like;
    
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
    public String getLike() {
        return like;
    }
    public void setLike(String like) {
        this.like = like;
    }
    
    public void show() {
        System.out.println("ĞÕÃû£º"+name+" , ÄêÁä£º"+age+" , °®ºÃ£º"+like);
    }
    
}
