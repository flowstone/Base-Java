package me.xueyao.work08;
/**
 * @author Yao Xue
 * @date Jul 25, 2017 8:53:58 PM
 */
public class Person {
    private String name;
    private String gender;
    private int age;
    private String qq;
    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Person(String name, String gender, int age, String qq) {
        super();
        this.name = name;
        this.gender = gender;
        this.age = age;
        boolean matches = qq.matches("[1-9][0-9]{4,11}");
        if (matches) {
            System.out.println("QQ号码合法");
            this.qq = qq;
        } else {
            System.out.println("QQ号码不合法");
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String isGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getQq() {
        return qq;
    }
    public void setQq(String qq) {
        boolean matches = qq.matches("[1-9][0-9]{4,11}");
        if (matches) {
            System.out.println("QQ号码合法");
            this.qq = qq;
        } else {
            System.out.println("QQ号码不合法");
        }
        
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String str = "姓名:"+name+" ,性别："+gender+" ,年龄："+age+" ,qq号："+qq;
        return str;
    }
}
