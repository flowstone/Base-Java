package org.xueyao.homework;
/**
 * 1.��ʦ��Teacher
        ����:
            ����name
            ����age
            ��������content
        ��Ϊ:
            �Է�
            ����
 * @author Yao Xue
 * @date Jul 3, 2017 5:17:00 PM
 */
public class Teacher {
    private String name;
    private int age;
    private String content;
    
    public Teacher() {}
    public Teacher(String name, int age, String content) {
        this.name = name;
        this.age = age;
        this.content = content;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public String getContent() {
        return content;
    }
    
    public void eat() {
        System.out.println("����Ϊ"+age+"��"+name+"��ʦ���ڳԷ�....");
    }
    
    public void lesson() {
        System.out.println("����Ϊ"+age+"��"+name+"��ʦ���ڿ��ܵĽ���"+content+"��֪ʶ........");
    }
    
}
