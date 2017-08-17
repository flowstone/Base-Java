package org.xueyao.dbutils;
/**
 * @author Yao Xue
 * @date Aug 17, 2017 1:29:56 PM
 */
public class User {
    /**
     *  javaBean:
     *      1.提供私有的属性
     *      2.提供get和set方法
     *      3.提供构造
     */
    private String id;
    private String username;
    private int age;
    private String password;
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }
    public User(String id, String username, int age, String password) {
        super();
        this.id = id;
        this.username = username;
        this.age = age;
        this.password = password;
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", age=" + age + ", password=" + password + "]";
    }
    
    
}
