package me.xueyao.work21;
/**
 * @author Yao Xue
 * @date Jul 25, 2017 9:52:04 PM
 */
public class Student {
    private String id;
    private String name;
    private String gender;
    private String age;
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Student(String id, String name, String gender, String age) {
        super();
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
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
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    
    
}
