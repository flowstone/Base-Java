package org.xueyao.beans;
/**
 * @author Yao Xue
 * @date Aug 10, 2017 3:07:48 PM
 */
public class User {
    private String id;
    private String username;
    private String pwd;
    private int age;
    private float scores;
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }
    public User(String id, String username, String pwd, int age, float scores) {
        super();
        this.id = id;
        this.username = username;
        this.pwd = pwd;
        this.age = age;
        this.scores = scores;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getScores() {
        return scores;
    }
    public void setScores(float scores) {
        this.scores = scores;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", pwd=" + pwd + ", age=" + age + ", scores=" + scores
                + "]";
    }
    
    
}
