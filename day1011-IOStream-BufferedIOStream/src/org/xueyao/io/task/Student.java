package org.xueyao.io.task;
/**
 * @author Yao Xue
 * @date Aug 1, 2017 11:48:47 PM
 */
public class Student {
    private String id;
    private String name;
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Student(String id, String name) {
        super();
        this.id = id;
        this.name = name;
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
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }
    
}
