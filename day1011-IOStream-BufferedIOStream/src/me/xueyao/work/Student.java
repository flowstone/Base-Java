package me.xueyao.work;
/**
 * @author Yao Xue
 * @date Aug 2, 2017 9:31:22 AM
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
    
    
}
