package org.xueyao.beans.task03;

import java.util.Arrays;

/**
 * 一、   请按以下要求编写代码：
1.  定义一个User类，要求：
属性：登陆名、登陆密码、性别、学历、爱好(String数组)
方法：无参构造方法、全参构造方法，get/set方法。

 * @author Yao Xue
 * @date Aug 10, 2017 7:23:29 PM
 */
public class User {
    private String username;
    private String password;
    private String gender;
    private String degree;
    private String[] hobby;
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }
    public User(String username, String password, String gender, String degree, String[] hobby) {
        super();
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.degree = degree;
        this.hobby = hobby;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getDegree() {
        return degree;
    }
    public void setDegree(String degree) {
        this.degree = degree;
    }
    public String[] getHobby() {
        return hobby;
    }
    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }
    @Override
    public String toString() {
        return "User [username=" + username + ", password=" + password + ", gender=" + gender + ", degree=" + degree
                + ", hobby=" + Arrays.toString(hobby) + "]";
    }
    
    
}
