package org.xueyao.beans.task04;

import java.util.Arrays;

/**
 * 二、   定义一个User类，要求：
    属性：登陆名、登陆密码、性别、学历、爱好
    方法：无参构造方法、全参构造方法，get/set方法。

 * @author Yao Xue
 * @date Aug 10, 2017 8:09:01 PM
 */
public class User {
    private String loginName;
    private String loginPassword;
    private String gender;
    private String degree;
    private String[] hobby;
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }
    public User(String loginName, String loginPassword, String gender, String degree, String[] hobby) {
        super();
        this.loginName = loginName;
        this.loginPassword = loginPassword;
        this.gender = gender;
        this.degree = degree;
        this.hobby = hobby;
    }
    public String getLoginName() {
        return loginName;
    }
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
    public String getLoginPassword() {
        return loginPassword;
    }
    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
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
        return "User [loginName=" + loginName + ", loginPassword=" + loginPassword + ", gender=" + gender + ", degree="
                + degree + ", hobby=" + Arrays.toString(hobby) + "]";
    }
    
    
}
