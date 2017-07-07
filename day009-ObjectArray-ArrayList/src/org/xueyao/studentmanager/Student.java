package org.xueyao.studentmanager;
/**
 * @author Yao Xue
 * @date Jul 7, 2017 10:43:59 AM
 */
public class Student {
    private String id;
    private String name;
    private String age;
    private String address;
    
    public Student() {
        // TODO Auto-generated constructor stub
    }

    public Student(String id, String name, String age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}

