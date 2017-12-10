package me.xueyao.springmvc.pojo;

import java.util.Arrays;

/**
 * @author XueYao
 * @date 2017-12-10
 */
public class User {
    private Integer id;
    private String username;
    private String name;
    private Integer age;
    private Boolean isMarry;
    private Double income;
    private String[] interests;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getMarry() {
        return isMarry;
    }

    public void setMarry(Boolean marry) {
        isMarry = marry;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public String[] getInterests() {
        return interests;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMarry=" + isMarry +
                ", income=" + income +
                ", interests=" + Arrays.toString(interests) +
                '}';
    }
}
